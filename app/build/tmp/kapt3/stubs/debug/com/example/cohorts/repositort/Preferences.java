package com.example.cohorts.repositort;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/cohorts/repositort/Preferences;", "", "sharedPref", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getDoctorData", "Lcom/example/cohorts/model/response/DoctorLoginResponse;", "getReportData", "Lcom/example/cohorts/model/report/rr/ReportResult;", "getUserData", "Lcom/example/cohorts/core/model/User;", "removeUserData", "", "saveDoctorData", "doctorloginResponse", "saveReportData", "reportList", "saveUserData", "user", "app_debug"})
public final class Preferences {
    private final android.content.SharedPreferences sharedPref = null;
    
    @javax.inject.Inject()
    public Preferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.model.report.rr.ReportResult getReportData() {
        return null;
    }
    
    public final void saveReportData(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.report.rr.ReportResult reportList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.model.response.DoctorLoginResponse getDoctorData() {
        return null;
    }
    
    public final void saveDoctorData(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.response.DoctorLoginResponse doctorloginResponse) {
    }
    
    public final void saveUserData(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.core.model.User getUserData() {
        return null;
    }
    
    public final void removeUserData() {
    }
}