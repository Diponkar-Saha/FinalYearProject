package com.example.cohorts.core.repository.user;

import java.lang.System;

/**
 * Hilt module for providing the implementation of [UserRepo]
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/core/repository/user/UserRepositoryModule;", "", "()V", "bindUserRepository", "Lcom/example/cohorts/core/repository/user/UserRepo;", "impl", "Lcom/example/cohorts/core/repository/user/UserRepository;", "app_debug"})
@dagger.Module()
public abstract class UserRepositoryModule {
    
    public UserRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.cohorts.core.repository.user.UserRepo bindUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.user.UserRepository impl);
}