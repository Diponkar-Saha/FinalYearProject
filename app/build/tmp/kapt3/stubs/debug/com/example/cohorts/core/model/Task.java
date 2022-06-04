package com.example.cohorts.core.model;

import java.lang.System;

/**
 * Model class of a task
 *
 * @param title title of the task
 * @param description description of the task
 * @param isCompleted true if task completed otherwise false
 * @param taskId unique id of this task
 * @param taskOfCohort unique id of the cohort this task belongs to
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JA\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r\u00a8\u0006!"}, d2 = {"Lcom/example/cohorts/core/model/Task;", "Ljava/io/Serializable;", "title", "", "description", "isCompleted", "", "taskId", "taskOfCohort", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "()Z", "setCompleted", "(Z)V", "getTaskId", "getTaskOfCohort", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
public final class Task implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private boolean isCompleted;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String taskId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String taskOfCohort = null;
    
    /**
     * Model class of a task
     *
     * @param title title of the task
     * @param description description of the task
     * @param isCompleted true if task completed otherwise false
     * @param taskId unique id of this task
     * @param taskOfCohort unique id of the cohort this task belongs to
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.core.model.Task copy(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String taskOfCohort) {
        return null;
    }
    
    /**
     * Model class of a task
     *
     * @param title title of the task
     * @param description description of the task
     * @param isCompleted true if task completed otherwise false
     * @param taskId unique id of this task
     * @param taskOfCohort unique id of the cohort this task belongs to
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model class of a task
     *
     * @param title title of the task
     * @param description description of the task
     * @param isCompleted true if task completed otherwise false
     * @param taskId unique id of this task
     * @param taskOfCohort unique id of the cohort this task belongs to
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class of a task
     *
     * @param title title of the task
     * @param description description of the task
     * @param isCompleted true if task completed otherwise false
     * @param taskId unique id of this task
     * @param taskOfCohort unique id of the cohort this task belongs to
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Task() {
        super();
    }
    
    public Task(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.Nullable()
    java.lang.String taskOfCohort) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isCompleted() {
        return false;
    }
    
    public final void setCompleted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTaskOfCohort() {
        return null;
    }
}