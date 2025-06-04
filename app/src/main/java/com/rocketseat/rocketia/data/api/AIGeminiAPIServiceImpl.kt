package com.rocketseat.rocketia.data.api

import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import com.rocketseat.rocketia.BuildConfig

private const val GENERATIVE_MODEL_NAME = "gemini-1.5-flash"

class AIGeminiAPIServiceImpl(
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
): AIAPIService  {

    private val generativeModal = GenerativeModel(
        modelName = GENERATIVE_MODEL_NAME,
        apiKey = BuildConfig.apiKey
    )

    override suspend fun sendPrompt(stack: String, question: String): String? {
        TODO("Not yet implemented")
    }
}