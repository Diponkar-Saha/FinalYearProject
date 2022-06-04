package com.example.cohorts.core;

import java.lang.System;

/**
 * Hilt module that provides instances of Firebase services
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/cohorts/core/FirebaseModule;", "", "()V", "getApiService", "Ldagger/hilt/android/qualifiers/ApplicationContext;", "context", "provideBaseUrl", "", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "provideFirebaseStorage", "Lcom/google/firebase/storage/FirebaseStorage;", "provideFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "provideRetrofitInstance", "Lcom/example/cohorts/ApiService;", "BASE_URL", "providesSharedPreferences", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class FirebaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.FirebaseModule INSTANCE = null;
    
    private FirebaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.cohorts.ApiService provideRetrofitInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String BASE_URL) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.firestore.FirebaseFirestore provideFirestore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.database.FirebaseDatabase provideFirebaseDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.firebase.storage.FirebaseStorage provideFirebaseStorage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences providesSharedPreferences(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final dagger.hilt.android.qualifiers.ApplicationContext getApiService(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    dagger.hilt.android.qualifiers.ApplicationContext context) {
        return null;
    }
}