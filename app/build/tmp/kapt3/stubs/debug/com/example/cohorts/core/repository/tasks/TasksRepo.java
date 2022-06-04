package com.example.cohorts.core.repository.tasks;

import java.lang.System;

/**
 * Interface for interacting with the [Task] firebase database layer
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/cohorts/core/repository/tasks/TasksRepo;", "", "addNewTask", "Lcom/example/cohorts/core/Result;", "task", "Lcom/example/cohorts/core/model/Task;", "cohortUid", "", "(Lcom/example/cohorts/core/model/Task;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllTasks", "ofCohortUid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCompletedTasks", "deleteTask", "(Lcom/example/cohorts/core/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTaskReference", "Lcom/google/firebase/database/DatabaseReference;", "markTaskCompleteOrActive", "updateTask", "app_debug"})
public abstract interface TasksRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.core.Result<com.google.firebase.database.DatabaseReference> fetchTaskReference(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addNewTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markTaskCompleteOrActive(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearCompletedTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
}