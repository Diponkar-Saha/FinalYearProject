package com.example.cohorts.ui.register;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/cohorts/ui/register/AUthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cohorts/repositort/AuthRepository;", "(Lcom/example/cohorts/repositort/AuthRepository;)V", "response", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "Lcom/example/cohorts/model/AuthResponse;", "getResponse", "()Landroidx/lifecycle/MutableLiveData;", "responseDoctor", "getResponseDoctor", "postSignupDoctor", "Lkotlinx/coroutines/Job;", "doctor", "Lcom/example/cohorts/model/Doctor;", "postSignupPublic", "public", "Lcom/example/cohorts/model/Public;", "app_debug"})
public final class AUthViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.repositort.AuthRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.AuthResponse>> response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.AuthResponse>> responseDoctor = null;
    
    @javax.inject.Inject()
    public AUthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.AuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.AuthResponse>> getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job postSignupPublic(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.Public p0_1658771764) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<com.example.cohorts.model.AuthResponse>> getResponseDoctor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job postSignupDoctor(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.model.Doctor doctor) {
        return null;
    }
}