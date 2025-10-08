package com.example.domain

data class Subject(
    val id: String,
    val name: String,         // Например, "Математика", "Физика"
    val iconUrl: String,      // Иконка предмета
    val minGrade: Int,        // Минимальный класс для этого предмета
    val maxGrade: Int,        // Максимальный класс
)
