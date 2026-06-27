package com.example.ydsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.animation.animateColorAsState
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ydsapp.data.Lesson
import com.example.ydsapp.data.LessonDataProvider
import com.example.ydsapp.data.Question
import com.example.ydsapp.data.QuestionDataProvider
import com.example.ydsapp.ui.MainViewModel
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colorScheme = darkColorScheme(
                    primary = Color(0xFF8B5CF6),
                    secondary = Color(0xFF10B981),
                    background = Color(0xFF0A0A0F),
                    surface = Color(0xFF151522),
                    error = Color(0xFFEF4444)
                )
            ) {
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
            NavigationBar(
                containerColor = Color(0xFF0F0F15),
                tonalElevation = 8.dp
            ) {
                val navItems = listOf(
                    Triple(0, "📊", "Panel"),
                    Triple(1, "🧠", "Kartlar"),
                    Triple(2, "📚", "Dersler"),
                    Triple(3, "✍️", "Sorular")
                )
                navItems.forEach { (tabIndex, emoji, label) ->
                    NavigationBarItem(
                        selected = selectedTab == tabIndex,
                        onClick = { selectedTab = tabIndex },
                        icon = { Text(emoji, fontSize = 20.sp) },
                        label = { Text(label, fontSize = 12.sp, fontWeight = if (selectedTab == tabIndex) FontWeight.Bold else FontWeight.Normal) },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color(0xFF8B5CF6),
                            selectedTextColor = Color(0xFF8B5CF6),
                            indicatorColor = Color(0xFF8B5CF6).copy(alpha = 0.15f),
                            unselectedIconColor = Color(0xFF9E9EAF),
                            unselectedTextColor = Color(0xFF9E9EAF)
                        )
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedTab) {
                0 -> DashboardScreen(viewModel) { tabIndex -> selectedTab = tabIndex }
                1 -> ActiveRecallScreen(viewModel)
                2 -> LessonsScreen()
                3 -> PracticeScreen(viewModel)
            }
        }
    }
}

