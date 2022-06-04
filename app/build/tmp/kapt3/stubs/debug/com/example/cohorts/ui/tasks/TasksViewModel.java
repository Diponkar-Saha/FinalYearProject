package com.example.cohorts.ui.tasks;

import java.lang.System;

/**
 * ViewModel to [Task]s list screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/cohorts/ui/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "tasksRepository", "Lcom/example/cohorts/core/repository/tasks/TasksRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/tasks/TasksRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_snackbarMessage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Event;", "", "snackbarMessage", "Landroidx/lifecycle/LiveData;", "getSnackbarMessage", "()Landroidx/lifecycle/LiveData;", "clearAllTasks", "", "ofCohortUid", "clearCompletedTasks", "fetchTaskReference", "Lcom/google/firebase/database/DatabaseReference;", "cohortUid", "markTaskCompleteOrActive", "task", "Lcom/example/cohorts/core/model/Task;", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.tasks.TasksRepo tasksRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.String>> _snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> snackbarMessage = null;
    
    @javax.inject.Inject()
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.tasks.TasksRepo tasksRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    /**
     * Fetches the reference to [Task]s in firebase database
     *
     * @param cohortUid uid of cohort the tasks are of
     * @return DatabaseReference of task if successful otherwise null
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference fetchTaskReference(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
        return null;
    }
    
    /**
     * Toggle the status of given [Task]
     *
     * Marks the task complete if it is active or marks it active if it is completed
     *
     * @param task object containing data of task
     */
    public final void markTaskCompleteOrActive(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task task) {
    }
    
    /**
     * Clear all completed tasks from firebase database
     *
     * @param ofCohortUid uid of the cohort to which the completed tasks belong
     */
    public final void clearCompletedTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid) {
    }
    
    /**
     * Clears all the tasks from firebase database
     *
     * @param ofCohortUid uid of the cohort the tasks belong to
     */
    public final void clearAllTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid) {
    }
}