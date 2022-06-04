package com.example.hellodoctor.core.model

import com.example.hellodoctor.utils.generateRandomString
import java.io.Serializable


data class Task(
    var title: String? = null,
    var description: String? = null,
    var isCompleted: Boolean = false,
    val taskId: String = generateRandomString(20),
    val taskOfCohort: String? = null // Uid of cohort to which this task belongs
) : Serializable