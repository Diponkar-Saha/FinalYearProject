package com.example.cohorts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010!\u001a\u00020\"H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010%\u001a\u00020&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/cohorts/ApiService;", "", "allDoctorlist", "Lretrofit2/Response;", "Lcom/example/cohorts/model/topdoctor/AllDoctorResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDoctorProfile", "Lcom/example/cohorts/model/doctorprofile/DoctorProfileResponse;", "doctorid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDoctorReport", "Lcom/example/cohorts/model/report/rr/rr;", "patientId", "getSpeciallist", "Lcom/example/cohorts/model/special/SpecialResponse;", "postDoctorProfileList", "Lcom/example/cohorts/model/DoctorProfile;", "doctorProfile", "(Lcom/example/cohorts/model/DoctorProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginDoctor", "Lcom/example/cohorts/model/response/DoctorLoginResponse;", "login", "Lcom/example/cohorts/model/Login;", "(Lcom/example/cohorts/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginPublic", "Lcom/example/cohorts/model/response/LoginResponse;", "postPublicReport", "Lcom/example/cohorts/model/AuthResponse;", "reportList", "Lcom/example/cohorts/model/report/ReportList;", "(Lcom/example/cohorts/model/report/ReportList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSignupDoctor", "doctor", "Lcom/example/cohorts/model/Doctor;", "(Lcom/example/cohorts/model/Doctor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSignupPublic", "public", "Lcom/example/cohorts/model/Public;", "(Lcom/example/cohorts/model/Public;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "public/signup")
    public abstract java.lang.Object postSignupPublic(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.cohorts.model.Public p0_1658771764, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.AuthResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "doctor/signup")
    public abstract java.lang.Object postSignupDoctor(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.cohorts.model.Doctor doctor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.AuthResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "doctorprofilelist")
    public abstract java.lang.Object postDoctorProfileList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.cohorts.model.DoctorProfile doctorProfile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.DoctorProfile>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "doctor/login")
    public abstract java.lang.Object postLoginDoctor(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.cohorts.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.response.DoctorLoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "public/login")
    public abstract java.lang.Object postLoginPublic(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.cohorts.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.response.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "reportlist")
    public abstract java.lang.Object postPublicReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.cohorts.model.report.ReportList reportList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.AuthResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "speciallist")
    public abstract java.lang.Object getSpeciallist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.special.SpecialResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "doctorprofilelist/{doctorid}")
    public abstract java.lang.Object getDoctorProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "doctorid")
    java.lang.String doctorid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.doctorprofile.DoctorProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "reportlist/{patientId}")
    public abstract java.lang.Object getDoctorReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "patientId")
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.report.rr.rr>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "doctor/all/yy")
    public abstract java.lang.Object allDoctorlist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.topdoctor.AllDoctorResponse>> continuation);
}