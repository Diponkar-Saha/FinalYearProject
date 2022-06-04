package com.example.cohorts.ui.cohorts.newmember;

import java.lang.System;

/**
 * ViewModel for AddNewMember screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cohorts/ui/cohorts/newmember/AddNewMemberViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;", "sharedPref", "Lcom/example/cohorts/repositort/Preferences;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;Lcom/example/cohorts/repositort/Preferences;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_snackbarMessage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Event;", "", "snackbarMessage", "Landroidx/lifecycle/LiveData;", "getSnackbarMessage", "()Landroidx/lifecycle/LiveData;", "addNewMemberToCohort", "", "cohort", "Lcom/example/cohorts/core/model/Cohort;", "userEmail", "getUseremail", "Lcom/example/cohorts/model/report/rr/ReportResult;", "app_debug"})
public final class AddNewMemberViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.cohorts.CohortsRepo repository = null;
    private final com.example.cohorts.repositort.Preferences sharedPref = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.String>> _snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> snackbarMessage = null;
    
    @javax.inject.Inject()
    public AddNewMemberViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.cohorts.CohortsRepo repository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.repositort.Preferences sharedPref, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.model.report.rr.ReportResult getUseremail() {
        return null;
    }
    
    /**
     * Add new member to given [Cohort]
     *
     * @param cohort object containing [Cohort] info
     * @param userEmail email of the user to be added
     */
    public final void addNewMemberToCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    java.lang.String userEmail) {
    }
}