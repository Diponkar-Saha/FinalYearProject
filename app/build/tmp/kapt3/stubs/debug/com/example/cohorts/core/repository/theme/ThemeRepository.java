package com.example.cohorts.core.repository.theme;

import java.lang.System;

/**
 * Concrete implementation of the [ThemeRepo]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/cohorts/core/repository/theme/ThemeRepository;", "Lcom/example/cohorts/core/repository/theme/ThemeRepo;", "storage", "Lcom/example/cohorts/core/storage/Storage;", "(Lcom/example/cohorts/core/storage/Storage;)V", "getAppTheme", "Lcom/example/cohorts/utils/Theme;", "saveAppTheme", "", "theme", "app_debug"})
public final class ThemeRepository implements com.example.cohorts.core.repository.theme.ThemeRepo {
    private final com.example.cohorts.core.storage.Storage storage = null;
    
    @javax.inject.Inject()
    public ThemeRepository(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.storage.Storage storage) {
        super();
    }
    
    /**
     * Save the current app theme
     *
     * @param theme current theme of the app
     */
    @java.lang.Override()
    public void saveAppTheme(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.utils.Theme theme) {
    }
    
    /**
     * Get the current app theme
     *
     * @return current theme of the app
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.utils.Theme getAppTheme() {
        return null;
    }
}