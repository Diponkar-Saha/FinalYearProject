package com.example.hellodoctor.model.special

data class SpecialResponse(
    val message: String,
    val result: List<SpecialItem>
)
//class SpecialResponse : ArrayList<SpecialItem>()