@Composable
fun CircularProgressCard(
    title: String,
    current: Int,
    total: Int,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
        border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(title, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = Color(0xFF9E9EAF))
                Spacer(modifier = Modifier.height(8.dp))
                Text("$current / $total", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Spacer(modifier = Modifier.height(4.dp))
                Text(subtitle, fontSize = 12.sp, color = Color(0xFF10B981), fontWeight = FontWeight.Medium)
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(60.dp)
            ) {
                val progress = if (total > 0) current.toFloat() / total else 0f
                CircularProgressIndicator(
                    progress = 1f,
                    strokeWidth = 6.dp,
                    color = Color(0xFF2E2E4A),
                    modifier = Modifier.fillMaxSize()
                )
                CircularProgressIndicator(
                    progress = progress,
                    strokeWidth = 6.dp,
                    color = Color(0xFF8B5CF6),
                    modifier = Modifier.fillMaxSize()
                )
                Text(
                    text = "${(progress * 100).toInt()}%",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun DashboardScreen(viewModel: MainViewModel, navigateToTab: (Int) -> Unit) {
    val totalQuizzes by viewModel.quizAttemptsCount.collectAsState(initial = 0)
    val correctQuizzes by viewModel.correctAttemptsCount.collectAsState(initial = 0)
    val currentCard by viewModel.currentCard.collectAsState()
    val targetScore by viewModel.targetScore.collectAsState()
    val learnedWords by viewModel.learnedWordsCount.collectAsState(initial = 0)
    val totalWords by viewModel.totalWordsCount.collectAsState(initial = 0)
    var showGoalDialog by remember { mutableStateOf(false) }

    if (targetScore == 0 || showGoalDialog) {
        AlertDialog(
            onDismissRequest = { if (targetScore != 0) showGoalDialog = false },
            title = { Text("🎯 Hedef YDS Puanınızı Seçin", fontWeight = FontWeight.Bold, color = Color(0xFF8B5CF6)) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("Öğrenme algoritmanızı ve günlük çalışma temponuzu seçtiğiniz puana göre özelleştireceğiz.", fontSize = 14.sp)
                    Button(
                        onClick = { viewModel.setTargetScore(70); showGoalDialog = false },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B5CF6))
                    ) { Text("70+ Puan (Temel Akademik Seviye)") }
                    Button(
                        onClick = { viewModel.setTargetScore(80); showGoalDialog = false },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6366F1))
                    ) { Text("80+ Puan (İleri Akademik Seviye)") }
                    Button(
                        onClick = { viewModel.setTargetScore(90); showGoalDialog = false },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF10B981))
                    ) { Text("90+ Puan (Zirve / C1-C2 Seviyesi)") }
                }
            },
            confirmButton = {}
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "YDS Çalışma Ortağım",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF8B5CF6),
            modifier = Modifier.padding(vertical = 8.dp)
        )

        if (targetScore > 0) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
                shape = RoundedCornerShape(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text("🎯 Hedef Profiliniz: YDS $targetScore+ Puan", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF8B5CF6))
                        val recText = when (targetScore) {
                            70 -> "Günlük Hedef: 15 Kelime & 5 Soru"
                            80 -> "Günlük Hedef: 25 Kelime & 10 Soru"
                            else -> "Günlük Hedef: 40 Kelime & 20 Soru"
                        }
                        Text(recText, fontSize = 13.sp, color = Color(0xFF9E9EAF))
                    }
                    OutlinedButton(
                        onClick = { showGoalDialog = true },
                        border = BorderStroke(1.dp, Color(0xFF8B5CF6))
                    ) {
                        Text("Değiştir", color = Color(0xFF8B5CF6))
                    }
                }
            }
        }

        // Streak Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color(0xFF451A03))
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Brush.linearGradient(
                            listOf(Color(0xFFD97706), Color(0xFFEF4444))
                        )
                    )
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("🔥", fontSize = 36.sp)
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text("Çalışma Serisi", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color.White)
                        Text("Her gün çalışarak seriyi devam ettir!", color = Color(0xFFFFE4E6), fontSize = 13.sp)
                    }
                }
            }
        }

        // Word Card Stats (Circular)
        CircularProgressCard(
            title = "Kelime Kartları Gelişimi",
            current = learnedWords,
            total = totalWords,
            subtitle = if (currentCard != null) "Bugünlük tamamlanacak tekrarların var" else "Bugünlük tüm kelimeler tamamlandı!"
        )

        // Practice Stats Grid
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
            border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
            shape = RoundedCornerShape(16.dp)
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Çözülen Soru Pratiği", fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = Color(0xFF9E9EAF))
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("$totalQuizzes / ${QuestionDataProvider.questions.size} Soru", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Spacer(modifier = Modifier.height(4.dp))
                    if (totalQuizzes > 0) {
                        Text("Doğru Oranı: %${(correctQuizzes.toFloat() / totalQuizzes.toFloat() * 100).toInt()}", fontSize = 12.sp, color = Color(0xFF10B981), fontWeight = FontWeight.Medium)
                    } else {
                        Text("Henüz soru çözülmedi", fontSize = 12.sp, color = Color(0xFF9E9EAF))
                    }
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.size(60.dp)
                ) {
                    val progress = if (totalQuizzes > 0) correctQuizzes.toFloat() / totalQuizzes else 0f
                    CircularProgressIndicator(
                        progress = 1f,
                        strokeWidth = 6.dp,
                        color = Color(0xFF2E2E4A),
                        modifier = Modifier.fillMaxSize()
                    )
                    CircularProgressIndicator(
                        progress = progress,
                        strokeWidth = 6.dp,
                        color = Color(0xFF10B981),
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "🎯",
                        fontSize = 20.sp
                    )
                }
            }
        }

        // Quick Actions
        Text("Hızlı Başlat", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color(0xFF8B5CF6))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .clickable { navigateToTab(1) },
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, Color(0xFF2E2E4A))
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            Brush.linearGradient(
                                listOf(Color(0xFF8B5CF6), Color(0xFF6366F1))
                            )
                        )
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(100.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column {
                        Text("🧠", fontSize = 28.sp)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Kelime Kartları", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.White)
                        Text("Active Recall", fontSize = 12.sp, color = Color(0xFFE0E7FF))
                    }
                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .clickable { navigateToTab(3) },
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, Color(0xFF2E2E4A))
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            Brush.linearGradient(
                                listOf(Color(0xFF06B6D4), Color(0xFF10B981))
                            )
                        )
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(100.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column {
                        Text("✍️", fontSize = 28.sp)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Soru Çözümü", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.White)
                        Text("YDS Soru Havuzu", fontSize = 12.sp, color = Color(0xFFECFDF5))
                    }
                }
            }
        }
    }
}

