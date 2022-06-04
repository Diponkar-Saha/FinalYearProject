package com.example.hellodoctor.databinding;
import com.example.hellodoctor.R;
import com.example.hellodoctor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCohortBindingImpl extends ItemCohortBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.join_video_call_contained_button, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCohortBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemCohortBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.FrameLayout) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            );
        this.cohortItemMcv.setTag(null);
        this.itemCohortDescriptionTv.setTag(null);
        this.itemCohortMemberTv.setTag(null);
        this.itemCohortNameTv.setTag(null);
        this.itemCohortOngoingCallTv.setTag(null);
        this.joinVcButtonContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.cohort == variableId) {
            setCohort((com.example.hellodoctor.core.model.Cohort) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCohort(@Nullable com.example.hellodoctor.core.model.Cohort Cohort) {
        this.mCohort = Cohort;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cohort);
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
        java.lang.String cohortCohortName = null;
        com.example.hellodoctor.core.model.Cohort cohort = mCohort;
        boolean cohortCallOngoing = false;
        java.lang.String cohortCohortDescription = null;
        int cohortNumberOfMembers = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (cohort != null) {
                    // read cohort.cohortName
                    cohortCohortName = cohort.getCohortName();
                    // read cohort.callOngoing
                    cohortCallOngoing = cohort.isCallOngoing();
                    // read cohort.cohortDescription
                    cohortCohortDescription = cohort.getCohortDescription();
                    // read cohort.numberOfMembers
                    cohortNumberOfMembers = cohort.getNumberOfMembers();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemCohortDescriptionTv, cohortCohortDescription);
            com.example.hellodoctor.ui.binding.BindingAdaptersKt.numberOfMembers(this.itemCohortMemberTv, cohortNumberOfMembers);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemCohortNameTv, cohortCohortName);
            com.example.hellodoctor.ui.binding.BindingAdaptersKt.viewGoneOrVisible(this.itemCohortOngoingCallTv, cohortCallOngoing);
            com.example.hellodoctor.ui.binding.BindingAdaptersKt.viewGoneOrVisible(this.joinVcButtonContainer, cohortCallOngoing);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cohort
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}