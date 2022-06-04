package com.example.hellodoctor.model.response

data class LoginResponse(
    val access_tokenn: String,
    val id: String,
    val message: String,
    val firstname: String,
    val lastname: String,

)