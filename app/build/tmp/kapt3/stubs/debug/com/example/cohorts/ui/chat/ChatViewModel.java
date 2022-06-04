package com.example.cohorts.ui.chat;

import java.lang.System;

/**
 * ViewModel for the Chat list screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u001fJ\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010$\u001a\u00020\u0015J\u0016\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015J\u0016\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020!2\u0006\u0010(\u001a\u00020)R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "cohortsRepository", "Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;", "chatRepository", "Lcom/example/cohorts/core/repository/chat/ChatRepo;", "meetingRepository", "Lcom/example/cohorts/core/repository/meeting/MeetingRepo;", "userRepository", "Lcom/example/cohorts/core/repository/user/UserRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/cohorts/CohortsRepo;Lcom/example/cohorts/core/repository/chat/ChatRepo;Lcom/example/cohorts/core/repository/meeting/MeetingRepo;Lcom/example/cohorts/core/repository/user/UserRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_cohortDeleted", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Event;", "", "_currentUser", "Lcom/example/cohorts/core/model/User;", "kotlin.jvm.PlatformType", "_snackbarMessage", "", "cohortDeleted", "Landroidx/lifecycle/LiveData;", "getCohortDeleted", "()Landroidx/lifecycle/LiveData;", "currentUser", "getCurrentUser", "snackbarMessage", "getSnackbarMessage", "deleteThisCohort", "", "cohort", "Lcom/example/cohorts/core/model/Cohort;", "fetchChatReference", "Lcom/google/firebase/database/DatabaseReference;", "cohortUid", "initialiseJitsi", "broadcastReceiver", "Lorg/jitsi/meet/sdk/BroadcastReceiver;", "context", "Landroid/content/Context;", "sendImageMessage", "imageUri", "Landroid/net/Uri;", "sendNewMessage", "textMessage", "startNewMeeting", "ofCohort", "app_debug"})
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.cohorts.CohortsRepo cohortsRepository = null;
    private final com.example.cohorts.core.repository.chat.ChatRepo chatRepository = null;
    private final com.example.cohorts.core.repository.meeting.MeetingRepo meetingRepository = null;
    private final com.example.cohorts.core.repository.user.UserRepo userRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.String>> _snackbarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> snackbarMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.core.model.User> _currentUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.core.model.User> currentUser = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.Boolean>> _cohortDeleted = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.Boolean>> cohortDeleted = null;
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.cohorts.CohortsRepo cohortsRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.chat.ChatRepo chatRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.meeting.MeetingRepo meetingRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.user.UserRepo userRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.String>> getSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.core.model.User> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.Boolean>> getCohortDeleted() {
        return null;
    }
    
    /**
     * @param [cohortUid] uid of the cohort whose chat is required
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.DatabaseReference fetchChatReference(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
        return null;
    }
    
    /**
     * Gets the data of current user and posts the value in currentUser liveData
     */
    public final void getCurrentUser() {
    }
    
    /**
     * Starts a new meeting in given cohort
     *
     * @param ofCohort Cohort object containing the data of cohort whose new meeting is started
     * @param context [Context]
     */
    public final void startNewMeeting(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort ofCohort, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Initialises Jitsi with broadcastReceiver and the context
     *
     * @param broadcastReceiver for listening the broadcast events
     * @param context [Context]
     */
    public final void initialiseJitsi(@org.jetbrains.annotations.NotNull()
    org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Deletes the given cohort from database
     *
     * @param cohort object containing data data of [Cohort] to be deleted
     */
    public final void deleteThisCohort(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort cohort) {
    }
    
    /**
     * Sends a  new text message in [Cohort]
     *
     * @param textMessage the text to be sent
     * @param cohortUid uid of the [Cohort] in which the text is sent
     */
    public final void sendNewMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String textMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
    }
    
    /**
     * Sends a  new image message in [Cohort]
     *
     * @param imageUri uri of the image to be sent
     * @param cohortUid uid of the [Cohort] in which the image is sent
     */
    public final void sendImageMessage(@org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
    }
}