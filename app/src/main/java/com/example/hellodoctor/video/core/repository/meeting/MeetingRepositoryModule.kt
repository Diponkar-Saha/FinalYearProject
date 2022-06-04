package com.example.hellodoctor.core.repository.meeting

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped


@InstallIn(ActivityRetainedComponent::class)
@Module
abstract class MeetingRepositoryModule {

    @Binds
    @ActivityRetainedScoped
    abstract fun bindMeetingRepository(impl: MeetingRepository): MeetingRepo

}