package com.example.cohorts.ui.chat;

import java.lang.System;

/**
 * AdapterDataObserver for Chat list
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/cohorts/ui/chat/ScrollToBottomObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/example/cohorts/ui/chat/ChatMessageAdapter;", "manager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/example/cohorts/ui/chat/ChatMessageAdapter;Landroidx/recyclerview/widget/LinearLayoutManager;)V", "onItemRangeInserted", "", "positionStart", "", "itemCount", "app_debug"})
public final class ScrollToBottomObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
    private final androidx.recyclerview.widget.RecyclerView recycler = null;
    private final com.example.cohorts.ui.chat.ChatMessageAdapter adapter = null;
    private final androidx.recyclerview.widget.LinearLayoutManager manager = null;
    
    public ScrollToBottomObserver(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recycler, @org.jetbrains.annotations.NotNull()
    com.example.cohorts.ui.chat.ChatMessageAdapter adapter, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager manager) {
        super();
    }
    
    /**
     * Scrolls to the bottom when a new item is added to the list
     */
    @java.lang.Override()
    public void onItemRangeInserted(int positionStart, int itemCount) {
    }
}