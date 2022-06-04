package com.example.cohorts.core.repository.cohorts;

import java.lang.System;

/**
 * Concrete implementation for manipulating [Cohort]s data in firestore database
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u001e\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010&\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\'\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010(\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010(\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/example/cohorts/core/repository/cohorts/CohortsRepository;", "Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/database/FirebaseDatabase;)V", "chatReference", "Lcom/google/firebase/database/DatabaseReference;", "cohortsCollection", "Lcom/google/firebase/firestore/CollectionReference;", "tasksReference", "usersCollection", "addNewCohort", "Lcom/example/cohorts/core/Result;", "", "newCohort", "Lcom/example/cohorts/core/model/Cohort;", "(Lcom/example/cohorts/core/model/Cohort;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewMemberToCohort", "cohort", "userEmail", "", "(Lcom/example/cohorts/core/model/Cohort;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteThisCohort", "fetchCohortsQuery", "Lcom/google/firebase/firestore/Query;", "fetchUsersQuery", "cohortUid", "getCohortById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUser", "Lcom/example/cohorts/core/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByEmail", "getUserByUid", "userUid", "removeThisUserFromCohort", "user", "(Lcom/example/cohorts/core/model/User;Lcom/example/cohorts/core/model/Cohort;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCohort", "saveUser", "(Lcom/example/cohorts/core/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class CohortsRepository implements com.example.cohorts.core.repository.cohorts.CohortsRepo {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.repository.cohorts.CohortsRepository.Companion Companion = null;
    private static final java.lang.String USERS_COLLECTION = "users";
    private static final java.lang.String COHORTS_COLLECTION = "cohorts";
    private static final java.lang.String CHAT_CHILD = "chats";
    private static final java.lang.String TASK_CHILD = "tasks";
    private final com.google.firebase.firestore.CollectionReference usersCollection = null;
    private final com.google.firebase.firestore.CollectionReference cohortsCollection = null;
    private final com.google.firebase.database.DatabaseReference chatReference = null;
    private final com.google.firebase.database.DatabaseReference tasksReference = null;
    
    @javax.inject.Inject()
    public CohortsRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        super();
    }
    
    /**
     * Fetches the query to get all the [Cohort]s from firestore whose member the
     * logged in user is
     *
     * @return [Query] wrapped in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.core.Result<com.google.firebase.firestore.Query> fetchCohortsQuery() {
        return null;
    }
    
    /**
     * Fetches the query to get all the [User]s who are in a certain [Cohort]
     *
     * @param cohortUid uid of the [Cohort]
     * @return [Query] wrapped in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.core.Result<com.google.firebase.firestore.Query> fetchUsersQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
        return null;
    }
    
    /**
     * Get the [User] with the given email
     *
     * @param userEmail email of the [User] to be searched
     * @return [User] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation) {
        return null;
    }
    
    /**
     * Save the given [Cohort] in firestore cohorts collection
     *
     * @param cohort [Cohort] to save in firestore
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Save the given [User] in firestore users collection
     *
     * @param user [User] to save in firestore
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Get the [User] object containing the data of the currently logged in user
     *
     * @return [User] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation) {
        return null;
    }
    
    /**
     * Get the [User] with the given uid
     *
     * @param userUid uid of the user
     * @return [User] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserByUid(@org.jetbrains.annotations.NotNull()
    java.lang.String userUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.User>> continuation) {
        return null;
    }
    
    /**
     * Create a new cohort
     *
     * Given a cohort with name and description, add the user who created the
     * cohort and save it on firestore
     *
     * @param newCohort [Cohort] containing the name and description
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addNewCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort newCohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Add a [User] to the given [Cohort]
     *
     * @param cohort Cohort in which the user is to be added
     * @param userEmail email of the user to be added to given cohort
     * @return [Any] wrapped in  [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addNewMemberToCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Get the [Cohort] from firestore with the given cohortUid
     *
     * @param cohortUid uid of the [Cohort] to be searched
     * @return [Cohort] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCohortById(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<com.example.cohorts.core.model.Cohort>> continuation) {
        return null;
    }
    
    /**
     * Delete the given [Cohort] from firestore
     *
     * @param cohort cohort to be deleted
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteThisCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Remove the given user from the given cohort
     *
     * @param user user to be removed from cohort
     * @param cohort cohort from which the user is to be removed
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeThisUserFromCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/cohorts/core/repository/cohorts/CohortsRepository$Companion;", "", "()V", "CHAT_CHILD", "", "COHORTS_COLLECTION", "TASK_CHILD", "USERS_COLLECTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}