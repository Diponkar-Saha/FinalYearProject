package com.example.cohorts.core.repository.tasks;

import java.lang.System;

/**
 * Concrete implementation of [TasksRepo] for dealing with the [Task] firebase
 * database layer
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/cohorts/core/repository/tasks/TasksRepository;", "Lcom/example/cohorts/core/repository/tasks/TasksRepo;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "tasksReference", "Lcom/google/firebase/database/DatabaseReference;", "addNewTask", "Lcom/example/cohorts/core/Result;", "", "task", "Lcom/example/cohorts/core/model/Task;", "cohortUid", "", "(Lcom/example/cohorts/core/model/Task;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllTasks", "ofCohortUid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCompletedTasks", "deleteTask", "(Lcom/example/cohorts/core/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTaskReference", "markTaskCompleteOrActive", "updateTask", "Companion", "app_debug"})
public final class TasksRepository implements com.example.cohorts.core.repository.tasks.TasksRepo {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.repository.tasks.TasksRepository.Companion Companion = null;
    private static final java.lang.String TASKS_CHILD = "tasks";
    private final com.google.firebase.database.DatabaseReference tasksReference = null;
    
    @javax.inject.Inject()
    public TasksRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        super();
    }
    
    /**
     * Fetch the reference to the tasks of a cohort
     *
     * @param cohortUid uid of the cohort whose [Task]s are required
     * @return [DatabaseReference] of the [Task]s in firebase database, wrapped
     * in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.core.Result<com.google.firebase.database.DatabaseReference> fetchTaskReference(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
        return null;
    }
    
    /**
     * Add a new [Task] to a cohort
     *
     * @param task object containing the data of a task
     * @param cohortUid uid of the cohort to which given task belongs
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addNewTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Toggle the status of a given task
     *
     * If the given [Task] is active, then mark it complete and if it is
     * completed, then mark it active
     *
     * @param task object containing the data of the task
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object markTaskCompleteOrActive(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Delete all the tasks of a cohort
     *
     * @param ofCohortUid uid of the cohort whose tasks are to be deleted
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearAllTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Delete all the tasks that are completed in a cohort
     *
     * @param ofCohortUid uid of the cohort whose completed tasks are to be cleared
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearCompletedTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Update the information of a given [Task]
     *
     * @param task object containing the updated info of a task for saving
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Delete a given task form firebase database
     *
     * @param task task to be deleted
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/cohorts/core/repository/tasks/TasksRepository$Companion;", "", "()V", "TASKS_CHILD", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}