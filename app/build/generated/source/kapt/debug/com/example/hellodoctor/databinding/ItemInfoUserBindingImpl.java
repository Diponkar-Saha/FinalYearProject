package com.example.hellodoctor.databinding;
import com.example.hellodoctor.R;
import com.example.hellodoctor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemInfoUserBindingImpl extends ItemInfoUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_info_userInfo_layout, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemInfoUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemInfoUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.itemInfoRemoveButton.setTag(null);
        this.itemInfoUserEmailTv.setTag(null);
        this.itemInfoUserNameTv.setTag(null);
        this.itemInfoUserRootLayout.setTag(null);
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
        if (BR.user == variableId) {
            setUser((com.example.hellodoctor.core.model.User) variable);
        }
        else if (BR.currentUser == variableId) {
            setCurrentUser((com.example.hellodoctor.core.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.example.hellodoctor.core.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setCurrentUser(@Nullable com.example.hellodoctor.core.model.User CurrentUser) {
        this.mCurrentUser = CurrentUser;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.currentUser);
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
        java.lang.String userUserEmail = null;
        com.example.hellodoctor.core.model.User user = mUser;
        java.lang.String userUserName = null;
        com.example.hellodoctor.core.model.User currentUser = mCurrentUser;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (user != null) {
                        // read user.userEmail
                        userUserEmail = user.getUserEmail();
                        // read user.userName
                        userUserName = user.getUserName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.hellodoctor.ui.binding.BindingAdaptersKt.setUserInfoButtonText(this.itemInfoRemoveButton, user, currentUser);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemInfoUserEmailTv, userUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemInfoUserNameTv, userUserName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): currentUser
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}