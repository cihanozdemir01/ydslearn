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
    
    private var dueCardsList: List<Flashcard> = emptyList()

    // Quiz State
    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex

    private val _selectedOptionIndex = MutableStateFlow<Int?>(null)
    val selectedOptionIndex: StateFlow<Int?> = _selectedOptionIndex

    private val _hasAnswered = MutableStateFlow(false)
    val hasAnswered: StateFlow<Boolean> = _hasAnswered

    // Statistics Flows
    val quizAttemptsCount: Flow<Int>
    val correctAttemptsCount: Flow<Int>

    init {
        val database = AppDatabase.getDatabase(application)
        val flashcardDao = database.flashcardDao()
        ydsDao = database.ydsDao()
        repository = FlashcardRepository(flashcardDao, ydsDao)
        
        quizAttemptsCount = ydsDao.getQuizAttemptsCountFlow()
        correctAttemptsCount = ydsDao.getCorrectQuizAttemptsCountFlow()
        
        viewModelScope.launch {
            // Mock data populate for demonstration
            repository.populateMockData()
            
            repository.getDueFlashcards().collect { cards ->
                dueCardsList = cards
                if (_currentCard.value == null && cards.isNotEmpty()) {
                    _currentCard.value = cards.first()
                }
            }
        }
    }
    
    fun submitReview(quality: Int) {
        val card = _currentCard.value ?: return
        viewModelScope.launch {
            repository.processReview(card, quality)
            // After review, move to next card in memory
            val nextIndex = dueCardsList.indexOf(card) + 1
            if (nextIndex < dueCardsList.size) {
                _currentCard.value = dueCardsList[nextIndex]
            } else {
                _currentCard.value = null // Done for now
            }
        }
    }



    fun submitQuizAttempt(questionId: Int, isCorrect: Boolean) {
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

    fun nextQuizQuestion() {
        _selectedOptionIndex.value = null
        _hasAnswered.value = false
        val nextIndex = _currentQuestionIndex.value + 1
        if (nextIndex < QuestionDataProvider.questions.size) {
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
