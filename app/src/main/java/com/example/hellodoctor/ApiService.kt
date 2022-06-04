package com.example.hellodoctor

import com.example.hellodoctor.model.*
import com.example.hellodoctor.model.response.LoginResponse
import com.example.hellodoctor.video.utils.Constants
import com.example.hellodoctor.model.doctorprofile.DoctorProfileResponse
import com.example.hellodoctor.model.report.ReportList
import com.example.hellodoctor.model.report.rr.rr
import com.example.hellodoctor.model.response.DoctorLoginResponse
import com.example.hellodoctor.model.special.SpecialResponse
import com.example.hellodoctor.model.topdoctor.AllDoctorResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface ApiService {

    @POST(Constants.END_POINT_PUBLIC_SIGNUP)
    suspend fun postSignupPublic(@Body public: Public): Response<AuthResponse>

    @POST("doctor/signup")
    suspend fun postSignupDoctor(@Body doctor: Doctor):Response<AuthResponse>

    @POST("doctorprofilelist")
    suspend fun postDoctorProfileList(@Body doctorProfile: DoctorProfile):Response<DoctorProfile>

    @POST("doctor/login")
    suspend fun postLoginDoctor(@Body login: Login):Response<DoctorLoginResponse>

    @POST("public/login")
    suspend fun postLoginPublic(@Body login: Login):Response<LoginResponse>


    @POST("reportlist")
    suspend fun postPublicReport(@Body reportList: ReportList):Response<AuthResponse>


    @GET("speciallist")
    suspend fun getSpeciallist():Response<SpecialResponse>

    @GET("doctorprofilelist/{doctorid}")
    suspend fun getDoctorProfile(
        @Path("doctorid") doctorid: String
    ):Response<DoctorProfileResponse>

    @GET("reportlist/{patientId}")
    suspend fun getDoctorReport(
        @Path("patientId") patientId: String
    ):Response<rr>


    @GET("doctor/all/yy")
    suspend fun allDoctorlist():Response<AllDoctorResponse>

}