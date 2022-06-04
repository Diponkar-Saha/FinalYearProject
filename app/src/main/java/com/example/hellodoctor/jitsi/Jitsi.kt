package com.example.hellodoctor.jitsi

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.hellodoctor.core.model.User
import org.jitsi.meet.sdk.*
import java.lang.RuntimeException
import java.net.MalformedURLException
import java.net.URL


private const val JITSI_SERVER = "https://meet.jit.si"



fun initJitsi(user: User, broadcastReceiver: BroadcastReceiver, context: Context) {
    val serverURL = try {
        URL(JITSI_SERVER)
    } catch (e: MalformedURLException) {
        e.printStackTrace()
        throw RuntimeException("Invalid server URL!")
    }

    val userBundle = Bundle()
    userBundle.apply {
        putString("displayName", user.userName)
        putString("email", user.userEmail)
    }
    val userInfo = JitsiMeetUserInfo(userBundle)

    val defaultJitsiOptions = JitsiMeetConferenceOptions.Builder()
        .setServerURL(serverURL)
       // .setWelcomePageEnabled(false)
        .setFeatureFlag("chat.enabled", false)
        .setFeatureFlag("invite.enabled", false)
        .setFeatureFlag("call-integration.enabled", false)
        .setAudioMuted(true)
        .setVideoMuted(true)
        .setUserInfo(userInfo)
        .build()
    JitsiMeet.setDefaultConferenceOptions(defaultJitsiOptions)
    registerForBroadcastMessages(broadcastReceiver, context)
}


fun launchJitsi(context: Context, cohortRoomCode: String) {
    val jitsiMeetOptions = JitsiMeetConferenceOptions.Builder()
        .setRoom(cohortRoomCode)
        .build()
    JitsiMeetActivity.launch(context, jitsiMeetOptions)
}

fun destroyJitsi(context: Context, broadcastReceiver: BroadcastReceiver) {
    hangUp()
    unregisterBroadcastReceiver(context, broadcastReceiver)
}

private fun registerForBroadcastMessages(broadcastReceiver: BroadcastReceiver, context: Context) {
    val intentFilter = IntentFilter()


    for (type in BroadcastEvent.Type.values()) {
        intentFilter.addAction(type.action)
    }

    LocalBroadcastManager.getInstance(context)
        .registerReceiver(broadcastReceiver, intentFilter)
}


private fun unregisterBroadcastReceiver(context: Context, broadcastReceiver: BroadcastReceiver) {
    LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver)
}

private fun hangUp() {
    val hangupBroadcastIntent: Intent = BroadcastIntentHelper.buildHangUpIntent()
    LocalBroadcastManager
        .getInstance(org.webrtc.ContextUtils.getApplicationContext())
        .sendBroadcast(hangupBroadcastIntent)
}