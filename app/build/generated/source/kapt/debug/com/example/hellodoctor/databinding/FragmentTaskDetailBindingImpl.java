package com.example.hellodoctor.databinding;
import com.example.hellodoctor.R;
import com.example.hellodoctor.BR;
import com.example.hellodoctor.model.Task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTaskDetailBindingImpl extends FragmentTaskDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.check_and_title_ll, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTaskDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentTaskDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.EditText) bindings[7]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            );
        this.editTaskDescriptionEt.setTag(null);
        this.editTaskFab.setTag(null);
        this.editTaskLayout.setTag(null);
        this.editTaskTitleEt.setTag(null);
        this.taskDetailCompleteCheckbox.setTag(null);
        this.taskDetailDescriptionText.setTag(null);
        this.taskDetailLayout.setTag(null);
        this.taskDetailRootLayout.setTag(null);
        this.taskDetailTitleText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.task == variableId) {
            setTask((Task) variable);
        }
        else if (BR.isEditing == variableId) {
            setIsEditing((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTask(@Nullable Task Task) {
        this.mTask = Task;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.task);
        super.requestRebind();
    }
    public void setIsEditing(@Nullable java.lang.Boolean IsEditing) {
        this.mIsEditing = IsEditing;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isEditing);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean isEditing = false;
        boolean taskCompleted = false;
        java.lang.String taskDescription = null;
        java.lang.String taskTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsEditing = false;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxIsEditing1 = false;
        int isEditingViewGONEViewVISIBLE = 0;
        Task task = mTask;
        java.lang.Boolean IsEditing1 = mIsEditing;
        int isEditingViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (task != null) {
                    // read task.completed
                    taskCompleted = task.isCompleted();
                    // read task.description
                    taskDescription = task.getDescription();
                    // read task.title
                    taskTitle = task.getTitle();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isEditing)
                androidxDatabindingViewDataBindingSafeUnboxIsEditing = androidx.databinding.ViewDataBinding.safeUnbox(IsEditing1);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsEditing) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(isEditing)
                isEditing = !androidxDatabindingViewDataBindingSafeUnboxIsEditing;
                // read androidx.databinding.ViewDataBinding.safeUnbox(isEditing) ? View.GONE : View.VISIBLE
                isEditingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsEditing) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isEditing) ? View.VISIBLE : View.GONE
                isEditingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsEditing) ? (android.view.View.VISIBLE) : (android.view.View.GONE));


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(isEditing))
                AndroidxDatabindingViewDataBindingSafeUnboxIsEditing1 = androidx.databinding.ViewDataBinding.safeUnbox(isEditing);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTaskDescriptionEt, taskDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTaskTitleEt, taskTitle);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.taskDetailCompleteCheckbox, taskCompleted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDetailDescriptionText, taskDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taskDetailTitleText, taskTitle);
            com.example.hellodoctor.ui.binding.BindingAdaptersKt.setStyle(this.taskDetailTitleText, taskCompleted);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.hellodoctor.ui.binding.BindingAdaptersKt.fabSrc(this.editTaskFab, AndroidxDatabindingViewDataBindingSafeUnboxIsEditing1);
            this.editTaskLayout.setVisibility(isEditingViewVISIBLEViewGONE);
            this.taskDetailLayout.setVisibility(isEditingViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): task
        flag 1 (0x2L): isEditing
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isEditing) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isEditing) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isEditing) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isEditing) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}