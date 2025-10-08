package com.example.domain

data class User(
    // Основная информация
    val id: String,
    val nickname: String,
    val googleAuthId: String?,    // ID из Google-аккаунта, если регистрация через него
    val avatarUrl: String?,

    // Учебная информация
    val grade: Int,               // Класс, в котором учится школьник
    val xp: Long,                 // Опыт (XP), начинается с 0

    // Социальная информация и прогресс (пока будут пустыми)
    val teamsId: List<String> = emptyList(),               // ID команд, в которых состоит
    val activityHistory: List<String> = emptyList(),       // ID событий в истории
    val challenges: List<String> = emptyList(),            // ID текущих вызовов
    val completedAchievement: List<String> = emptyList()   // ID полученных достижений
)
