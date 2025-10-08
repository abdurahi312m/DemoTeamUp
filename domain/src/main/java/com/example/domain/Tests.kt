package com.example.domain

data class Tests(
    val id: String,
    val title: String,              // Например, "Итоговый тест по Алгебре"
    val subjectId: String,
    val questionCount: Int,         // Количество вопросов
    val xpReward: Int,
)
