package com.example.cohorts.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\bH\u0086\b\u00f8\u0001\u0000\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\n\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0003H\u0007\u001a\n\u0010\u0014\u001a\u00020\n*\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, d2 = {"generateRandomString", "", "length", "", "safeCall", "Lcom/example/cohorts/core/Result;", "T", "action", "Lkotlin/Function0;", "fromThemeToInt", "Lcom/example/cohorts/utils/Theme;", "snackbar", "", "Landroid/view/View;", "message", "lengthShort", "", "themeColor", "Landroid/content/Context;", "themeAttrId", "toTheme", "app_debug"})
public final class UtilsKt {
    
    /**
     * Generated a random string of given length
     *
     * @param length length of string required
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String generateRandomString(int length) {
        return null;
    }
    
    /**
     * This function takes a lambda and calls it inside a try and catch block
     *
     * @param T
     * @param action () -> Result<T>
     * @return T wrapped in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.example.cohorts.core.Result<T> safeCall(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends com.example.cohorts.core.Result<? extends T>> action) {
        return null;
    }
    
    /**
     * View extension function for showing a snackbar
     */
    public static final void snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean lengthShort) {
    }
    
    /**
     * Extension function on [Theme] which converts [Theme] to [Int]
     *
     * @return [Int]
     */
    public static final int fromThemeToInt(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.utils.Theme $this$fromThemeToInt) {
        return 0;
    }
    
    /**
     * Extension function on [Int] which converts an [Int] to [Theme]
     *
     * @return [Theme]
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.utils.Theme toTheme(int $this$toTheme) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    @androidx.annotation.ColorInt()
    public static final int themeColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$themeColor, @androidx.annotation.AttrRes()
    int themeAttrId) {
        return 0;
    }
}