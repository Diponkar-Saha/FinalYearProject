package com.example.hellodoctor.model

import com.google.gson.annotations.SerializedName

data class Doctor(
    @SerializedName("firstname")
    val firstname: String,
    @SerializedName("lastname")
    val lastname: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("speciality")
    val speciality: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("nid")
    val nid: String,
    @SerializedName("bmdc")
    val bmdc: String,
)

