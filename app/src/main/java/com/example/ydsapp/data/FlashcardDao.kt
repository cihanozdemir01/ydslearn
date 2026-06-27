package com.example.ydsapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardDao {
    // Daily study pool: up to 40 unmastered cards due for review in RANDOM order
    @Query("SELECT * FROM flashcards WHERE nextReviewDate <= :currentDate AND isMastered = 0 ORDER BY RANDOM() LIMIT 40")
    fun getDueFlashcards(currentDate: Long): Flow<List<Flashcard>>

    // Free study pool: all cards in RANDOM order for unlimited practice
    @Query("SELECT * FROM flashcards ORDER BY RANDOM()")
    fun getAllFlashcardsFlow(): Flow<List<Flashcard>>

    @Insert
    suspend fun insertAll(vararg cards: Flashcard)

    @Update
    suspend fun update(card: Flashcard)

    @Query("SELECT COUNT(*) FROM flashcards WHERE isMastered = 1 OR interval >= 14")
    fun getLearnedFlashcardsCountFlow(): Flow<Int>

    @Query("SELECT COUNT(*) FROM flashcards")
    fun getTotalFlashcardsCountFlow(): Flow<Int>
}
