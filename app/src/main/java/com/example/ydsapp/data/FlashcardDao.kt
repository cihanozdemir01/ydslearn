package com.example.ydsapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardDao {
    // Get up to 10 cards that are due for review (nextReviewDate is past or present)
    @Query("SELECT * FROM flashcards WHERE nextReviewDate <= :currentDate ORDER BY nextReviewDate ASC LIMIT 10")
    fun getDueFlashcards(currentDate: Long): Flow<List<Flashcard>>

    @Insert
    suspend fun insertAll(vararg cards: Flashcard)

    @Update
    suspend fun update(card: Flashcard)

    @Query("SELECT COUNT(*) FROM flashcards WHERE interval > 1")
    fun getLearnedFlashcardsCountFlow(): Flow<Int>

    @Query("SELECT COUNT(*) FROM flashcards")
    fun getTotalFlashcardsCountFlow(): Flow<Int>
}
