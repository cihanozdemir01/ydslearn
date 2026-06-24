package com.example.ydsapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface YdsDao {
    @Insert
    suspend fun insertFeynman(submission: FeynmanSubmission)

    @Query("SELECT * FROM feynman_submissions ORDER BY date DESC")
    fun getAllFeynmanSubmissions(): Flow<List<FeynmanSubmission>>

    @Query("SELECT COUNT(*) FROM feynman_submissions")
    suspend fun getFeynmanSubmissionsCount(): Int

    @Insert
    suspend fun insertQuizAttempt(attempt: QuizAttempt)

    @Query("SELECT * FROM quiz_attempts ORDER BY date DESC")
    fun getAllQuizAttempts(): Flow<List<QuizAttempt>>

    @Query("SELECT COUNT(*) FROM quiz_attempts")
    fun getQuizAttemptsCountFlow(): Flow<Int>

    @Query("SELECT COUNT(*) FROM quiz_attempts WHERE isCorrect = 1")
    fun getCorrectQuizAttemptsCountFlow(): Flow<Int>

    @Query("SELECT COUNT(*) FROM flashcards")
    suspend fun getFlashcardsCount(): Int
}
