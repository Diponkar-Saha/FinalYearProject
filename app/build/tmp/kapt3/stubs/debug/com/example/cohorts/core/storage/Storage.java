package com.example.cohorts.core.storage;

import java.lang.System;

/**
 * Interface that acts as a layer between SharedPreferences and the app
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/core/storage/Storage;", "", "getTheme", "", "setTheme", "", "value", "app_debug"})
public abstract interface Storage {
    
    public abstract void setTheme(int value);
    
    public abstract int getTheme();
}