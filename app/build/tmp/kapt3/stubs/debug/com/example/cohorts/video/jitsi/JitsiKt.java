package com.example.cohorts.video.jitsi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\b\u0010\b\u001a\u00020\u0003H\u0002\u001a\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0001\u001a\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"JITSI_SERVER", "", "destroyJitsi", "", "context", "Landroid/content/Context;", "broadcastReceiver", "Lorg/jitsi/meet/sdk/BroadcastReceiver;", "hangUp", "initJitsi", "user", "Lcom/example/cohorts/core/model/User;", "launchJitsi", "cohortRoomCode", "registerForBroadcastMessages", "unregisterBroadcastReceiver", "app_debug"})
public final class JitsiKt {
    
    /**
     * This module provides all the methods that help in integrating Jitsi in the app
     */
    private static final java.lang.String JITSI_SERVER = "https://meet.jit.si";
    
    /**
     * Initialise the Jitsi severs URL and builds default Jitsi Meeting options
     * with the info of current user and other default settings.
     *
     * @param user object containing info about the current user
     * @param broadcastReceiver for listening to the event broadcasts by Jitsi
     * @param context [Context] object
     */
    public static final void initJitsi(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Launch a new Jitsi meeting with the given room code
     *
     * @param context [Context] object
     * @param cohortRoomCode room code of the meeting
     */
    public static final void launchJitsi(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortRoomCode) {
    }
    
    /**
     * Destroys the links between Jitsi and the app by unregistering the [BroadcastReceiver]
     * and also hangs up the ongoing call.
     *
     * @param context [Context] object
     * @param broadcastReceiver that was listening to broadcast events from Jitsi till now
     */
    public static final void destroyJitsi(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver) {
    }
    
    /**
     * This registers for every possible event sent back by Jitsi
     *
     * @param broadcastReceiver for listening to the broadcast events
     * @param context [Context] object
     */
    private static final void registerForBroadcastMessages(org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver, android.content.Context context) {
    }
    
    /**
     * Unregisters the given broadcastReceiver
     *
     * @param context [Context] object
     * @param broadcastReceiver that was listening to the broadcast events till now
     */
    private static final void unregisterBroadcastReceiver(android.content.Context context, org.jitsi.meet.sdk.BroadcastReceiver broadcastReceiver) {
    }
    
    /**
     * Hang up the ongoing call
     */
    private static final void hangUp() {
    }
}