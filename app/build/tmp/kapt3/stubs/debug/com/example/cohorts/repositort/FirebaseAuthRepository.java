package com.example.cohorts.repositort;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJE\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010$\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u001cJ-\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/example/cohorts/repositort/FirebaseAuthRepository;", "", "authentication", "Lcom/google/firebase/auth/FirebaseAuth;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "sharedPref", "Lcom/example/cohorts/repositort/Preferences;", "appContext", "Landroid/content/Context;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/storage/FirebaseStorage;Lcom/example/cohorts/repositort/Preferences;Landroid/content/Context;)V", "fileName", "", "loginUserLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/firebase/auth/FirebaseUser;", "getLoginUserLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setLoginUserLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "userLiveData", "getUserLiveData", "setUserLiveData", "createUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/cohorts/repositort/Resource;", "Lcom/example/cohorts/core/model/User;", "uid", "name", "email", "password", "photoUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDataFromFireStore", "userId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDetails", "loginUser", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserInFireStore", "Ljava/lang/Void;", "user", "(Lcom/example/cohorts/core/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FirebaseAuthRepository {
    private final com.google.firebase.auth.FirebaseAuth authentication = null;
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private final com.google.firebase.storage.FirebaseStorage storage = null;
    private final com.example.cohorts.repositort.Preferences sharedPref = null;
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> userLiveData;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.google.firebase.auth.FirebaseUser> loginUserLiveData;
    private final java.lang.String fileName = null;
    
    @javax.inject.Inject()
    public FirebaseAuthRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth authentication, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore db, @org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.FirebaseStorage storage, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.Preferences sharedPref, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
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
    public final com.example.cohorts.core.model.User getUserDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserDataFromFireStore(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.repositort.Resource<com.example.cohorts.core.model.User>> continuation) {
        return null;
    }
    
    private final java.lang.Object saveUserInFireStore(com.example.cohorts.core.model.User user, kotlin.coroutines.Continuation<? super java.lang.Void> continuation) {
        return null;
    }
}