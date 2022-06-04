package com.example.hellodoctor.core.repository.chat

import android.net.Uri
import com.example.hellodoctor.core.Result
import com.example.hellodoctor.model.ChatMessage
import com.google.firebase.database.DatabaseReference


interface ChatRepo {

    fun fetchChatReference(cohortUid: String): Result<DatabaseReference>

    suspend fun sendNewChatMessage(chatMessage: ChatMessage): Result<Any>

    suspend fun sendImageMessage(tempMessage: ChatMessage, imageUri: Uri?): Result<Any>

}