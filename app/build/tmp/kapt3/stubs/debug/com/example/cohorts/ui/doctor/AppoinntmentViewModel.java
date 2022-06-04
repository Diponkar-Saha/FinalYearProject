package com.example.cohorts.ui.doctor;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/cohorts/ui/doctor/AppoinntmentViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cohorts/viewmodel/DoctorRepository;", "sharedPref", "Lcom/example/cohorts/repositort/Preferences;", "(Lcom/example/cohorts/viewmodel/DoctorRepository;Lcom/example/cohorts/repositort/Preferences;)V", "response1", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/example/cohorts/model/AuthResponse;", "getResponse1", "()Landroidx/lifecycle/MutableLiveData;", "getUserDetails", "Lkotlinx/coroutines/Job;", "getUserDetails1", "Lcom/example/cohorts/model/response/DoctorLoginResponse;", "postLoginPublic", "reportList", "Lcom/example/cohorts/model/report/ReportList;", "app_debug"})
public final class AppoinntmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.viewmodel.DoctorRepository repository = null;
    private final com.example.cohorts.repositort.Preferences sharedPref = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.AuthResponse>> response1 = null;
    
    @javax.inject.Inject()
    public AppoinntmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.viewmodel.DoctorRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.Preferences sharedPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.model.response.DoctorLoginResponse getUserDetails1() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getUserDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.AuthResponse>> getResponse1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job postLoginPublic(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.report.ReportList reportList) {
        return null;
    }
}