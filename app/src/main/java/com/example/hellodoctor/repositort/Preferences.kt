package com.example.hellodoctor.repositort

import android.content.SharedPreferences
import com.example.hellodoctor.core.model.User
import com.example.hellodoctor.model.report.rr.ReportResult
import com.example.hellodoctor.model.response.DoctorLoginResponse

import com.google.gson.Gson
import javax.inject.Inject

class Preferences @Inject constructor(
    private val sharedPref: SharedPreferences
) {

    fun getReportData(): ReportResult {
        val reportString = sharedPref.getString("Report", null);
        return Gson().fromJson(reportString, ReportResult::class.java)
    }
    fun saveReportData(reportList: ReportResult) {
        val reportString = Gson().toJson(reportList)
        sharedPref.edit().putString("Report", reportString).apply()
    }



    fun getDoctorData(): DoctorLoginResponse {
        val userString = sharedPref.getString("DoctorLoginResponse", null);
        return Gson().fromJson(userString, DoctorLoginResponse::class.java)
    }
    fun saveDoctorData(doctorloginResponse: DoctorLoginResponse) {
        val userData = Gson().toJson(doctorloginResponse)
        sharedPref.edit().putString("DoctorLoginResponse", userData).apply()
    }


    fun saveUserData(user: User) {
        val userData = Gson().toJson(user)
        sharedPref.edit().putString("USER", userData).apply()
    }

    fun getUserData(): User {
        val userString = sharedPref.getString("USER", null);
        return Gson().fromJson(userString, User::class.java)
    }

    fun removeUserData() {
        sharedPref.edit().remove("USER").apply()
    }
}