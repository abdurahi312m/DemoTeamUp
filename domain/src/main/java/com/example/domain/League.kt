package com.example.domain

data class League(
    val id: String,
    val name: String,          // Например, "Высшая Лига Знатоков"
    val description: String,
    val iconUrl: String?,
    val minXpToEnter: Long,    // Минимальный опыт для входа
)
