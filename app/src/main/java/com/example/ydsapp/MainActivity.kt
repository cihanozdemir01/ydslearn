package com.example.ydsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ydsapp.ui.MainViewModel
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var showUpdateDialog by remember { mutableStateOf(false) }
                    var updateInfo by remember { mutableStateOf<UpdateInfo?>(null) }
                    var isDownloading by remember { mutableStateOf(false) }
                    var downloadProgress by remember { mutableStateOf(0f) }
                    val context = LocalContext.current
                    val coroutineScope = rememberCoroutineScope()

                    LaunchedEffect(Unit) {
                        val info = UpdateChecker.checkForUpdate(context)
                        if (info.isAvailable) {
                            updateInfo = info
                            showUpdateDialog = true
                        }
                    }

                    if (showUpdateDialog && updateInfo != null) {
                        AlertDialog(
                            onDismissRequest = { if (!isDownloading) showUpdateDialog = false },
                            title = { Text("Güncelleme Mevcut") },
                            text = {
                                Column {
                                    Text("Yeni bir sürüm (${updateInfo!!.latestVersion}) mevcut. İndirmek ve kurmak istiyor musunuz?")
                                    if (isDownloading) {
                                        Spacer(modifier = Modifier.height(16.dp))
                                        LinearProgressIndicator(
                                            progress = downloadProgress,
                                            modifier = Modifier.fillMaxWidth()
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "İndiriliyor: %${(downloadProgress * 100).toInt()}",
                                            style = MaterialTheme.typography.bodySmall
                                        )
                                    }
                                }
                            },
                            confirmButton = {
                                Button(
                                    onClick = {
                                        if (!isDownloading) {
                                            isDownloading = true
                                            coroutineScope.launch {
                                                val success = UpdateChecker.downloadAndInstallApk(context, updateInfo!!.downloadUrl) { progress ->
                                                    downloadProgress = progress
                                                }
                                                isDownloading = false
                                                if (success) {
                                                    showUpdateDialog = false
                                                }
                                            }
                                        }
                                    },
                                    enabled = !isDownloading
                                ) {
                                    Text(if (isDownloading) "İndiriliyor..." else "Güncelle")
                                }
                            },
                            dismissButton = {
                                if (!isDownloading) {
                                    TextButton(onClick = { showUpdateDialog = false }) {
                                        Text("Daha Sonra")
                                    }
                                }
                            }
                        )
                    }

                    val viewModel: MainViewModel = viewModel()
                    MainScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel) {
    var selectedTab by remember { mutableStateOf(0) }
    
    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Text("📝") },
                    label = { Text("Active Recall") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Text("🧠") },
                    label = { Text("Feynman") }
                )
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedTab) {
                0 -> ActiveRecallScreen(viewModel)
                1 -> FeynmanScreen()
            }
        }
    }
}

@Composable
fun ActiveRecallScreen(viewModel: MainViewModel) {
    val currentCard by viewModel.currentCard.collectAsState()
    var isRevealed by remember { mutableStateOf(false) }

    LaunchedEffect(currentCard) {
        isRevealed = false
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (currentCard == null) {
            Text("Harika! Bugünlük tüm tekrarlarını tamamladın.", fontSize = 18.sp, textAlign = TextAlign.Center)
        } else {
            val card = currentCard!!
            
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clickable { isRevealed = true },
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = card.word, fontSize = 32.sp, fontWeight = FontWeight.Bold)
                    
                    if (isRevealed) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = card.translation, fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "\"${card.exampleSentence}\"", fontSize = 16.sp, textAlign = TextAlign.Center, modifier = Modifier.padding(horizontal = 16.dp))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = "Eş Anlamlılar: ${card.synonyms}", fontSize = 14.sp, color = MaterialTheme.colorScheme.secondary)
                    } else {
                        Spacer(modifier = Modifier.height(32.dp))
                        Text("Cevabı görmek için dokun", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            
            if (isRevealed) {
                Text("Ne kadar zorlandın?", fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(onClick = { viewModel.submitReview(0) }, colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)) {
                        Text("Bilemedim")
                    }
                    Button(onClick = { viewModel.submitReview(3) }) {
                        Text("Zor")
                    }
                    Button(onClick = { viewModel.submitReview(5) }, colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)) {
                        Text("Kolay")
                    }
                }
            }
        }
    }
}

@Composable
fun FeynmanScreen() {
    var text by remember { mutableStateOf("") }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Feynman Tekniği", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "Günün Görevi: Noun Clause nedir? Hiç İngilizce bilmeyen birine nasıl anlatırsın? (Sade ve anlaşılır bir dille açıkla)",
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            label = { Text("Açıklamanız...") }
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = { text = "" }) {
            Text("Gönder ve Tamamla")
        }
    }
}
