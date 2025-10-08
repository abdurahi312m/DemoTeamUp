package com.example.domain

import java.util.Date

data class Challenge(
    val id: String,
    val challengerId: String,           // ID того, кто бросил вызов (User ID или Team ID)
    val opponentId: String,             // ID того, кому бросили вызов
    val subjectId: String,              // ID предмета или игры для соревнования
    val scheduledTime: Date,            // Назначенное время
    val status: ChallengeStatus,
    val winnerId: String? = null        // ID победителя, заполняется после завершения
)
