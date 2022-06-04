package com.example.cohorts.ui.tasks.addNewTask;

import java.lang.System;

/**
 * ViewModel to Add new task screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/cohorts/ui/tasks/addNewTask/AddNewTaskViewModel;", "Landroidx/lifecycle/ViewModel;", "tasksRepository", "Lcom/example/cohorts/core/repository/tasks/TasksRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/tasks/TasksRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_snackbarMessage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Event;", "", "snackbarMessage", "Landroidx/lifecycle/LiveData;", "getSnackbarMessage", "()Landroidx/lifecycle/LiveData;", "addNewTask", "", "newTask", "Lcom/example/cohorts/core/model/Task;", "cohortUid", "app_debug"})
public final class AddNewTaskViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.tasks.TasksRepo tasksRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.String>> _snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> snackbarMessage = null;
    
    @javax.inject.Inject()
    public AddNewTaskViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.tasks.TasksRepo tasksRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    /**
     * Save new [Task] to firebase database
     *
     * @param newTask task object to be saved on firebase
     * @param cohortUid uid of cohort the task belongs to
     */
    public final void addNewTask(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Task newTask, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
    }
}