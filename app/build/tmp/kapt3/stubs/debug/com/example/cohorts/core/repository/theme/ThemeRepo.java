package com.example.cohorts.core.repository.theme;

import java.lang.System;

/**
 * Interface for acting as a layer between Storage and UI layer
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/core/repository/theme/ThemeRepo;", "", "getAppTheme", "Lcom/example/cohorts/utils/Theme;", "saveAppTheme", "", "theme", "app_debug"})
public abstract interface ThemeRepo {
    
    public abstract void saveAppTheme(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.utils.Theme theme);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.utils.Theme getAppTheme();
}