package com.example.ydsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.example.ydsapp.data.FeynmanDataProvider
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
                    primary = Color(0xFF64B5F6),
                    secondary = Color(0xFF81C784),
                    background = Color(0xFF121212),
                    surface = Color(0xFF1E1E1E),
                    error = Color(0xFFE57373)
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
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Text("📊", fontSize = 20.sp) },
                    label = { Text("Panel") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Text("📝", fontSize = 20.sp) },
                    label = { Text("Kartlar") }
                )
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Text("📚", fontSize = 20.sp) },
                    label = { Text("Dersler") }
                )
                NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 },
                    icon = { Text("❓", fontSize = 20.sp) },
                    label = { Text("Sorular") }
                )
                NavigationBarItem(
                    selected = selectedTab == 4,
                    onClick = { selectedTab = 4 },
                    icon = { Text("🧠", fontSize = 20.sp) },
                    label = { Text("Feynman") }
                )
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedTab) {
                0 -> DashboardScreen(viewModel) { tabIndex -> selectedTab = tabIndex }
                1 -> ActiveRecallScreen(viewModel)
                2 -> LessonsScreen()
                3 -> PracticeScreen(viewModel)
                4 -> FeynmanScreen(viewModel)
            }
        }
    }
}

@Composable
fun DashboardScreen(viewModel: MainViewModel, navigateToTab: (Int) -> Unit) {
    val totalQuizzes by viewModel.quizAttemptsCount.collectAsState(initial = 0)
    val correctQuizzes by viewModel.correctAttemptsCount.collectAsState(initial = 0)
    val feynmanList by viewModel.feynmanSubmissions.collectAsState(initial = emptyList())
    val currentCard by viewModel.currentCard.collectAsState()
    val targetScore by viewModel.targetScore.collectAsState()
    var showGoalDialog by remember { mutableStateOf(false) }

    if (targetScore == 0 || showGoalDialog) {
        AlertDialog(
            onDismissRequest = { if (targetScore != 0) showGoalDialog = false },
            title = { Text("🎯 Hedef YDS Puanınızı Seçin", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("Öğrenme algoritmanızı ve günlük çalışma temponuzu seçtiğiniz puana göre özelleştireceğiz.", fontSize = 14.sp)
                    Button(
                        onClick = { viewModel.setTargetScore(70); showGoalDialog = false },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF64B5F6))
                    ) { Text("70+ Puan (Temel Akademik Seviye)") }
                    Button(
                        onClick = { viewModel.setTargetScore(80); showGoalDialog = false },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF81C784))
                    ) { Text("80+ Puan (İleri Akademik Seviye)") }
                    Button(
                        onClick = { viewModel.setTargetScore(90); showGoalDialog = false },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFB74D))
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
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        if (targetScore > 0) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text("🎯 Hedef Profiliniz: YDS $targetScore+ Puan", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = MaterialTheme.colorScheme.primary)
                        val recText = when (targetScore) {
                            70 -> "Günlük Hedef: 15 Kelime & 5 Soru"
                            80 -> "Günlük Hedef: 25 Kelime & 10 Soru"
                            else -> "Günlük Hedef: 40 Kelime, 20 Soru & Feynman"
                        }
                        Text(recText, fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                    OutlinedButton(onClick = { showGoalDialog = true }) {
                        Text("Değiştir")
                    }
                }
            }
        }

        // Streak Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("🔥", fontSize = 40.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text("Çalışma Serisi", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    Text("Her gün çalışarak seriyi devam ettir!", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 14.sp)
                }
            }
        }

        // Stats Dashboard
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Card(
                modifier = Modifier.weight(1f),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Kelime Kartı", fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(if (currentCard != null) "Tekrar Var" else "Tamamlandı", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = if (currentCard != null) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary)
                }
            }

            Card(
                modifier = Modifier.weight(1f),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Çözülen Soru", fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("$totalQuizzes Soru", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    if (totalQuizzes > 0) {
                        Text("Doğru: %${(correctQuizzes.toFloat() / totalQuizzes.toFloat() * 100).toInt()}", fontSize = 12.sp, color = MaterialTheme.colorScheme.secondary)
                    }
                }
            }

            Card(
                modifier = Modifier.weight(1f),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Feynman Anlatımı", fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("${feynmanList.size} Konu", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        // Quick Actions
        Text("Hızlı Başlat", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = MaterialTheme.colorScheme.primary)

        Button(
            onClick = { navigateToTab(1) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text("Kelime Çalışmaya Başla (Active Recall)")
        }

        Button(
            onClick = { navigateToTab(3) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
        ) {
            Text("YDS Pratik Soruları Çöz")
        }

        Button(
            onClick = { navigateToTab(4) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
        ) {
            Text("Feynman Anlatımı Yap")
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
            Text("🎉 Harika! Bugünlük tüm tekrarlarını tamamladın.", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(16.dp))
            Text("Yarın yeni kelimelerle çalışmaya devam edebilirsin.", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant, textAlign = TextAlign.Center)
        } else {
            val card = currentCard!!
            
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .clickable { isRevealed = true },
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = card.word, fontSize = 36.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
                    
                    if (isRevealed) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(text = card.translation, fontSize = 24.sp, color = MaterialTheme.colorScheme.secondary, fontWeight = FontWeight.SemiBold)
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "\"${card.exampleSentence}\"",
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Italic,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "Eş Anlamlılar: ${card.synonyms}", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    } else {
                        Spacer(modifier = Modifier.height(48.dp))
                        Text("Anlamını görmek için dokun", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            
            if (isRevealed) {
                Text("Cevabı hatırlamakta ne kadar zorlandın?", fontWeight = FontWeight.Medium, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { viewModel.submitReview(0) },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error),
                        modifier = Modifier.weight(1f).padding(horizontal = 4.dp)
                    ) {
                        Text("Bilemedim")
                    }
                    Button(
                        onClick = { viewModel.submitReview(3) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFB74D)),
                        modifier = Modifier.weight(1f).padding(horizontal = 4.dp)
                    ) {
                        Text("Zorlandım")
                    }
                    Button(
                        onClick = { viewModel.submitReview(5) },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary),
                        modifier = Modifier.weight(1f).padding(horizontal = 4.dp)
                    ) {
                        Text("Kolaydı")
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
            title = { Text(activeLesson!!.title, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary) },
            text = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(activeLesson!!.content, fontSize = 15.sp, modifier = Modifier.padding(bottom = 16.dp))
                }
            },
            confirmButton = {
                Button(onClick = { activeLesson = null }) {
                    Text("Dersi Bitir")
                }
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("YDS Konu Anlatımları", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(8.dp))
        Text("YDS'de en çok çıkan dil bilgisi kurallarını ve yapılarını sırasıyla çalışın.", color = MaterialTheme.colorScheme.onSurfaceVariant)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(LessonDataProvider.lessons) { lesson ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { activeLesson = lesson },
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(lesson.title, fontWeight = FontWeight.Bold, fontSize = 18.sp, color = MaterialTheme.colorScheme.primary)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(lesson.summary, fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Spacer(modifier = Modifier.height(12.dp))
                        Text("Çalışmaya Başla ➔", fontWeight = FontWeight.SemiBold, fontSize = 14.sp, color = MaterialTheme.colorScheme.secondary)
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

    val question = QuestionDataProvider.questions[currentQuestionIndex]

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
            Text("YDS Pratik Soruları", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
            Text("Soru: ${currentQuestionIndex + 1} / ${QuestionDataProvider.questions.size}", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
        
        Spacer(modifier = Modifier.height(16.dp))

        // Question text
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Text(
                text = question.questionText,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(16.dp),
                lineHeight = 24.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Options list
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            question.options.forEachIndexed { index, optionText ->
                val isSelected = selectedOptionIndex == index
                val isCorrect = question.correctOptionIndex == index
                
                val buttonColor = when {
                    hasAnswered && isCorrect -> MaterialTheme.colorScheme.secondary
                    hasAnswered && isSelected && !isCorrect -> MaterialTheme.colorScheme.error
                    isSelected -> MaterialTheme.colorScheme.primary
                    else -> MaterialTheme.colorScheme.surface
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(enabled = !hasAnswered) { viewModel.selectQuizOption(index) },
                    colors = CardDefaults.cardColors(containerColor = buttonColor)
                ) {
                    Text(
                        text = optionText,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 16.sp,
                        fontWeight = if (isSelected || (hasAnswered && isCorrect)) FontWeight.Bold else FontWeight.Normal
                    )
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
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Cevabı Onayla")
            }
        } else {
            // Explanation box
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = if (selectedOptionIndex == question.correctOptionIndex) "✅ Doğru Cevap!" else "❌ Yanlış Cevap!",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = if (selectedOptionIndex == question.correctOptionIndex) MaterialTheme.colorScheme.secondary else MaterialTheme.colorScheme.error
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = question.explanation, fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    if (currentQuestionIndex < QuestionDataProvider.questions.size - 1) {
                        viewModel.nextQuizQuestion()
                    } else {
                        viewModel.resetQuiz()
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(if (currentQuestionIndex < QuestionDataProvider.questions.size - 1) "Sonraki Soru" else "Testi Sıfırla ve Yeniden Başlat")
            }
        }
    }
}

@Composable
fun FeynmanScreen(viewModel: MainViewModel) {
    val challenges = FeynmanDataProvider.challenges
    var selectedChallengeIndex by remember { mutableStateOf(0) }
    var currentStepIndex by remember { mutableStateOf(0) }
    var userResponse by remember { mutableStateOf("") }
    var stepFeedback by remember { mutableStateOf<String?>(null) }
    var isStepSuccess by remember { mutableStateOf(false) }
    var totalEarnedScore by remember { mutableStateOf(0) }
    var isChallengeCompleted by remember { mutableStateOf(false) }

    val challenge = challenges[selectedChallengeIndex]
    val currentStep = challenge.steps.getOrNull(currentStepIndex)
    val feynmanList by viewModel.feynmanSubmissions.collectAsState(initial = emptyList())
    val scrollState = rememberScrollState()

    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("🧑‍🎓 Feynman Anlatım Koçu", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        Text(
            "Konuyu seçin ve ekrandaki meraklı lise öğrencisinin sorularını kendi sözcüklerinizle yanıtlayın. Yerel doğrulama motoru cevaplarınızı anında analiz edecek!",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )

        Box(modifier = Modifier.fillMaxWidth()) {
            OutlinedButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
                Text("Konu: ${challenge.topicName} ▾")
            }
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                challenges.forEachIndexed { idx, ch ->
                    DropdownMenuItem(
                        text = { Text(ch.topicName) },
                        onClick = {
                            selectedChallengeIndex = idx
                            currentStepIndex = 0
                            userResponse = ""
                            stepFeedback = null
                            isStepSuccess = false
                            totalEarnedScore = 0
                            isChallengeCompleted = false
                            expanded = false
                        }
                    )
                }
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Text(
                text = challenge.introScenario,
                modifier = Modifier.padding(14.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        if (!isChallengeCompleted && currentStep != null) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("Mülakat Adımı: ${currentStepIndex + 1} / ${challenge.steps.size}", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
                        Text(currentStep.hint, fontSize = 12.sp, color = MaterialTheme.colorScheme.secondary)
                    }

                    Text(currentStep.studentQuestion, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)

                    OutlinedTextField(
                        value = userResponse,
                        onValueChange = { userResponse = it },
                        modifier = Modifier.fillMaxWidth().height(120.dp),
                        label = { Text("Öğrenciye cevabınızı yazın...") },
                        placeholder = { Text("Örn: 'Bak Ali, aslında bu kural şu anlama geliyor...'") }
                    )

                    if (stepFeedback != null) {
                        Card(
                            colors = CardDefaults.cardColors(containerColor = if (isStepSuccess) Color(0xFFE8F5E9) else Color(0xFFFFEBEE)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = stepFeedback!!,
                                modifier = Modifier.padding(12.dp),
                                color = if (isStepSuccess) Color(0xFF2E7D32) else Color(0xFFC62828),
                                fontWeight = FontWeight.Medium,
                                fontSize = 14.sp
                            )
                        }
                    }

                    if (!isStepSuccess) {
                        Button(
                            onClick = {
                                if (userResponse.isNotBlank()) {
                                    val lowerText = userResponse.lowercase()
                                    val matchCount = currentStep.requiredKeywords.count { lowerText.contains(it.lowercase()) }
                                    if (matchCount >= 1) {
                                        isStepSuccess = true
                                        stepFeedback = "✅ " + currentStep.successFeedback
                                        totalEarnedScore += (100 / challenge.steps.size)
                                    } else {
                                        isStepSuccess = false
                                        stepFeedback = "⚠️ " + currentStep.missingKeywordFeedback
                                    }
                                }
                            },
                            enabled = userResponse.isNotBlank(),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Cevabı Doğrula")
                        }
                    } else {
                        Button(
                            onClick = {
                                if (currentStepIndex < challenge.steps.size - 1) {
                                    currentStepIndex++
                                    userResponse = ""
                                    stepFeedback = null
                                    isStepSuccess = false
                                } else {
                                    isChallengeCompleted = true
                                    viewModel.submitFeynman(challenge.topicName, "Mülakat başarıyla tamamlandı. Kazanılan Puan: $totalEarnedScore", totalEarnedScore)
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                        ) {
                            Text(if (currentStepIndex < challenge.steps.size - 1) "Sonraki Öğrenci Sorusuna Geç ➔" else "🎉 Testi Tamamla ve Sonucu Kaydet")
                        }
                    }
                }
            }
        } else if (isChallengeCompleted) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
            ) {
                Column(modifier = Modifier.padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("🏆", fontSize = 50.sp)
                    Text("Tebrikler! Feynman Mülakatını Geçtiniz", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color(0xFF1B5E20), textAlign = TextAlign.Center)
                    Text("Öğrenci Ali bu konuyu sayenizde tamamen kavradı. Kazanılan Başarı Puanı: $totalEarnedScore / 100", fontSize = 14.sp, textAlign = TextAlign.Center, color = Color(0xFF2E7D32))
                    Button(
                        onClick = {
                            currentStepIndex = 0
                            userResponse = ""
                            stepFeedback = null
                            isStepSuccess = false
                            totalEarnedScore = 0
                            isChallengeCompleted = false
                        }
                    ) { Text("Yeniden Test Et") }
                }
            }
        }

        if (feynmanList.isNotEmpty()) {
            Spacer(modifier = Modifier.height(16.dp))
            Divider(color = MaterialTheme.colorScheme.surfaceVariant)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Geçmiş Feynman Mülakat Sonuçlarınız", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = MaterialTheme.colorScheme.primary, modifier = Modifier.align(Alignment.Start))
            
            feynmanList.forEach { submission ->
                val dateStr = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()).format(Date(submission.date))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(submission.topic, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                            Text("Puan: ${submission.score}/100", fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.secondary)
                        }
                        Text(dateStr, fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
        }
    }
}
