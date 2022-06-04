package com.example.hellodoctor.model.report.rr

data class ReportResult(
    val __v: Int,
    val _id: String,
    val patientId: String,
    val patientage: String,
    val patientname: String,
    val patientweight: String,
    val reasonbriefvisit: String,
    val reasonvisit: String,
    val email: String
)