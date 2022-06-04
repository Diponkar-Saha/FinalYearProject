package com.example.hellodoctor.ui.doctor

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.model.DoctorProfile
import com.example.hellodoctor.model.doctorprofile.DoctorProfileResponse
import com.example.hellodoctor.model.report.rr.ReportResult
import com.example.hellodoctor.model.report.rr.rr
import com.example.hellodoctor.repositort.Preferences
import com.example.hellodoctor.viewmodel.DoctorRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class EditDoctorProfileViewModel
@Inject
constructor(private val repository: DoctorRepository,
            private val sharedPref: Preferences
): ViewModel() {
    val response: MutableLiveData<Response<DoctorProfile>> = MutableLiveData()

    fun postDoctorProfileList(doctorProfile: DoctorProfile) = viewModelScope.launch {
        val res = repository.postDoctorProfileList(doctorProfile)
        response.value = res
    }

    fun getUserDetails1() = sharedPref.getDoctorData()
    fun getUserDetails2(reportList:ReportResult) = sharedPref.saveReportData(reportList)




    val response1 : MutableLiveData<Response<DoctorProfileResponse>> = MutableLiveData()


    fun getDoctorProfile(doctorid:String)=viewModelScope.launch {
        val res = repository.getDoctorProfile(doctorid)
        response1.value = res

    }
    val response2 : MutableLiveData<Response<rr>> = MutableLiveData()

    fun getDoctorReport(patientId:String)=viewModelScope.launch {
        val res2 = repository.getDoctorReport(patientId)
        response2.value = res2

    }
}