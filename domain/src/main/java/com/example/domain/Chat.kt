package com.example.domain

data class Chat(
    val id: String,
    val participantIds: List<String>,   // Список ID всех участников чата
    val lastMessage: Message?           // Последнее сообщение для превью в списке чатов
)
