package com.example.cohorts.video.ui.splash;

import java.lang.System;

/**
 * Displays the Splash screen
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/cohorts/video/ui/splash/SplashScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/cohorts/databinding/ActivitySplashScreenBinding;", "isUserLoggedIn", "", "viewModel", "Lcom/example/cohorts/ui/splash/SplashViewModel;", "getViewModel", "()Lcom/example/cohorts/ui/splash/SplashViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "changeAppTheme", "", "theme", "Lcom/example/cohorts/utils/Theme;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashScreenActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.cohorts.databinding.ActivitySplashScreenBinding binding;
    private boolean isUserLoggedIn = false;
    
    public SplashScreenActivity() {
        super();
    }
    
    private final com.example.cohorts.ui.splash.SplashViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeToObservers() {
    }
    
    private final void changeAppTheme(com.example.cohorts.utils.Theme theme) {
    }
}