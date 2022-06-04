package com.example.hellodoctor.repositort


import com.example.hellodoctor.ApiService
import javax.inject.Inject

class SpecialRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getSpeciallist() = apiService.getSpeciallist()

    suspend fun allDoctorlist() = apiService.allDoctorlist()
}