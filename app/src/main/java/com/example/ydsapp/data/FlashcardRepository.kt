package com.example.ydsapp.data

import kotlinx.coroutines.flow.Flow
import java.util.Calendar

class FlashcardRepository(private val flashcardDao: FlashcardDao) {

    fun getDueFlashcards(): Flow<List<Flashcard>> {
        val currentTime = System.currentTimeMillis()
        return flashcardDao.getDueFlashcards(currentTime)
    }

    suspend fun processReview(card: Flashcard, quality: Int) {
        // Simple SuperMemo-2 algorithm adaptation
        // quality: 0 (blackout) to 5 (perfect response)
        
        var newEaseFactor = card.easeFactor + (0.1f - (5 - quality) * (0.08f + (5 - quality) * 0.02f))
        if (newEaseFactor < 1.3f) newEaseFactor = 1.3f
        
        var newInterval = card.interval
        if (quality < 3) {
            newInterval = 1 // start over
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
        val mockCards = arrayOf(
            Flashcard(word = "Abundant", translation = "Bol, Bereketli", exampleSentence = "The region has abundant natural resources.", synonyms = "Plentiful, Copious", nextReviewDate = System.currentTimeMillis(), interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Mitigate", translation = "Hafifletmek, Azaltmak", exampleSentence = "We need to mitigate the risks.", synonyms = "Alleviate, Reduce", nextReviewDate = System.currentTimeMillis(), interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Obscure", translation = "Belirsiz, Anlaşılması güç", exampleSentence = "His origins remain obscure.", synonyms = "Unclear, Vague", nextReviewDate = System.currentTimeMillis(), interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Profound", translation = "Derin, Çok büyük", exampleSentence = "It had a profound effect on him.", synonyms = "Deep, Intense", nextReviewDate = System.currentTimeMillis(), interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Deteriorate", translation = "Kötüleşmek, Bozulmak", exampleSentence = "Her health began to deteriorate.", synonyms = "Worsen, Decline", nextReviewDate = System.currentTimeMillis(), interval = 0, easeFactor = 2.5f)
        )
        flashcardDao.insertAll(*mockCards)
    }
}
