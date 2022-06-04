package com.example.hellodoctor.model

import com.google.gson.annotations.SerializedName

data class AuthResponse(
    @SerializedName("message")
    val message: String
)