@Composable
fun ActiveRecallScreen(viewModel: MainViewModel) {
    val currentCard by viewModel.currentCard.collectAsState()
    val isFreeStudyMode by viewModel.isFreeStudyMode.collectAsState()
    val dailySessionCount by viewModel.dailySessionCount.collectAsState()
    var isRevealed by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(currentCard) {
        isRevealed = false
        selectedOption = null
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Mode Selector Toggle (Günlük Tekrar vs Serbest Çalışma)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF151522))
                .border(1.dp, Color(0xFF2E2E4A), RoundedCornerShape(16.dp))
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (!isFreeStudyMode) Color(0xFF8B5CF6) else Color.Transparent)
                    .clickable { viewModel.setFreeStudyMode(false) }
                    .padding(vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "📅 Günlük (40)",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (isFreeStudyMode) Color(0xFF8B5CF6) else Color.Transparent)
                    .clickable { viewModel.setFreeStudyMode(true) }
                    .padding(vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "📚 Serbest Çalışma",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        if (!isFreeStudyMode) {
            val countDisplay = dailySessionCount.coerceAtMost(40)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "GÜNLÜK HEDEF İLERLEMESİ",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF9E9EAF)
                )
                Text(
                    text = "$countDisplay / 40 Kelime",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF10B981)
                )
            }
        }

        if (currentCard == null || (!isFreeStudyMode && dailySessionCount >= 40)) {
            Spacer(modifier = Modifier.height(32.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
                border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("🎉", fontSize = 48.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = if (!isFreeStudyMode) "Tebrikler! Bugünlük 40 kelimelik çalışma hedefine ulaştın." else "Serbest çalışma havuzundaki kartlar tamamlandı.",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = if (!isFreeStudyMode) "Serbest Çalışma moduna geçerek pratik yapmaya devam edebilirsin!" else "Tebrikler!",
                        fontSize = 14.sp,
                        color = Color(0xFF9E9EAF),
                        textAlign = TextAlign.Center
                    )
                }
            }
        } else {
            val card = currentCard!!
            
            val options = remember(card.id) {
                val isConjunction = card.synonyms.contains("Bağlaç") || card.synonyms.contains("[")
                val distractorPool = if (isConjunction) {
                    listOf(
                        "-e rağmen", "Oysa, -e karşın", "Aksi takdirde, Yoksa", 
                        "Sonuç olarak, Bu nedenle", "-mek için, amacıyla", "Bu yüzden, Böylece",
                        "Dahası, Üstelik", "Şartıyla, Eğer", "Nedeniyle, yüzünden", "Aksine, Tam tersine"
                    )
                } else {
                    listOf(
                        "Geliştirmek, Artırmak", "Önlemek, Engellemek", "Kötüleşmek, Bozulmak", 
                        "Azaltmak, Hafifletmek", "Desteklemek, Savunmak", "Vurgulamak, Öne çıkarmak",
                        "Neden olmak, Yol açmak", "Kaçınmak, Sakınmak", "Sürdürmek, Devam ettirmek"
                    )
                }.filter { it != card.translation }
                val wrong = distractorPool.shuffled().first()
                listOf(card.translation, wrong).shuffled()
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
                border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = if (isFreeStudyMode) "SERBEST ÇALIŞMA HAVUZU" else "GÜNLÜK YDS KELİME KARTI",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF8B5CF6),
                        letterSpacing = 1.5.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = card.word,
                        fontSize = 34.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    
                    Spacer(modifier = Modifier.height(20.dp))

                    if (!isRevealed) {
                        Text(
                            text = "Doğru Türkçe Karşılığını Seçin:",
                            fontSize = 13.sp,
                            color = Color(0xFFC084FC),
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        
                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            options.forEach { optionText ->
                                Button(
                                    onClick = {
                                        selectedOption = optionText
                                        isRevealed = true
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF232338)),
                                    border = BorderStroke(1.dp, Color(0xFF3B3B5E)),
                                    shape = RoundedCornerShape(14.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = optionText,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color.White,
                                        modifier = Modifier.padding(vertical = 4.dp),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                        }
                    } else {
                        val isCorrectChoice = selectedOption == card.translation
                        
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (isCorrectChoice) Color(0xFF10B981).copy(alpha = 0.15f) else Color(0xFFEF4444).copy(alpha = 0.15f))
                                .padding(12.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = if (isCorrectChoice) "🎉 Doğru Tahmin!" else "❌ Yanlış Tahmin!",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isCorrectChoice) Color(0xFF34D399) else Color(0xFFF87171)
                            )
                        }

                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = card.translation,
                            fontSize = 24.sp,
                            color = Color(0xFF10B981),
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(14.dp))
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF1C1C2E))
                                .padding(12.dp)
                        ) {
                            Text(
                                text = "“${card.exampleSentence}”",
                                fontSize = 14.sp,
                                fontStyle = FontStyle.Italic,
                                color = Color(0xFFD1D1F7),
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Detay / Eş Anlam: ${card.synonyms}",
                            fontSize = 13.sp,
                            color = Color(0xFF9E9EAF),
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            if (isRevealed) {
                Text(
                    text = "Bu kelime durumunu güncelle:",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    color = Color(0xFFE2E2E9)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { viewModel.submitReview(0) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444)),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Bilemedim", fontWeight = FontWeight.Bold, fontSize = 13.sp, color = Color.White)
                    }
                    Button(
                        onClick = { viewModel.submitReview(10) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6B7280)),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1.1f)
                    ) {
                        Text("Artık Sorma", fontWeight = FontWeight.Bold, fontSize = 13.sp, color = Color.White)
                    }
                    Button(
                        onClick = { viewModel.submitReview(5) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF10B981)),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Kolaydı", fontWeight = FontWeight.Bold, fontSize = 13.sp, color = Color.White)
                    }
                }
            }
        }
    }
}

