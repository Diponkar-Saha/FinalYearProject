package com.example.cohorts.ui.cohorts;

import java.lang.System;

/**
 * ViewModel to the [Cohort]s list screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/example/cohorts/ui/cohorts/CohortsViewModel;", "Landroidx/lifecycle/ViewModel;", "cohortsRepository", "Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;", "meetingRepository", "Lcom/example/cohorts/core/repository/meeting/MeetingRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;Lcom/example/cohorts/core/repository/meeting/MeetingRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_snackbarMessage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Event;", "", "currentUser", "Lcom/example/cohorts/core/model/User;", "snackbarMessage", "Landroidx/lifecycle/LiveData;", "getSnackbarMessage", "()Landroidx/lifecycle/LiveData;", "addCurrentUserToOngoingMeeting", "", "ofCohort", "Lcom/example/cohorts/core/model/Cohort;", "broadcastReceiver", "Lorg/jitsi/meet/sdk/BroadcastReceiver;", "context", "Landroid/content/Context;", "fetchCohortsQuery", "Lcom/google/firebase/firestore/Query;", "isCurrentUserInMeetingOfThisCohort", "", "cohort", "app_debug"})
public final class CohortsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.cohorts.CohortsRepo cohortsRepository = null;
    private final com.example.cohorts.core.repository.meeting.MeetingRepo meetingRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.String>> _snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> snackbarMessage = null;
    private com.example.cohorts.core.model.User currentUser;
    
    @javax.inject.Inject()
    public CohortsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.cohorts.CohortsRepo cohortsRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.meeting.MeetingRepo meetingRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.firestore.Query fetchCohortsQuery() {
        return null;
    }
    
    /**
     * Adds the current user to the ongoing meeting of the given [Cohort]
     *
     * @param ofCohort object containing the data of the [Cohort] whose meeting the user
     * wants to join
     * @param broadcastReceiver for listening to broadcast events by Jitsi
     * @param context [Context]
     */
    public final void addCurrentUserToOngoingMeeting(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort ofCohort, @org.jetbrains.annotations.NotNull()
    org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Checks if the current user if in meeting of the given [Cohort]
     *
     * @param cohort object containing the information of the [Cohort]
     * @return true if user is in meeting otherwise false
     */
    public final boolean isCurrentUserInMeetingOfThisCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort) {
        return false;
    }
}