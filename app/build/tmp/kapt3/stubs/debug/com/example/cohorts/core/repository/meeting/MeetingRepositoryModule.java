package com.example.cohorts.core.repository.meeting;

import java.lang.System;

/**
 * Hilt Module for providing the implementation of [MeetingRepo]
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/core/repository/meeting/MeetingRepositoryModule;", "", "()V", "bindMeetingRepository", "Lcom/example/cohorts/core/repository/meeting/MeetingRepo;", "impl", "Lcom/example/cohorts/core/repository/meeting/MeetingRepository;", "app_debug"})
@dagger.Module()
public abstract class MeetingRepositoryModule {
    
    public MeetingRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityRetainedScoped()
    @dagger.Binds()
    public abstract com.example.cohorts.core.repository.meeting.MeetingRepo bindMeetingRepository(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.meeting.MeetingRepository impl);
}