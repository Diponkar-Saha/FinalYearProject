package com.example.cohorts.ui.info;

import java.lang.System;

/**
 * Adapter for displaying list of [User]s
 * @param options for displaying the list of [User]s in realtime
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002J\u001a\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0007\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/cohorts/ui/info/UserInfoAdapter;", "Lcom/firebase/ui/firestore/FirestoreRecyclerAdapter;", "Lcom/example/cohorts/core/model/User;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "options", "Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;", "(Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;)V", "mCurrentUser", "removeButtonOnClickListener", "Lkotlin/Function1;", "", "onBindViewHolder", "holder", "position", "", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentUser", "user", "setRemoveButtonClickListener", "listener", "UserInfoViewHolder", "app_debug"})
public final class UserInfoAdapter extends com.firebase.ui.firestore.FirestoreRecyclerAdapter<com.example.cohorts.core.model.User, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private com.example.cohorts.core.model.User mCurrentUser;
    private kotlin.jvm.functions.Function1<? super com.example.cohorts.core.model.User, kotlin.Unit> removeButtonOnClickListener;
    
    public UserInfoAdapter(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.firestore.FirestoreRecyclerOptions<com.example.cohorts.core.model.User> options) {
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
    com.example.cohorts.core.model.User model) {
    }
    
    /**
     * Sets the currentUser member variable with the given [User] object
     *
     * @param user object with data of user
     */
    public final void setCurrentUser(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user) {
    }
    
    /**
     * Sets removeButtonClickListener member variable
     *
     * @param listener click listener lambda function
     */
    public final void setRemoveButtonClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.cohorts.core.model.User, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/info/UserInfoAdapter$UserInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemInfoUserBinding;", "(Lcom/example/cohorts/ui/info/UserInfoAdapter;Lcom/example/cohorts/databinding/ItemInfoUserBinding;)V", "bind", "", "user", "Lcom/example/cohorts/core/model/User;", "app_debug"})
    public final class UserInfoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemInfoUserBinding binding = null;
        
        public UserInfoViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemInfoUserBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.User user) {
        }
    }
}