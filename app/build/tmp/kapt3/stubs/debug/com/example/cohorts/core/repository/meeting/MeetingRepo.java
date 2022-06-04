package com.example.cohorts.core.repository.meeting;

import java.lang.System;

/**
 * Interface for dealing with the operations if adding and removing users from
 * the meeting of a cohort
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/cohorts/core/repository/meeting/MeetingRepo;", "", "addCurrentUserToOngoingMeeting", "Lcom/example/cohorts/core/Result;", "Lcom/example/cohorts/core/model/User;", "ofCohortUid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveOngoingMeeting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDestroy", "", "startNewMeeting", "app_debug"})
public abstract interface MeetingRepo {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addCurrentUserToOngoingMeeting(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object startNewMeeting(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object leaveOngoingMeeting(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object onDestroy(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}