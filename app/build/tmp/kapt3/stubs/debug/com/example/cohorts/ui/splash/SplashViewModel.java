package com.example.cohorts.ui.splash;

import java.lang.System;

/**
 * ViewModel for Splash screen
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0019H\u0002R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/cohorts/ui/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "themeRepository", "Lcom/example/cohorts/core/repository/theme/ThemeRepo;", "userRepository", "Lcom/example/cohorts/core/repository/user/UserRepo;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/cohorts/core/repository/theme/ThemeRepo;Lcom/example/cohorts/core/repository/user/UserRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_appTheme", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cohorts/utils/Theme;", "kotlin.jvm.PlatformType", "_isUserLoggedIn", "", "_navigate", "Lcom/example/cohorts/utils/Event;", "appTheme", "Landroidx/lifecycle/LiveData;", "getAppTheme", "()Landroidx/lifecycle/LiveData;", "isUserLoggedIn", "navigate", "getNavigate", "checkIfUserLoggedIn", "", "initialiseCurrentUser", "startTimer", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cohorts.core.repository.theme.ThemeRepo themeRepository = null;
    private final com.example.cohorts.core.repository.user.UserRepo userRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Event<java.lang.Boolean>> _navigate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.Boolean>> navigate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.cohorts.utils.Theme> _appTheme = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cohorts.utils.Theme> appTheme = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isUserLoggedIn = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isUserLoggedIn = null;
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.theme.ThemeRepo themeRepository, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.repository.user.UserRepo userRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Event<java.lang.Boolean>> getNavigate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cohorts.utils.Theme> getAppTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isUserLoggedIn() {
        return null;
    }
    
    public final void initialiseCurrentUser() {
    }
    
    /**
     * Start the timer and navigate to either MainActivity or LoginActivity
     */
    private final void startTimer() {
    }
    
    private final com.example.cohorts.utils.Theme getAppTheme() {
        return null;
    }
    
    private final void checkIfUserLoggedIn() {
    }
}