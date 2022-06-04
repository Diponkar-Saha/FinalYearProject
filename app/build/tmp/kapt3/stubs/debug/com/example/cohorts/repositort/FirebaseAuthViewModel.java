package com.example.cohorts.repositort;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/example/cohorts/repositort/FirebaseAuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cohorts/repositort/FirebaseAuthRepository;", "(Lcom/example/cohorts/repositort/FirebaseAuthRepository;)V", "_loginState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/repositort/Resource;", "Lcom/example/cohorts/core/model/User;", "_registerState", "loginState", "Landroidx/lifecycle/LiveData;", "getLoginState", "()Landroidx/lifecycle/LiveData;", "loginUserLiveData", "Lcom/google/firebase/auth/FirebaseUser;", "getLoginUserLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setLoginUserLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "progress", "", "getProgress", "registerState", "getRegisterState", "userLiveData", "getUserLiveData", "setUserLiveData", "createUser", "Lkotlinx/coroutines/Job;", "uid", "", "name", "email", "password", "photoUrl", "loginUser", "app_debug"})
public final class FirebaseAuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.repositort.FirebaseAuthRepository repository = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> userLiveData;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> loginUserLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progress = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> _registerState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> registerState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> _loginState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> loginState = null;
    
    @javax.inject.Inject()
    public FirebaseAuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.FirebaseAuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> getUserLiveData() {
        return null;
    }
    
    public final void setUserLiveData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> getLoginUserLiveData() {
        return null;
    }
    
    public final void setLoginUserLiveData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> getRegisterState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job createUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
}