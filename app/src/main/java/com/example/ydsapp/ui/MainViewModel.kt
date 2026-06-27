package com.example.ydsapp.ui

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ydsapp.data.AppDatabase
import com.example.ydsapp.data.Flashcard
import com.example.ydsapp.data.QuizAttempt
import com.example.ydsapp.data.FlashcardRepository
import com.example.ydsapp.data.YdsDao
import com.example.ydsapp.data.QuestionDataProvider
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FlashcardRepository
    private val ydsDao: YdsDao
    
    private val prefs = application.getSharedPreferences("yds_profile", Context.MODE_PRIVATE)
    
    private val _targetScore = MutableStateFlow(prefs.getInt("target_score", 0))
    val targetScore: StateFlow<Int> = _targetScore.asStateFlow()

    private val _currentCard = MutableStateFlow<Flashcard?>(null)
    val currentCard: StateFlow<Flashcard?> = _currentCard
    
    private val _isFreeStudyMode = MutableStateFlow(false)
    val isFreeStudyMode: StateFlow<Boolean> = _isFreeStudyMode.asStateFlow()

    private val _dailySessionCount = MutableStateFlow(0)
    val dailySessionCount: StateFlow<Int> = _dailySessionCount.asStateFlow()

    // Question / Quiz Daily Tracking
    private val _isFreeQuestionMode = MutableStateFlow(false)
    val isFreeQuestionMode: StateFlow<Boolean> = _isFreeQuestionMode.asStateFlow()

    private val _dailyQuestionCount = MutableStateFlow(0)
    val dailyQuestionCount: StateFlow<Int> = _dailyQuestionCount.asStateFlow()

    private var activeCardsList: List<Flashcard> = emptyList()
    private var cardsCollectorJob: Job? = null

    // Quiz State
    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex

    private val _selectedOptionIndex = MutableStateFlow<Int?>(null)
    val selectedOptionIndex: StateFlow<Int?> = _selectedOptionIndex

    private val _hasAnswered = MutableStateFlow(false)
    val hasAnswered: StateFlow<Boolean> = _hasAnswered

    private val _selectedCategory = MutableStateFlow("Tümü")
    val selectedCategory: StateFlow<String> = _selectedCategory

    // Statistics Flows
    val quizAttemptsCount: Flow<Int>
    val correctAttemptsCount: Flow<Int>
    val learnedWordsCount: Flow<Int>
    val totalWordsCount: Flow<Int>

    init {
        val database = AppDatabase.getDatabase(application)
        val flashcardDao = database.flashcardDao()
        ydsDao = database.ydsDao()
        repository = FlashcardRepository(flashcardDao, ydsDao)
        
        quizAttemptsCount = ydsDao.getQuizAttemptsCountFlow()
        correctAttemptsCount = ydsDao.getCorrectQuizAttemptsCountFlow()
        learnedWordsCount = flashcardDao.getLearnedFlashcardsCountFlow()
        totalWordsCount = flashcardDao.getTotalFlashcardsCountFlow()
        
        viewModelScope.launch {
            repository.populateMockData()
            observeCards()
        }
    }
    
    fun setFreeStudyMode(freeMode: Boolean) {
        if (_isFreeStudyMode.value != freeMode) {
            _isFreeStudyMode.value = freeMode
            _currentCard.value = null
            observeCards()
        }
    }

    fun setFreeQuestionMode(freeMode: Boolean) {
        if (_isFreeQuestionMode.value != freeMode) {
            _isFreeQuestionMode.value = freeMode
        }
    }

    private fun observeCards() {
        cardsCollectorJob?.cancel()
        cardsCollectorJob = viewModelScope.launch {
            val flow = if (_isFreeStudyMode.value) repository.getAllFlashcards() else repository.getDueFlashcards()
            flow.collect { cards ->
                activeCardsList = cards
                if (!_isFreeStudyMode.value && _dailySessionCount.value >= 40) {
                    _currentCard.value = null
                } else if (_currentCard.value == null && cards.isNotEmpty()) {
                    _currentCard.value = cards.first()
                } else if (cards.isEmpty()) {
                    _currentCard.value = null
                }
            }
        }
    }
    
    fun submitReview(quality: Int) {
        val card = _currentCard.value ?: return
        
        if (!_isFreeStudyMode.value) {
            _dailySessionCount.value += 1
            if (_dailySessionCount.value >= 40) {
                _currentCard.value = null
                viewModelScope.launch {
                    repository.processReview(card, quality)
                }
                return
            }
        }

        val currentIndex = activeCardsList.indexOfFirst { it.id == card.id }
        val nextCard = if (currentIndex != -1 && currentIndex + 1 < activeCardsList.size) {
            activeCardsList[currentIndex + 1]
        } else {
            null
        }
        _currentCard.value = nextCard
        viewModelScope.launch {
            repository.processReview(card, quality)
        }
    }

    fun submitQuizAttempt(questionId: Int, isCorrect: Boolean) {
        if (!_isFreeQuestionMode.value) {
            _dailyQuestionCount.value += 1
        }
        viewModelScope.launch {
            val attempt = QuizAttempt(
                questionId = questionId,
                isCorrect = isCorrect,
                date = System.currentTimeMillis()
            )
            ydsDao.insertQuizAttempt(attempt)
        }
    }

    fun selectQuizOption(index: Int?) {
        _selectedOptionIndex.value = index
    }

    fun setQuizAnswered(answered: Boolean) {
        _hasAnswered.value = answered
    }

    fun setCategory(category: String) {
        _selectedCategory.value = category
        _currentQuestionIndex.value = 0
        _selectedOptionIndex.value = null
        _hasAnswered.value = false
    }

    fun nextQuizQuestion() {
        _selectedOptionIndex.value = null
        _hasAnswered.value = false
        val filteredSize = if (_selectedCategory.value == "Tümü") {
            QuestionDataProvider.questions.size
        } else {
            QuestionDataProvider.questions.count { it.category == _selectedCategory.value }
        }
        val nextIndex = _currentQuestionIndex.value + 1
        if (nextIndex < filteredSize) {
            _currentQuestionIndex.value = nextIndex
        } else {
            _currentQuestionIndex.value = 0
        }
    }

    fun resetQuiz() {
        _currentQuestionIndex.value = 0
        _selectedOptionIndex.value = null
        _hasAnswered.value = false
    }

    fun setTargetScore(score: Int) {
        prefs.edit().putInt("target_score", score).apply()
        _targetScore.value = score
    }
}
