package com.example.hellodoctor.ui.doctor


import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.model.AuthResponse
import com.example.hellodoctor.model.report.ReportList
import com.example.hellodoctor.repositort.Preferences
import com.example.hellodoctor.viewmodel.DoctorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class AppoinntmentViewModel
@Inject
constructor(
    private val repository: DoctorRepository,
    private val sharedPref: Preferences
): ViewModel() {
    fun getUserDetails1() = sharedPref.getDoctorData()
    private fun getUserDetails() = viewModelScope.launch {
        sharedPref.getDoctorData().let { response ->

            Log.d("doctor id", response.id.toString())
            //Toast.makeText(this@AppoinntmentViewModel,response.id,Toast.LENGTH_LONG)


        }
    }
    val response1 : MutableLiveData<Response<AuthResponse>> = MutableLiveData()

    fun postLoginPublic(reportList: ReportList)=viewModelScope.launch {
        val res1 = repository.postPublicReport(reportList)
        response1.value=res1

    }

}


