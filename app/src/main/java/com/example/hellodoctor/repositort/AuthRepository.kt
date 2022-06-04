package com.example.hellodoctor.repositort

import com.example.hellodoctor.ApiService
import com.example.hellodoctor.model.AuthResponse
import com.example.hellodoctor.model.Doctor
import com.example.hellodoctor.model.Login
import com.example.hellodoctor.model.Public
import com.example.hellodoctor.model.response.DoctorLoginResponse
import com.example.hellodoctor.model.response.LoginResponse
import retrofit2.Response
import javax.inject.Inject

class AuthRepository
@Inject
constructor(private val apiService: ApiService)
{



    suspend fun postSignupPublic( public: Public): Response<AuthResponse> {
        return apiService.postSignupPublic(public)
    }

    suspend fun postSignupDoctor(doctor: Doctor): Response<AuthResponse> {
        return apiService.postSignupDoctor(doctor)
    }

    suspend fun postLoginDoctor(login: Login): Response<DoctorLoginResponse> {
        return apiService.postLoginDoctor(login)
    }

    suspend fun postLoginPublic(login: Login): Response<LoginResponse> {
        return apiService.postLoginPublic(login)
    }
}