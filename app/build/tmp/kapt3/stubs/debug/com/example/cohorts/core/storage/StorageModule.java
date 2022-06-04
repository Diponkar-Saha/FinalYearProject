package com.example.cohorts.core.storage;

import java.lang.System;

/**
 * Hilt module that provides implementation of [Storage]
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/core/storage/StorageModule;", "", "()V", "bindStorage", "Lcom/example/cohorts/core/storage/Storage;", "impl", "Lcom/example/cohorts/core/storage/SharedPreferenceStorage;", "app_debug"})
@dagger.Module()
public abstract class StorageModule {
    
    public StorageModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.example.cohorts.core.storage.Storage bindStorage(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.storage.SharedPreferenceStorage impl);
}