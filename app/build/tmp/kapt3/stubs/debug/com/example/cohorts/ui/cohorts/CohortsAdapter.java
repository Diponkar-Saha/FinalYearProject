package com.example.cohorts.ui.cohorts;

import java.lang.System;

/**
 * Adapter for displaying list of [Cohort]s
 * @param options [FirestoreRecyclerOptions] for displaying realtime list of [Cohort]s
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J \u0010\u0016\u001a\u00020\n2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u001a\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\fR\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/cohorts/ui/cohorts/CohortsAdapter;", "Lcom/firebase/ui/firestore/FirestoreRecyclerAdapter;", "Lcom/example/cohorts/core/model/Cohort;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "options", "Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;", "(Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;)V", "cohortItemClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "", "joinButtonClickListener", "Lkotlin/Function1;", "onBindViewHolder", "holder", "position", "", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCohortItemClickListener", "listener", "setJoinButtonClickListener", "CohortViewHolder", "app_debug"})
public final class CohortsAdapter extends com.firebase.ui.firestore.FirestoreRecyclerAdapter<com.example.cohorts.core.model.Cohort, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private kotlin.jvm.functions.Function2<? super com.example.cohorts.core.model.Cohort, ? super android.view.View, kotlin.Unit> cohortItemClickListener;
    private kotlin.jvm.functions.Function1<? super com.example.cohorts.core.model.Cohort, kotlin.Unit> joinButtonClickListener;
    
    public CohortsAdapter(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.firestore.FirestoreRecyclerOptions<com.example.cohorts.core.model.Cohort> options) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.Cohort model) {
    }
    
    public final void setCohortItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.cohorts.core.model.Cohort, ? super android.view.View, kotlin.Unit> listener) {
    }
    
    public final void setJoinButtonClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.cohorts.core.model.Cohort, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/cohorts/CohortsAdapter$CohortViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemCohortBinding;", "(Lcom/example/cohorts/ui/cohorts/CohortsAdapter;Lcom/example/cohorts/databinding/ItemCohortBinding;)V", "bind", "", "cohortItem", "Lcom/example/cohorts/core/model/Cohort;", "app_debug"})
    public final class CohortViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemCohortBinding binding = null;
        
        public CohortViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemCohortBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.Cohort cohortItem) {
        }
    }
}