package com.example.cohorts.core.repository.cohorts;

import java.lang.System;

/**
 * Interface to Cohorts firestore database layer
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\nH&J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0018\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;", "", "addNewCohort", "Lcom/example/cohorts/core/Result;", "newCohort", "Lcom/example/cohorts/core/model/Cohort;", "(Lcom/example/cohorts/core/model/Cohort;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewMemberToCohort", "cohort", "userEmail", "", "(Lcom/example/cohorts/core/model/Cohort;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteThisCohort", "fetchCohortsQuery", "Lcom/google/firebase/firestore/Query;", "fetchUsersQuery", "cohortUid", "getCohortById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUser", "Lcom/example/cohorts/core/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByEmail", "getUserByUid", "userUid", "removeThisUserFromCohort", "user", "(Lcom/example/cohorts/core/model/User;Lcom/example/cohorts/core/model/Cohort;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCohort", "saveUser", "(Lcom/example/cohorts/core/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CohortsRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.core.Result<com.google.firebase.firestore.Query> fetchCohortsQuery();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.core.Result<com.google.firebase.firestore.Query> fetchUsersQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addNewCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort newCohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addNewMemberToCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByUid(@org.jetbrains.annotations.NotNull()
    java.lang.String userUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCohortById(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.Cohort>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteThisCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeThisUserFromCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
}