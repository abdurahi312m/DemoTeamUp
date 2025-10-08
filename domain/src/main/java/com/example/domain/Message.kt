package com.example.domain

import java.util.Date

data class Message(
    val id: String,
    val chatId: String,        // ID чата, к которому относится сообщение
    val senderId: String,      // ID отправителя
    val text: String,
    val imageUrl: String?,     // URL изображения, если есть
    val audioUrl: String?,     // URL аудиофайла, если есть
    val timestamp: Date,       // Время отправки сообщения
)
