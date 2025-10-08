package com.example.domain

data class Tasks(
    val id: String,
    val title: String,                  // Например, "Решить квадратное уравнение"
    val description: String,
    val subjectId: String,              // ID предмета, к которому относится задача
    val complexity: Int,                // Сложность (например, от 1 до 5)
    val xpReward: Int,                  // Сколько XP даётся за выполнение
    val isGlt: Boolean = false,         // Является ли задача General Level Task
)
