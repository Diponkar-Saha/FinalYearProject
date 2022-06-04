package com.example.hellodoctor.model.topdoctor

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class AllDoctor(
    val _id: String,
    val bmdc: String,
    val dateofbirth: String,
    val email: String,
    val firstname: String,
    val gender: String,
    val imageurl: String,
    val lastname: String,
    val nid: String,
    val password: String,
    val phone: String,
    val speciality: String,
    val title: String
) : Parcelable