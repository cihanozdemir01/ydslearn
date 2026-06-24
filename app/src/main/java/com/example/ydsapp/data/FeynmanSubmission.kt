package com.example.ydsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "feynman_submissions")
data class FeynmanSubmission(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val topic: String,
    val explanation: String,
    val score: Int,
    val date: Long
)
