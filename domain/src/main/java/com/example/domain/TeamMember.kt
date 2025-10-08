package com.example.domain

data class TeamMember(
    val userId: String,
    val teamId: String,
    val role: Role               // Роль участника в команде
)
