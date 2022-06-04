package com.example.cohorts.core.repository.meeting;

import java.lang.System;

/**
 * Concrete implementation of [MeetingRepo] for dealing with adding and removing
 * user from meetings of cohorts
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0011\u0010\u0016\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/cohorts/core/repository/meeting/MeetingRepository;", "Lcom/example/cohorts/core/repository/meeting/MeetingRepo;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "cohortsCollection", "Lcom/google/firebase/firestore/CollectionReference;", "currentUser", "Lcom/example/cohorts/core/model/User;", "usersCollection", "addCurrentUserToOngoingMeeting", "Lcom/example/cohorts/core/Result;", "ofCohortUid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveOngoingMeeting", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenToRealtimeChangesToCurrentUser", "", "onDestroy", "startNewMeeting", "Companion", "app_debug"})
public final class MeetingRepository implements com.example.cohorts.core.repository.meeting.MeetingRepo {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.repository.meeting.MeetingRepository.Companion Companion = null;
    private static final java.lang.String USERS_COLLECTION = "users";
    private static final java.lang.String COHORTS_COLLECTION = "cohorts";
    private final com.google.firebase.firestore.CollectionReference usersCollection = null;
    private final com.google.firebase.firestore.CollectionReference cohortsCollection = null;
    private com.example.cohorts.core.model.User currentUser;
    
    @javax.inject.Inject()
    public MeetingRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    /**
     * Attach a realtime listener to the data of currently logged in user
     * this listener will update the currentUser member variable whenever there are changes
     * to the data of current user in firestore
     */
    private final void listenToRealtimeChangesToCurrentUser() {
    }
    
    /**
     * Add the current user to the meeting of cohort
     *
     * @param ofCohortUid uid of the cohort in whose the meeting the user is to be added
     * @return [User] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addCurrentUserToOngoingMeeting(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation) {
        return null;
    }
    
    /**
     * Start a new meeting in the cohort
     *
     * @param ofCohortUid uid of the cohort in which the meeting is to be started
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object startNewMeeting(@org.jetbrains.annotations.NotNull()
    java.lang.String ofCohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Leave the ongoing meeting of which the currently logged in user is part of
     *
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object leaveOngoingMeeting(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Removes the user from meetings the are in, even if they are part of multiple meetings
     * because of some bug
     *
     * Call this method when the app closes
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object onDestroy(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/cohorts/core/repository/meeting/MeetingRepository$Companion;", "", "()V", "COHORTS_COLLECTION", "", "USERS_COLLECTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}