@Composable
fun LessonsScreen() {
    var activeLesson by remember { mutableStateOf<Lesson?>(null) }

    if (activeLesson != null) {
        // Fullscreen Lesson Reader Dialog
        AlertDialog(
            onDismissRequest = { activeLesson = null },
            containerColor = Color(0xFF151522),
            title = { 
                Text(
                    text = activeLesson!!.title, 
                    fontSize = 20.sp, 
                    fontWeight = FontWeight.Bold, 
                    color = Color(0xFF8B5CF6)
                ) 
            },
            text = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = activeLesson!!.content, 
                        fontSize = 15.sp, 
                        color = Color(0xFFE2E2E9),
                        lineHeight = 22.sp,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = { activeLesson = null },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B5CF6)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Dersi Bitir", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "YDS Konu Anlatımları", 
            fontSize = 24.sp, 
            fontWeight = FontWeight.Bold, 
            color = Color(0xFF8B5CF6)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "YDS'de en çok çıkan dil bilgisi kurallarını ve yapılarını sırasıyla çalışın.", 
            color = Color(0xFF9E9EAF)
        )
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(LessonDataProvider.lessons) { lesson ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { activeLesson = lesson },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
                    border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = lesson.title, 
                                fontWeight = FontWeight.Bold, 
                                fontSize = 18.sp, 
                                color = Color.White,
                                modifier = Modifier.weight(1f)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFF8B5CF6).copy(alpha = 0.15f))
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    text = "Ders",
                                    color = Color(0xFFC084FC),
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = lesson.summary, 
                            fontSize = 14.sp, 
                            color = Color(0xFF9E9EAF),
                            lineHeight = 20.sp
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Çalışmaya Başla", 
                                fontWeight = FontWeight.SemiBold, 
                                fontSize = 14.sp, 
                                color = Color(0xFF10B981)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "➔", 
                                fontWeight = FontWeight.Bold, 
                                fontSize = 14.sp, 
                                color = Color(0xFF10B981)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PracticeScreen(viewModel: MainViewModel) {
    val currentQuestionIndex by viewModel.currentQuestionIndex.collectAsState()
    val selectedOptionIndex by viewModel.selectedOptionIndex.collectAsState()
    val hasAnswered by viewModel.hasAnswered.collectAsState()
    val selectedCategory by viewModel.selectedCategory.collectAsState()

    val filteredQuestions = if (selectedCategory == "Tümü") {
        QuestionDataProvider.questions
    } else {
        QuestionDataProvider.questions.filter { it.category == selectedCategory }
    }

    val question = filteredQuestions.getOrNull(currentQuestionIndex)
        ?: filteredQuestions.firstOrNull()
        ?: QuestionDataProvider.questions.first()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "YDS Soru Havuzu", 
                    fontSize = 20.sp, 
                    fontWeight = FontWeight.Bold, 
                    color = Color(0xFF8B5CF6)
                )
                Text(
                    text = "Toplam Banka: ${QuestionDataProvider.questions.size} Soru", 
                    fontSize = 12.sp, 
                    color = Color(0xFF9E9EAF)
                )
            }
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFF10B981).copy(alpha = 0.15f))
                    .border(1.dp, Color(0xFF10B981).copy(alpha = 0.3f), RoundedCornerShape(12.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "Soru: ${currentQuestionIndex + 1} / ${filteredQuestions.size}", 
                    fontSize = 13.sp, 
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF34D399)
                )
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))

        // Horizontally scrolling category chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val categories = listOf("Tümü", "Kelime Bilgisi", "Dil Bilgisi", "Bağlaçlar", "Edatlar", "Çeviri", "Diyalog")
            categories.forEach { cat ->
                CategoryChip(
                    text = cat,
                    isSelected = selectedCategory == cat,
                    onClick = { viewModel.setCategory(cat) }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Question text
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
            border = BorderStroke(1.dp, Color(0xFF2E2E4A)),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = question.questionText,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                modifier = Modifier.padding(18.dp),
                lineHeight = 26.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Options list
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            question.options.forEachIndexed { index, optionText ->
                val isSelected = selectedOptionIndex == index
                val isCorrect = question.correctOptionIndex == index
                
                val targetColor = when {
                    hasAnswered && isCorrect -> Color(0xFF10B981).copy(alpha = 0.15f)
                    hasAnswered && isSelected && !isCorrect -> Color(0xFFEF4444).copy(alpha = 0.15f)
                    isSelected -> Color(0xFF8B5CF6).copy(alpha = 0.20f)
                    else -> Color(0xFF151522)
                }
                
                val borderColor = when {
                    hasAnswered && isCorrect -> Color(0xFF10B981)
                    hasAnswered && isSelected && !isCorrect -> Color(0xFFEF4444)
                    isSelected -> Color(0xFF8B5CF6)
                    else -> Color(0xFF2E2E4A)
                }

                val animatedBgColor by animateColorAsState(targetValue = targetColor, label = "bgColor")
                val animatedBorderColor by animateColorAsState(targetValue = borderColor, label = "borderColor")

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(enabled = !hasAnswered) { viewModel.selectQuizOption(index) },
                    colors = CardDefaults.cardColors(containerColor = animatedBgColor),
                    border = BorderStroke(1.dp, animatedBorderColor),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = optionText,
                            modifier = Modifier.weight(1f),
                            fontSize = 16.sp,
                            color = when {
                                hasAnswered && isCorrect -> Color(0xFF34D399)
                                hasAnswered && isSelected && !isCorrect -> Color(0xFFF87171)
                                isSelected -> Color(0xFFC084FC)
                                else -> Color.White
                            },
                            fontWeight = if (isSelected || (hasAnswered && isCorrect)) FontWeight.Bold else FontWeight.Normal
                        )
                        
                        if (hasAnswered) {
                            if (isCorrect) {
                                Text("✅", fontSize = 18.sp)
                            } else if (isSelected) {
                                Text("❌", fontSize = 18.sp)
                            }
                        } else {
                            Box(
                                modifier = Modifier
                                    .size(20.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .border(
                                        width = if (isSelected) 2.dp else 1.dp,
                                        color = if (isSelected) Color(0xFF8B5CF6) else Color(0xFF4E4E7A),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .background(if (isSelected) Color(0xFF8B5CF6) else Color.Transparent),
                                contentAlignment = Alignment.Center
                            ) {
                                if (isSelected) {
                                    Box(
                                        modifier = Modifier
                                            .size(8.dp)
                                            .clip(RoundedCornerShape(4.dp))
                                            .background(Color.White)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        if (!hasAnswered) {
            Button(
                onClick = {
                    if (selectedOptionIndex != null) {
                        viewModel.setQuizAnswered(true)
                        val isCorrect = selectedOptionIndex == question.correctOptionIndex
                        viewModel.submitQuizAttempt(question.id, isCorrect)
                    }
                },
                enabled = selectedOptionIndex != null,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF8B5CF6),
                    disabledContainerColor = Color(0xFF2E2E4A)
                ),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Cevabı Onayla", 
                    color = if (selectedOptionIndex != null) Color.White else Color(0xFF9E9EAF),
                    fontWeight = FontWeight.Bold
                )
            }
        } else {
            // Explanation box
            val isCorrect = selectedOptionIndex == question.correctOptionIndex
            val glowColor = if (isCorrect) Color(0xFF10B981) else Color(0xFFEF4444)
            val correctOptionText = question.options.getOrNull(question.correctOptionIndex) ?: ""
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF151522)),
                border = BorderStroke(1.dp, glowColor.copy(alpha = 0.5f)),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(glowColor.copy(alpha = 0.05f), Color.Transparent)
                            )
                        )
                        .padding(16.dp)
                ) {
                    Text(
                        text = if (isCorrect) "🎉 TEBRİKLER! Doğru Cevap!" else "❌ YANLIŞ CEVAP!",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = glowColor
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Doğru Şık: $correctOptionText",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp,
                        color = Color(0xFF34D399)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Soru Açıklaması:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xFF8B5CF6)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = question.explanation, 
                        fontSize = 14.sp,
                        color = Color(0xFFE2E2E9),
                        lineHeight = 20.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    if (currentQuestionIndex < filteredQuestions.size - 1) {
                        viewModel.nextQuizQuestion()
                    } else {
                        viewModel.resetQuiz()
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B5CF6)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = if (currentQuestionIndex < filteredQuestions.size - 1) "Sonraki Soru" else "Testi Sıfırla ve Yeniden Başlat",
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun CategoryChip(text: String, isSelected: Boolean, onClick: () -> Unit) {
    val borderModifier = if (isSelected) {
        Modifier.border(1.dp, Brush.linearGradient(listOf(Color(0xFF8B5CF6), Color(0xFF6366F1))), RoundedCornerShape(16.dp))
    } else {
        Modifier.border(1.dp, Color(0xFF2E2E4A), RoundedCornerShape(16.dp))
    }
    
    val backgroundBrush = if (isSelected) {
        Brush.linearGradient(listOf(Color(0xFF8B5CF6).copy(alpha = 0.2f), Color(0xFF6366F1).copy(alpha = 0.2f)))
    } else {
        Brush.linearGradient(listOf(Color(0xFF151522), Color(0xFF151522)))
    }

    Box(
        modifier = Modifier
            .then(borderModifier)
            .clip(RoundedCornerShape(16.dp))
            .background(backgroundBrush)
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            color = if (isSelected) Color(0xFFC084FC) else Color(0xFF9E9EAF),
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


