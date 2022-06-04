package com.example.cohorts.core.repository.user;

import java.lang.System;

/**
 * Concrete implementation of [UserRepo]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/cohorts/core/repository/user/UserRepository;", "Lcom/example/cohorts/core/repository/user/UserRepo;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "currentUser", "Lcom/example/cohorts/core/model/User;", "userRealTimeListener", "Lcom/google/firebase/firestore/ListenerRegistration;", "usersCollection", "Lcom/google/firebase/firestore/CollectionReference;", "getCurrentUser", "Lcom/example/cohorts/core/Result;", "getUserByUid", "userUid", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialiseCurrentUser", "", "isUserLoggedIn", "", "listenToRealtimeChangesToCurrentUser", "", "registerCurrentUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class UserRepository implements com.example.cohorts.core.repository.user.UserRepo {
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.repository.user.UserRepository.Companion Companion = null;
    private static final java.lang.String USERS_COLLECTION = "users";
    private final com.google.firebase.firestore.CollectionReference usersCollection = null;
    private com.example.cohorts.core.model.User currentUser;
    private com.google.firebase.firestore.ListenerRegistration userRealTimeListener;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    /**
     * Check if the current user is logged in or not
     *
     * @return true if the user is logged in else false
     */
    @java.lang.Override()
    public boolean isUserLoggedIn() {
        return false;
    }
    
    /**
     * Attach a realtime user to the data of current user
     *
     * The realtime listener will listen for any changes to the data of current
     * user and update the currentUser member variable
     *
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.core.Result<java.lang.Object> initialiseCurrentUser() {
        return null;
    }
    
    /**
     * Save the [User] data of the current user in firestore if
     * it is not already saved
     *
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Sign the user out
     *
     * Detaches the realtime listener attached to the data of current user in firestore
     * and changes the value of currentUser member variable to null
     *
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signOut(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Get the data of the current user
     *
     * @return [User] wrapped in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.core.Result<com.example.cohorts.core.model.User> getCurrentUser() {
        return null;
    }
    
    /**
     * Get [User] with the given uid
     *
     * @param userUid uid of the user
     * @return [User] wrapped in [Result]
     */
    private final java.lang.Object getUserByUid(java.lang.String userUid, kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation) {
        return null;
    }
    
    /**
     * This method attaches a realtime listener to the data of the
     * current user in firestore, listens for any changes in data there and updates
     * the value of currentUser members variable
     */
    private final void listenToRealtimeChangesToCurrentUser() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/cohorts/core/repository/user/UserRepository$Companion;", "", "()V", "USERS_COLLECTION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}