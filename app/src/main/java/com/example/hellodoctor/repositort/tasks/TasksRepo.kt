package com.example.hellodoctor.core.repository.tasks

import com.example.hellodoctor.core.Result
import com.example.hellodoctor.model.Task
import com.google.firebase.database.DatabaseReference


interface TasksRepo {

    fun fetchTaskReference(cohortUid: String): Result<DatabaseReference>

    suspend fun addNewTask(task: Task, cohortUid: String): Result<Any>

    suspend fun markTaskCompleteOrActive(task: Task): Result<Any>

    suspend fun clearAllTasks(ofCohortUid: String): Result<Any>

    suspend fun clearCompletedTasks(ofCohortUid: String): Result<Any>

    suspend fun updateTask(task: Task): Result<Any>

    suspend fun deleteTask(task: Task): Result<Any>

}