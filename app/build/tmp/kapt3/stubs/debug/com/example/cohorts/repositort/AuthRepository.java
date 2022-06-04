package com.example.cohorts.repositort;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/cohorts/repositort/AuthRepository;", "", "apiService", "Lcom/example/cohorts/ApiService;", "(Lcom/example/cohorts/ApiService;)V", "postLoginDoctor", "Lretrofit2/Response;", "Lcom/example/cohorts/model/response/DoctorLoginResponse;", "login", "Lcom/example/cohorts/model/Login;", "(Lcom/example/cohorts/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginPublic", "Lcom/example/cohorts/model/response/LoginResponse;", "postSignupDoctor", "Lcom/example/cohorts/model/AuthResponse;", "doctor", "Lcom/example/cohorts/model/Doctor;", "(Lcom/example/cohorts/model/Doctor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSignupPublic", "public", "Lcom/example/cohorts/model/Public;", "(Lcom/example/cohorts/model/Public;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthRepository {
    private final com.example.cohorts.ApiService apiService = null;
    
    @javax.inject.Inject()
    public AuthRepository(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postSignupPublic(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.Public p0_1658771764, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.AuthResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postSignupDoctor(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.Doctor doctor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.AuthResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postLoginDoctor(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.response.DoctorLoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postLoginPublic(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cohorts.model.response.LoginResponse>> continuation) {
        return null;
    }
}