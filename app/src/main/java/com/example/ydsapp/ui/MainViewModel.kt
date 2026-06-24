package com.example.ydsapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ydsapp.data.AppDatabase
import com.example.ydsapp.data.Flashcard
import com.example.ydsapp.data.FeynmanSubmission
import com.example.ydsapp.data.QuizAttempt
import com.example.ydsapp.data.FlashcardRepository
import com.example.ydsapp.data.YdsDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FlashcardRepository
    private val ydsDao: YdsDao
    
    private val _currentCard = MutableStateFlow<Flashcard?>(null)
    val currentCard: StateFlow<Flashcard?> = _currentCard
    
    private var dueCardsList: List<Flashcard> = emptyList()

    // Statistics Flows
    val quizAttemptsCount: Flow<Int>
    val correctAttemptsCount: Flow<Int>
    val feynmanSubmissions: Flow<List<FeynmanSubmission>>

    init {
        val database = AppDatabase.getDatabase(application)
        val flashcardDao = database.flashcardDao()
        ydsDao = database.ydsDao()
        repository = FlashcardRepository(flashcardDao, ydsDao)
        
        quizAttemptsCount = ydsDao.getQuizAttemptsCountFlow()
        correctAttemptsCount = ydsDao.getCorrectQuizAttemptsCountFlow()
        feynmanSubmissions = ydsDao.getAllFeynmanSubmissions()
        
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

    fun submitFeynman(topic: String, explanation: String, score: Int) {
        viewModelScope.launch {
            val submission = FeynmanSubmission(
                topic = topic,
                explanation = explanation,
                score = score,
                date = System.currentTimeMillis()
            )
            ydsDao.insertFeynman(submission)
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
}
