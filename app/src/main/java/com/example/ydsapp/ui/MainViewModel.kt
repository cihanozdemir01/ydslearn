package com.example.ydsapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ydsapp.data.AppDatabase
import com.example.ydsapp.data.Flashcard
import com.example.ydsapp.data.FlashcardRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FlashcardRepository
    
    private val _currentCard = MutableStateFlow<Flashcard?>(null)
    val currentCard: StateFlow<Flashcard?> = _currentCard
    
    private var dueCardsList: List<Flashcard> = emptyList()

    init {
        val flashcardDao = AppDatabase.getDatabase(application).flashcardDao()
        repository = FlashcardRepository(flashcardDao)
        
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
}
