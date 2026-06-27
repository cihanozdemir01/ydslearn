package com.example.ydsapp.data

import kotlinx.coroutines.flow.Flow
import java.util.Calendar

class FlashcardRepository(
    private val flashcardDao: FlashcardDao,
    private val ydsDao: YdsDao
) {

    fun getDueFlashcards(): Flow<List<Flashcard>> {
        val currentTime = System.currentTimeMillis()
        return flashcardDao.getDueFlashcards(currentTime)
    }

    suspend fun processReview(card: Flashcard, quality: Int) {
        var newEaseFactor = card.easeFactor + (0.1f - (5 - quality) * (0.08f + (5 - quality) * 0.02f))
        if (newEaseFactor < 1.3f) newEaseFactor = 1.3f
        
        var newInterval = card.interval
        if (quality < 3) {
            newInterval = 1
        } else {
            newInterval = if (card.interval == 0) {
                1
            } else if (card.interval == 1) {
                6
            } else {
                (card.interval * newEaseFactor).toInt()
            }
        }
        
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, newInterval)
        val nextReview = calendar.timeInMillis
        
        val updatedCard = card.copy(
            interval = newInterval,
            easeFactor = newEaseFactor,
            nextReviewDate = nextReview
        )
        flashcardDao.update(updatedCard)
    }

    suspend fun populateMockData() {
        if (ydsDao.getFlashcardsCount() >= 300) return

        val now = System.currentTimeMillis()
        val cards = FlashcardDataProvider.getInitialFlashcards(now)
        flashcardDao.insertAll(*cards.toTypedArray())
    }
}
