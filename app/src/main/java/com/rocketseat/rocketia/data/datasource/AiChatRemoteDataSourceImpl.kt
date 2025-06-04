package com.rocketseat.rocketia.data.datasource

import com.rocketseat.rocketia.data.api.AIAPIService

class AiChatRemoteDataSourceImpl(
    private val aiAPIService: AIAPIService
): AIChatRemoteDataSource {
    override suspend fun sendPrompt(stack: String, question: String): String? =
        aiAPIService.sendPrompt(stack, question)
}