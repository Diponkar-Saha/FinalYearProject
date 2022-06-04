package com.example.cohorts.core.storage;

import java.lang.System;

/**
 * Concrete implementation of [Storage]
 *
 * Stores and retrieves the current app theme from [SharedPreferenceStorage]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/cohorts/core/storage/SharedPreferenceStorage;", "Lcom/example/cohorts/core/storage/Storage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getTheme", "", "setTheme", "", "value", "Companion", "app_debug"})
public final class SharedPreferenceStorage implements com.example.cohorts.core.storage.Storage {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.storage.SharedPreferenceStorage.Companion Companion = null;
    private static final java.lang.String SHARED_PREFERENCE_KEY = "COHORTS_SHARED_PREFERENCE";
    private static final java.lang.String THEME_KEY = "APP_THEME";
    private final android.content.SharedPreferences sharedPref = null;
    
    @javax.inject.Inject()
    public SharedPreferenceStorage(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    /**
     * Save the current app theme value as an [Int]
     *
     * @param value integer corresponding to the value of [Theme]
     */
    @java.lang.Override()
    public void setTheme(int value) {
    }
    
    /**
     * Get the current app theme that was saved as an [Int]
     *
     * @return integer value corresponding to the [Theme]
     */
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/cohorts/core/storage/SharedPreferenceStorage$Companion;", "", "()V", "SHARED_PREFERENCE_KEY", "", "THEME_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}