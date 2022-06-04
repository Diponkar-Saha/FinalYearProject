package com.example.cohorts.ui.publicuser.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/cohorts/ui/publicuser/adapter/SpecialShowViewAdater;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cohorts/ui/publicuser/adapter/SpecialShowViewAdater$MyViewHolder;", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/cohorts/model/special/SpecialItem;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "value", "", "tvShows", "getTvShows", "()Ljava/util/List;", "setTvShows", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class SpecialShowViewAdater extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cohorts.ui.publicuser.adapter.SpecialShowViewAdater.MyViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.cohorts.model.special.SpecialItem> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.cohorts.model.special.SpecialItem> differ = null;
    
    public SpecialShowViewAdater() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.cohorts.model.special.SpecialItem> getTvShows() {
        return null;
    }
    
    public final void setTvShows(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.cohorts.model.special.SpecialItem> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.ui.publicuser.adapter.SpecialShowViewAdater.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.ui.publicuser.adapter.SpecialShowViewAdater.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/ui/publicuser/adapter/SpecialShowViewAdater$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/SpecialItemBinding;", "(Lcom/example/cohorts/ui/publicuser/adapter/SpecialShowViewAdater;Lcom/example/cohorts/databinding/SpecialItemBinding;)V", "getBinding", "()Lcom/example/cohorts/databinding/SpecialItemBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.cohorts.databinding.SpecialItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.SpecialItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.cohorts.databinding.SpecialItemBinding getBinding() {
            return null;
        }
    }
}