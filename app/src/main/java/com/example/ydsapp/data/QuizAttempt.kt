package com.example.ydsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_attempts")
data class QuizAttempt(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val questionId: Int,
    val isCorrect: Boolean,
    val date: Long
)
