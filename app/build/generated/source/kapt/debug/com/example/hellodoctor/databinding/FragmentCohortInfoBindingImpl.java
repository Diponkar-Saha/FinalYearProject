package com.example.hellodoctor.databinding;
import com.example.hellodoctor.R;
import com.example.hellodoctor.BR;
import com.example.hellodoctor.model.Cohort;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCohortInfoBindingImpl extends FragmentCohortInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.info_edit_cohort_info_container, 5);
        sViewsWithIds.put(R.id.info_cohort_name_label_tv, 6);
        sViewsWithIds.put(R.id.info_cohort_description_label_tv, 7);
        sViewsWithIds.put(R.id.info_cohort_info_layout, 8);
        sViewsWithIds.put(R.id.info_cohort_desc_label_tv, 9);
        sViewsWithIds.put(R.id.info_edit_or_done_button, 10);
        sViewsWithIds.put(R.id.info_user_rcv, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCohortInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentCohortInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            );
        this.infoCohortDescTv.setTag(null);
        this.infoCohortDescriptionEt.setTag(null);
        this.infoCohortNameEt.setTag(null);
        this.infoCohortNameTv.setTag(null);
        this.infoRootLayout.setTag(null);
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
            setCohort((Cohort) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCohort(@Nullable Cohort Cohort) {
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
        Cohort cohort = mCohort;
        java.lang.String cohortCohortDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (cohort != null) {
                    // read cohort.cohortName
                    cohortCohortName = cohort.getCohortName();
                    // read cohort.cohortDescription
                    cohortCohortDescription = cohort.getCohortDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.infoCohortDescTv, cohortCohortDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.infoCohortDescriptionEt, cohortCohortDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.infoCohortNameEt, cohortCohortName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.infoCohortNameTv, cohortCohortName);
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