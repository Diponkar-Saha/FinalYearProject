package com.example.hellodoctor.core.repository.meeting

import com.example.hellodoctor.core.Result
import com.example.hellodoctor.core.model.User


interface MeetingRepo {

    suspend fun addCurrentUserToOngoingMeeting(ofCohortUid: String): Result<User>

    suspend fun startNewMeeting(ofCohortUid: String): Result<Any>

    suspend fun leaveOngoingMeeting(): Result<Any>

    suspend fun onDestroy()

}