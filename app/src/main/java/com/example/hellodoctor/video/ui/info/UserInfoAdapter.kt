package com.example.hellodoctor.ui.info

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hellodoctor.core.model.User
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hellodoctor.databinding.ItemInfoUserBinding
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import timber.log.Timber

class UserInfoAdapter(
    options: FirestoreRecyclerOptions<User>
) : FirestoreRecyclerAdapter<User, ViewHolder>(options) {

    private lateinit var mCurrentUser: User
    private var removeButtonOnClickListener: ((User) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Timber.d("onCreateViewHolder")
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemInfoUserBinding.inflate(inflater, parent, false)
        return UserInfoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, model: User) {
        (holder as UserInfoViewHolder).bind(model)
    }

    inner class UserInfoViewHolder(
        private val binding: ItemInfoUserBinding
    ) : ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.apply {
                Timber.d("current user while binding - $mCurrentUser")
                this.user = user
                this.currentUser = mCurrentUser

                itemInfoRemoveButton.setOnClickListener {
                    removeButtonOnClickListener!!(user)
                }
            }
            Timber.d("User - $user")
        }

    }


    fun setCurrentUser(user: User) {
        mCurrentUser = user
        Timber.d("setCurrentUser - $mCurrentUser")

    }


    fun setRemoveButtonClickListener(listener: (User) -> Unit) {
        removeButtonOnClickListener = listener
    }

}