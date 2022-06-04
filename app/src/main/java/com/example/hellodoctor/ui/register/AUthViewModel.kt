package com.example.hellodoctor.ui.register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.model.AuthResponse
import com.example.hellodoctor.model.Doctor
import com.example.hellodoctor.model.Public
import com.example.hellodoctor.repositort.AuthRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class AUthViewModel
@Inject
constructor(private val repository: AuthRepository): ViewModel()
{
    val response : MutableLiveData<Response<AuthResponse>> = MutableLiveData()

    fun postSignupPublic(public: Public)=viewModelScope.launch {
        val res = repository.postSignupPublic(public)
        response.value=res
    }

    val responseDoctor : MutableLiveData<Response<AuthResponse>> = MutableLiveData()

    fun postSignupDoctor(doctor: Doctor)=viewModelScope.launch {
        val res1 = repository.postSignupDoctor(doctor)
        responseDoctor.value=res1
    }



}