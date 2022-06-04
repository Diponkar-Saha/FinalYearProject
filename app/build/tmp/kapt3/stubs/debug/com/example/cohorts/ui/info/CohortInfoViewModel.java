package com.example.cohorts.ui.info;

import java.lang.System;

/**
 * ViewModel for the CohortInfo screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/cohorts/ui/info/CohortInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "cohortsRepository", "Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;", "userRepository", "Lcom/example/cohorts/core/repository/user/UserRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;Lcom/example/cohorts/core/repository/user/UserRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_currentUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/core/model/User;", "_snackbarMessage", "Lcom/example/cohorts/utils/Event;", "", "currentUser", "Landroidx/lifecycle/LiveData;", "getCurrentUser", "()Landroidx/lifecycle/LiveData;", "snackbarMessage", "getSnackbarMessage", "fetchUsersQuery", "Lcom/google/firebase/firestore/Query;", "cohortUid", "", "removeThisUserFromCohort", "user", "cohort", "Lcom/example/cohorts/core/model/Cohort;", "updateThisCohort", "app_debug"})
public final class CohortInfoViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.cohorts.CohortsRepo cohortsRepository = null;
    private final com.example.cohorts.core.repository.user.UserRepo userRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.core.model.User> _currentUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.core.model.User> currentUser = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.String>> _snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> snackbarMessage = null;
    
    @javax.inject.Inject()
    public CohortInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.cohorts.CohortsRepo cohortsRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.user.UserRepo userRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.core.model.User> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.Query fetchUsersQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
        return null;
    }
    
    /**
     * Get the data of current user and initialise the _currentUser liveData
     */
    public final void getCurrentUser() {
    }
    
    /**
     * Removes the given [User] from the given [Cohort]
     *
     * @param user object with the data of the user to be removed
     * @param cohort object with the data of cohort from which the user is to be removed
     */
    public final void removeThisUserFromCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort) {
    }
    
    /**
     * Update the data of the given [Cohort] in firestore
     *
     * @param cohort object containing the data of updated cohort
     */
    public final void updateThisCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort) {
    }
}