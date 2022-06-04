package com.example.cohorts.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/cohorts/viewmodel/DoctorRepository;", "", "apiService", "Lcom/example/cohorts/ApiService;", "(Lcom/example/cohorts/ApiService;)V", "getDoctorProfile", "Lretrofit2/Response;", "Lcom/example/cohorts/model/doctorprofile/DoctorProfileResponse;", "doctorid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDoctorReport", "Lcom/example/cohorts/model/report/rr/rr;", "patientId", "postDoctorProfileList", "Lcom/example/cohorts/model/DoctorProfile;", "doctorProfile", "(Lcom/example/cohorts/model/DoctorProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPublicReport", "Lcom/example/cohorts/model/AuthResponse;", "reportList", "Lcom/example/cohorts/model/report/ReportList;", "(Lcom/example/cohorts/model/report/ReportList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DoctorRepository {
    private final com.example.cohorts.ApiService apiService = null;
    
    @javax.inject.Inject()
    public DoctorRepository(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postDoctorProfileList(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.DoctorProfile doctorProfile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.DoctorProfile>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postPublicReport(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.report.ReportList reportList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.AuthResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDoctorProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String doctorid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.doctorprofile.DoctorProfileResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDoctorReport(@org.jetbrains.annotations.NotNull()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.report.rr.rr>> continuation) {
        return null;
    }
}