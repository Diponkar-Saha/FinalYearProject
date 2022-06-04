package com.example.cohorts.core.repository.chat;

import java.lang.System;

/**
 * Concrete implementation to load [ChatMessage]s from firebase realtime database and
 * to save images in firebase storage
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/cohorts/core/repository/chat/ChatRepository;", "Lcom/example/cohorts/core/repository/chat/ChatRepo;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "firebaseStorage", "Lcom/google/firebase/storage/FirebaseStorage;", "(Lcom/google/firebase/database/FirebaseDatabase;Lcom/google/firebase/storage/FirebaseStorage;)V", "chatReference", "Lcom/google/firebase/database/DatabaseReference;", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "fetchChatReference", "Lcom/example/cohorts/core/Result;", "cohortUid", "", "putImageInStorage", "", "uri", "Landroid/net/Uri;", "key", "imageMessage", "Lcom/example/cohorts/core/model/ChatMessage;", "sendImageMessage", "", "tempMessage", "imageUri", "(Lcom/example/cohorts/core/model/ChatMessage;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNewChatMessage", "chatMessage", "(Lcom/example/cohorts/core/model/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class ChatRepository implements com.example.cohorts.core.repository.chat.ChatRepo {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cohorts.core.repository.chat.ChatRepository.Companion Companion = null;
    private static final java.lang.String CHAT_CHILD = "chats";
    private static final java.lang.String LOADING_IMAGE_URL = "https://www.google.com/images/spin-32.gif";
    private static final java.lang.String CHAT_PHOTOS = "chat_photos";
    private final com.google.firebase.database.DatabaseReference chatReference = null;
    private final com.google.firebase.storage.StorageReference storageReference = null;
    
    @javax.inject.Inject()
    public ChatRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase, @org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.FirebaseStorage firebaseStorage) {
        super();
    }
    
    /**
     * Fetches the [DatabaseReference] of the chats of a [Cohort]
     *
     * @param cohortUid uid of the [Cohort] whose chat reference is required
     * @return [DatabaseReference] wrapped in [Result]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.core.Result<com.google.firebase.database.DatabaseReference> fetchChatReference(@org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid) {
        return null;
    }
    
    /**
     * Send a new text message
     *
     * Saves the given [ChatMessage] on firebase realtime database so that other
     * [User]s in the [Cohort] can see chat messages in realtime
     *
     * @param chatMessage [ChatMessage] object containing the info of the message
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendNewChatMessage(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.ChatMessage chatMessage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Send a new image message
     *
     * Saves the given [ChatMessage] on firebase realtime database so that other
     * [User]s in the [Cohort] can see that message in realtime
     *
     * Stores the given image in firebase storage and embeds a link to the saved image
     * in the given [ChatMessage]
     *
     * @param tempMessage [ChatMessage] that does not yet have the reference to the saved
     * image in firebase storage
     * @param imageUri [Uri] of the selected image to be sent
     * @return [Any] wrapped in [Result]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendImageMessage(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.core.model.ChatMessage tempMessage, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.cohorts.core.Result<? extends java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * Helper function for storing the image file in firebase storage
     *
     * Stores the given image in firebase storage and then embeds the generated link to that
     * image in [ChatMessage] which is supposed to have a link to that image
     *
     * @param storageReference [StorageReference] where the image file is supposed to be
     * stored
     * @param uri [Uri] of the image to be stored in storage
     * @param key [String] key of the temporary message that was saved and is supposed to have
     * a link to the given image in firebase storage
     * @param imageMessage [ChatMessage] temporary message that should contain the link to
     * given image
     */
    private final void putImageInStorage(com.google.firebase.storage.StorageReference storageReference, android.net.Uri uri, java.lang.String key, com.example.cohorts.core.model.ChatMessage imageMessage) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/core/repository/chat/ChatRepository$Companion;", "", "()V", "CHAT_CHILD", "", "CHAT_PHOTOS", "LOADING_IMAGE_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}