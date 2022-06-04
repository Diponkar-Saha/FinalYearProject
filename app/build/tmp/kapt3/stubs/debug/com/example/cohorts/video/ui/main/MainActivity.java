package com.example.cohorts.video.ui.main;

import java.lang.System;

/**
 * Activity that hosts the navHost Fragment and listens to broadcast events from Jitsi
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0014J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/cohorts/video/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "appTheme", "Lcom/example/cohorts/utils/Theme;", "binding", "Lcom/example/cohorts/databinding/ActivityMainBinding;", "broadcastReceiver", "Lorg/jitsi/meet/sdk/BroadcastReceiver;", "getBroadcastReceiver", "()Lorg/jitsi/meet/sdk/BroadcastReceiver;", "broadcastReceiver$delegate", "Lkotlin/Lazy;", "mainViewModel", "Lcom/example/cohorts/ui/main/MainViewModel;", "getMainViewModel", "()Lcom/example/cohorts/ui/main/MainViewModel;", "mainViewModel$delegate", "navController", "Landroidx/navigation/NavController;", "themeChangeItemClicked", "", "changeAppTheme", "", "theme", "onBroadcastReceived", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSupportNavigateUp", "showChangeThemeDialog", "signOut", "subscribeToObservers", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.video.ui.main.MainActivity.Companion Companion = null;
    private static final java.lang.String APP_THEME_EXTRA = "app_theme";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy broadcastReceiver$delegate = null;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.cohorts.utils.Theme appTheme;
    private com.example.cohorts.databinding.ActivityMainBinding binding;
    private androidx.navigation.NavController navController;
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private boolean themeChangeItemClicked = false;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jitsi.meet.sdk.BroadcastReceiver getBroadcastReceiver() {
        return null;
    }
    
    private final com.example.cohorts.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * Launch Firebase's AuthUI for signing out the user
     */
    private final void signOut() {
    }
    
    private final void subscribeToObservers() {
    }
    
    /**
     * Shows the change theme dialog and changes the theme with the theme selected
     */
    private final void showChangeThemeDialog() {
    }
    
    private final void changeAppTheme(com.example.cohorts.utils.Theme theme) {
    }
    
    /**
     * Receives the broadcast events from Jitsi and decides what to do with them
     */
    private final void onBroadcastReceived(android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/cohorts/video/ui/main/MainActivity$Companion;", "", "()V", "APP_THEME_EXTRA", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}