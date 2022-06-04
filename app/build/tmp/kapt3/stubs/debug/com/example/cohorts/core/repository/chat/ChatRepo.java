package com.example.cohorts.core.repository.chat;

import java.lang.System;

/**
 * Interface to the Chat Firebase database layer.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u000e\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/cohorts/core/repository/chat/ChatRepo;", "", "fetchChatReference", "Lcom/example/cohorts/core/Result;", "Lcom/google/firebase/database/DatabaseReference;", "cohortUid", "", "sendImageMessage", "tempMessage", "Lcom/example/cohorts/core/model/ChatMessage;", "imageUri", "Landroid/net/Uri;", "(Lcom/example/cohorts/core/model/ChatMessage;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNewChatMessage", "chatMessage", "(Lcom/example/cohorts/core/model/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ChatRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cohorts.core.Result<com.google.firebase.database.DatabaseReference> fetchChatReference(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendNewChatMessage(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.ChatMessage chatMessage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendImageMessage(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.ChatMessage tempMessage, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation);
}