package com.example.cohorts.video.ui.info;

import java.lang.System;

/**
 * Displays the Cohort Info screen and list of [User]s in [Cohort]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/cohorts/video/ui/info/CohortInfoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/cohorts/databinding/FragmentCohortInfoBinding;", "cohortArgument", "Lcom/example/cohorts/core/model/Cohort;", "cohortInfoViewModel", "Lcom/example/cohorts/ui/info/CohortInfoViewModel;", "getCohortInfoViewModel", "()Lcom/example/cohorts/ui/info/CohortInfoViewModel;", "cohortInfoViewModel$delegate", "Lkotlin/Lazy;", "userInfoAdapter", "Lcom/example/cohorts/ui/info/UserInfoAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onStop", "onViewCreated", "view", "setUpUserInfoRcv", "subscribeToObservers", "updateCohortInformation", "cohort", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CohortInfoFragment extends androidx.fragment.app.Fragment {
    private com.example.cohorts.databinding.FragmentCohortInfoBinding binding;
    private com.example.cohorts.core.model.Cohort cohortArgument;
    private final kotlin.Lazy cohortInfoViewModel$delegate = null;
    private com.example.cohorts.ui.info.UserInfoAdapter userInfoAdapter;
    
    public CohortInfoFragment() {
        super();
    }
    
    private final com.example.cohorts.ui.info.CohortInfoViewModel getCohortInfoViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void subscribeToObservers() {
    }
    
    private final void setUpUserInfoRcv() {
    }
    
    private final void updateCohortInformation(com.example.cohorts.core.model.Cohort cohort) {
    }
}