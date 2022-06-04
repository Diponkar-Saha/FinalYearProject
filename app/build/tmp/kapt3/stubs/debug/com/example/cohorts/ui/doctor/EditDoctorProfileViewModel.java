package com.example.cohorts.ui.doctor;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/cohorts/ui/doctor/EditDoctorProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cohorts/viewmodel/DoctorRepository;", "sharedPref", "Lcom/example/cohorts/repositort/Preferences;", "(Lcom/example/cohorts/viewmodel/DoctorRepository;Lcom/example/cohorts/repositort/Preferences;)V", "response", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/example/cohorts/model/DoctorProfile;", "getResponse", "()Landroidx/lifecycle/MutableLiveData;", "response1", "Lcom/example/cohorts/model/doctorprofile/DoctorProfileResponse;", "getResponse1", "response2", "Lcom/example/cohorts/model/report/rr/rr;", "getResponse2", "getDoctorProfile", "Lkotlinx/coroutines/Job;", "doctorid", "", "getDoctorReport", "patientId", "getUserDetails1", "Lcom/example/cohorts/model/response/DoctorLoginResponse;", "getUserDetails2", "", "reportList", "Lcom/example/cohorts/model/report/rr/ReportResult;", "postDoctorProfileList", "doctorProfile", "app_debug"})
public final class EditDoctorProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.viewmodel.DoctorRepository repository = null;
    private final com.example.cohorts.repositort.Preferences sharedPref = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.DoctorProfile>> response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.doctorprofile.DoctorProfileResponse>> response1 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.report.rr.rr>> response2 = null;
    
    @javax.inject.Inject()
    public EditDoctorProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.viewmodel.DoctorRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.Preferences sharedPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.DoctorProfile>> getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job postDoctorProfileList(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.DoctorProfile doctorProfile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.model.response.DoctorLoginResponse getUserDetails1() {
        return null;
    }
    
    public final void getUserDetails2(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.report.rr.ReportResult reportList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.doctorprofile.DoctorProfileResponse>> getResponse1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDoctorProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String doctorid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.report.rr.rr>> getResponse2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDoctorReport(@org.jetbrains.annotations.NotNull()
    java.lang.String patientId) {
        return null;
    }
}