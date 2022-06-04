package com.example.cohorts.core.repository.user;

import java.lang.System;

/**
 * Interface that acts as a layer between [User]s data on firestore
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/cohorts/core/repository/user/UserRepo;", "", "getCurrentUser", "Lcom/example/cohorts/core/Result;", "Lcom/example/cohorts/core/model/User;", "initialiseCurrentUser", "isUserLoggedIn", "", "registerCurrentUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "app_debug"})
public abstract interface UserRepo {
    
    public abstract boolean isUserLoggedIn();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.core.Result<com.example.cohorts.core.model.User> getCurrentUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.core.Result<java.lang.Object> initialiseCurrentUser();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signOut(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
}