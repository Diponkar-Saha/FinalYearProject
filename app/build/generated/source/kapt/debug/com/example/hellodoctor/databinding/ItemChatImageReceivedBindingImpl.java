package com.example.hellodoctor.databinding;
import com.example.hellodoctor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChatImageReceivedBindingImpl extends ItemChatImageReceivedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChatImageReceivedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemChatImageReceivedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            );
        this.itemChatImageIv.setTag(null);
        this.itemChatImageTv.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.messengerImageView.setTag(null);
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
        if (BR.chat == variableId) {
            setChat((com.example.hellodoctor.core.model.ChatMessage) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChat(@Nullable com.example.hellodoctor.core.model.ChatMessage Chat) {
        this.mChat = Chat;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.chat);
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
        com.example.hellodoctor.core.model.ChatMessage chat = mChat;
        java.lang.String chatImageUrl = null;
        java.lang.String chatPhotoUrl = null;
        java.lang.String chatName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (chat != null) {
                    // read chat.imageUrl
                    chatImageUrl = chat.getImageUrl();
                    // read chat.photoUrl
                    chatPhotoUrl = chat.getPhotoUrl();
                    // read chat.name
                    chatName = chat.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.hellodoctor.ui.binding.BindingAdaptersKt.imageUrl(this.itemChatImageIv, chatImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemChatImageTv, chatName);
            com.example.hellodoctor.ui.binding.BindingAdaptersKt.imageUrl(this.messengerImageView, chatPhotoUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): chat
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}