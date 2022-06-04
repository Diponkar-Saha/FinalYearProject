package com.example.hellodoctor.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.model.Login
import com.example.hellodoctor.model.response.DoctorLoginResponse
import com.example.hellodoctor.model.response.LoginResponse
import com.example.hellodoctor.repositort.AuthRepository
import com.example.hellodoctor.repositort.Preferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class Login1ViewModel
@Inject
constructor(private val repository: AuthRepository,
            private val sharedPref: Preferences
): ViewModel(){
    val response : MutableLiveData<Response<DoctorLoginResponse>> = MutableLiveData()

    fun postLoginDoctor(login: Login)=viewModelScope.launch {
        val res = repository.postLoginDoctor(login)
        response.value=res

        sharedPref.saveDoctorData(res.body()!!)
    }

    val response1 : MutableLiveData<Response<LoginResponse>> = MutableLiveData()



    fun postLoginPublic(login: Login)=viewModelScope.launch {
        val res1 = repository.postLoginPublic(login)
        response1.value=res1

        //sharedPref.savePublicData(res1.body()!!)
    }






}