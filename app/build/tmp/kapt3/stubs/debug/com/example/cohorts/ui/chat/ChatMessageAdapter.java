package com.example.cohorts.ui.chat;

import java.lang.System;

/**
 * Adapter for displaying list of [ChatMessage]
 *
 * @param options [FirebaseRecyclerOptions] For displaying chats in realtime
 * @param progressBar [ProgressBar] For displaying chats loading
 * @param imageClickListener Click listener for image message click event
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u001f !\"#B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0002J \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatMessageAdapter;", "Lcom/firebase/ui/database/FirebaseRecyclerAdapter;", "Lcom/example/cohorts/core/model/ChatMessage;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "options", "Lcom/firebase/ui/database/FirebaseRecyclerOptions;", "progressBar", "Landroid/widget/ProgressBar;", "imageClickListener", "Lkotlin/Function2;", "", "Landroid/view/View;", "", "(Lcom/firebase/ui/database/FirebaseRecyclerOptions;Landroid/widget/ProgressBar;Lkotlin/jvm/functions/Function2;)V", "currentUser", "Lcom/example/cohorts/core/model/User;", "isProgressBarVisible", "", "getItemViewType", "", "position", "hideProgressBar", "onBindViewHolder", "holder", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentUser", "user", "Companion", "ImageMessageReceivedViewHolder", "ImageMessageSentViewHolder", "ReceivedTextViewHolder", "SentTextViewHolder", "app_debug"})
public final class ChatMessageAdapter extends com.firebase.ui.database.FirebaseRecyclerAdapter<com.example.cohorts.core.model.ChatMessage, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.firebase.ui.database.FirebaseRecyclerOptions<com.example.cohorts.core.model.ChatMessage> options = null;
    private final android.widget.ProgressBar progressBar = null;
    private final kotlin.jvm.functions.Function2<java.lang.String, android.view.View, kotlin.Unit> imageClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.ui.chat.ChatMessageAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_TEXT_SENT = 6;
    private static final int VIEW_TYPE_TEXT_RECEIVED = 69;
    private static final int VIEW_TYPE_IMAGE_SENT = 696;
    private static final int VIEW_TYPE_IMAGE_RECEIVED = 6969;
    private com.example.cohorts.core.model.User currentUser;
    private boolean isProgressBarVisible = true;
    
    public ChatMessageAdapter(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.database.FirebaseRecyclerOptions<com.example.cohorts.core.model.ChatMessage> options, @org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar progressBar, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super android.view.View, kotlin.Unit> imageClickListener) {
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
    com.example.cohorts.core.model.ChatMessage model) {
    }
    
    /**
     * Depending upon the item being of text type of image type and if they are sent by
     * the current user or not, returns the View type as a constant
     */
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    /**
     * Initialises the currentUser member variable
     * @param user the user object containing the data of the current user
     */
    public final void setCurrentUser(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.User user) {
    }
    
    /**
     * Hides the chat loading progress bar if it is not already hidden
     */
    private final void hideProgressBar() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatMessageAdapter$ReceivedTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemChatTextReceivedBinding;", "(Lcom/example/cohorts/ui/chat/ChatMessageAdapter;Lcom/example/cohorts/databinding/ItemChatTextReceivedBinding;)V", "bind", "", "chat", "Lcom/example/cohorts/core/model/ChatMessage;", "app_debug"})
    public final class ReceivedTextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemChatTextReceivedBinding binding = null;
        
        public ReceivedTextViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemChatTextReceivedBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.ChatMessage chat) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatMessageAdapter$SentTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemChatTextSentBinding;", "(Lcom/example/cohorts/ui/chat/ChatMessageAdapter;Lcom/example/cohorts/databinding/ItemChatTextSentBinding;)V", "bind", "", "chat", "Lcom/example/cohorts/core/model/ChatMessage;", "app_debug"})
    public final class SentTextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemChatTextSentBinding binding = null;
        
        public SentTextViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemChatTextSentBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.ChatMessage chat) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatMessageAdapter$ImageMessageReceivedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemChatImageReceivedBinding;", "(Lcom/example/cohorts/ui/chat/ChatMessageAdapter;Lcom/example/cohorts/databinding/ItemChatImageReceivedBinding;)V", "bind", "", "chat", "Lcom/example/cohorts/core/model/ChatMessage;", "app_debug"})
    public final class ImageMessageReceivedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemChatImageReceivedBinding binding = null;
        
        public ImageMessageReceivedViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemChatImageReceivedBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.ChatMessage chat) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatMessageAdapter$ImageMessageSentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemChatImageSentBinding;", "(Lcom/example/cohorts/ui/chat/ChatMessageAdapter;Lcom/example/cohorts/databinding/ItemChatImageSentBinding;)V", "bind", "", "chat", "Lcom/example/cohorts/core/model/ChatMessage;", "app_debug"})
    public final class ImageMessageSentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemChatImageSentBinding binding = null;
        
        public ImageMessageSentViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemChatImageSentBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.ChatMessage chat) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/cohorts/ui/chat/ChatMessageAdapter$Companion;", "", "()V", "VIEW_TYPE_IMAGE_RECEIVED", "", "VIEW_TYPE_IMAGE_SENT", "VIEW_TYPE_TEXT_RECEIVED", "VIEW_TYPE_TEXT_SENT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}