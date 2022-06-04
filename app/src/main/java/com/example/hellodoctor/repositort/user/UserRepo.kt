package com.example.hellodoctor.core.repository.user

import com.example.hellodoctor.core.Result
import com.example.hellodoctor.core.model.User


interface UserRepo {

    fun isUserLoggedIn(): Boolean

    fun getCurrentUser(): Result<User>

    fun initialiseCurrentUser(): Result<Any>

    suspend fun registerCurrentUser(): Result<Any>

    suspend fun signOut(): Result<Any>

}