package com.example.ydsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flashcards")
data class Flashcard(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val word: String,
    val translation: String,
    val exampleSentence: String,
    val synonyms: String,
    val nextReviewDate: Long, // timestamp in ms
    val interval: Int, // days
    val easeFactor: Float // SuperMemo 2 algorithm ease factor
)
