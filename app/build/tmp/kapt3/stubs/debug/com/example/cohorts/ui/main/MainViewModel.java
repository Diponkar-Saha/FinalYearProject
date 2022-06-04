package com.example.cohorts.ui.main;

import java.lang.System;

/**
 * ViewModel for MainActivity
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\rH\u0002J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0018J\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/cohorts/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "themeRepository", "Lcom/example/cohorts/core/repository/theme/ThemeRepo;", "meetingRepository", "Lcom/example/cohorts/core/repository/meeting/MeetingRepo;", "userRepository", "Lcom/example/cohorts/core/repository/user/UserRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/theme/ThemeRepo;Lcom/example/cohorts/core/repository/meeting/MeetingRepo;Lcom/example/cohorts/core/repository/user/UserRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_currentAppTheme", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Theme;", "kotlin.jvm.PlatformType", "_errorMessage", "", "currentAppTheme", "Landroidx/lifecycle/LiveData;", "getCurrentAppTheme", "()Landroidx/lifecycle/LiveData;", "errorMessage", "getErrorMessage", "changeAppTheme", "", "value", "", "getAppTheme", "onDestroy", "context", "Landroid/content/Context;", "broadcastReceiver", "Lorg/jitsi/meet/sdk/BroadcastReceiver;", "signOut", "terminateOngoingMeeting", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.theme.ThemeRepo themeRepository = null;
    private final com.example.cohorts.core.repository.meeting.MeetingRepo meetingRepository = null;
    private final com.example.cohorts.core.repository.user.UserRepo userRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Theme> _currentAppTheme = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Theme> currentAppTheme = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.theme.ThemeRepo themeRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.meeting.MeetingRepo meetingRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.user.UserRepo userRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Theme> getCurrentAppTheme() {
        return null;
    }
    
    /**
     * Terminate the ongoing meeting
     *
     * Detaches the broadcast receiver from Jitsi and removes the user from the ongoing
     * meeting
     *
     * @param context [Context]
     * @param broadcastReceiver broadcast receiver listening to Jitsi events
     */
    public final void terminateOngoingMeeting(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver) {
    }
    
    /**
     * Remove user from any ongoing meeting and terminate the meetings
     *
     * Removes the user from meetings of any cohort the user maybe in and
     * detaches the broadcast receiver from Jitsi
     *
     * @param context [Context]
     * @param broadcastReceiver listens to the event broadcasts by Jitsi
     */
    public final void onDestroy(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver) {
    }
    
    /**
     * Change the app theme
     *
     * Changes the current theme value of _currentTheme liveData and saves the updated
     * theme
     *
     * @param value [Int] value that will be mapped to app theme
     */
    public final void changeAppTheme(int value) {
    }
    
    /**
     * Sign the current user out
     */
    public final void signOut() {
    }
    
    private final com.example.cohorts.utils.Theme getAppTheme() {
        return null;
    }
}