package com.example.cohorts.ui.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\rH\u0007\u001a\u001a\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0005H\u0007\u00a8\u0006\u0019"}, d2 = {"fabSrc", "", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "editing", "", "imageUrl", "view", "Landroid/widget/ImageView;", "url", "", "numberOfMembers", "Landroid/widget/TextView;", "", "photoUrl", "setStyle", "textView", "enabled", "setUserInfoButtonText", "Landroid/view/View;", "user", "Lcom/example/cohorts/core/model/User;", "currentUser", "viewGoneOrVisible", "visible", "app_debug"})
public final class BindingAdaptersKt {
    
    /**
     * Binding adapters for the entire project.
     */
    @androidx.databinding.BindingAdapter(value = {"bind:user", "bind:currentUser"}, requireAll = true)
    public static final void setUserInfoButtonText(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User currentUser) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"photoUrl"})
    public static final void photoUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void imageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"numberOfMembers"})
    public static final void numberOfMembers(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int numberOfMembers) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"viewGoneOrVisible"})
    public static final void viewGoneOrVisible(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:completedTask"})
    public static final void setStyle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, boolean enabled) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    @androidx.databinding.BindingAdapter(value = {"app:setIcon"})
    public static final void fabSrc(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton fab, boolean editing) {
    }
}