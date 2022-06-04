package com.example.cohorts.ui.tasks;

import java.lang.System;

/**
 * Adapter for displaying task list
 *
 * @param options [FirebaseRecyclerOptions] for displaying realtime list of [Task]s
 * @param checkClickListener Listener for listening to check box click events
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J \u0010\u0016\u001a\u00020\b2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/cohorts/ui/tasks/TasksAdapter;", "Lcom/firebase/ui/database/FirebaseRecyclerAdapter;", "Lcom/example/cohorts/core/model/Task;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "options", "Lcom/firebase/ui/database/FirebaseRecyclerOptions;", "checkClickListener", "Lkotlin/Function1;", "", "(Lcom/firebase/ui/database/FirebaseRecyclerOptions;Lkotlin/jvm/functions/Function1;)V", "taskItemClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "onBindViewHolder", "holder", "position", "", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTaskItemClickListener", "listener", "TaskViewHolder", "app_debug"})
public final class TasksAdapter extends com.firebase.ui.database.FirebaseRecyclerAdapter<com.example.cohorts.core.model.Task, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.cohorts.core.model.Task, kotlin.Unit> checkClickListener = null;
    private kotlin.jvm.functions.Function2<? super com.example.cohorts.core.model.Task, ? super android.view.View, kotlin.Unit> taskItemClickListener;
    
    public TasksAdapter(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.database.FirebaseRecyclerOptions<com.example.cohorts.core.model.Task> options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.cohorts.core.model.Task, kotlin.Unit> checkClickListener) {
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
    com.example.cohorts.core.model.Task model) {
    }
    
    /**
     * Sets the click listener for task item click event
     *
     * @param listener lambda function for handling [Task] item click events
     */
    public final void setTaskItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.cohorts.core.model.Task, ? super android.view.View, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/cohorts/ui/tasks/TasksAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/ItemTasksBinding;", "(Lcom/example/cohorts/ui/tasks/TasksAdapter;Lcom/example/cohorts/databinding/ItemTasksBinding;)V", "bind", "", "taskItem", "Lcom/example/cohorts/core/model/Task;", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.cohorts.databinding.ItemTasksBinding binding = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.ItemTasksBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.core.model.Task taskItem) {
        }
    }
}