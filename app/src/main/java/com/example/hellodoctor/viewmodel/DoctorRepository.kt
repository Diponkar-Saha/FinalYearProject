package com.example.hellodoctor.viewmodel


import com.example.hellodoctor.ApiService
import com.example.hellodoctor.model.AuthResponse
import com.example.hellodoctor.model.DoctorProfile
import com.example.hellodoctor.model.doctorprofile.DoctorProfileResponse
import com.example.hellodoctor.model.report.ReportList
import com.example.hellodoctor.model.report.rr.rr
import retrofit2.Response
import javax.inject.Inject

class DoctorRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun postDoctorProfileList( doctorProfile: DoctorProfile): Response<DoctorProfile> {
        return apiService.postDoctorProfileList(doctorProfile)
    }

    suspend fun postPublicReport(reportList: ReportList): Response<AuthResponse> {
        return apiService.postPublicReport(reportList)
    }

    suspend fun getDoctorProfile(doctorid:String):Response<DoctorProfileResponse>{
        return apiService.getDoctorProfile(doctorid)
    }
    suspend fun getDoctorReport(patientId:String):Response<rr>{
        return apiService.getDoctorReport(patientId)
    }
}