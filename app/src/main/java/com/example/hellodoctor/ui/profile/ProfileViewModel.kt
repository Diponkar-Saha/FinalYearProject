package com.example.hellodoctor.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hellodoctor.core.Result
import com.example.hellodoctor.core.model.User
import com.example.hellodoctor.core.repository.user.UserRepo
import com.example.hellodoctor.core.succeeded
import com.example.hellodoctor.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

/**
 * ViewModel for Profile screen
 */
@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userRepository: UserRepo
) : ViewModel() {

    private val _currentUser = MutableLiveData(getCurrentUser())
    val currentUser: LiveData<User> = _currentUser

    private val _snackbarMessage = MutableLiveData<Event<String>>()
    val snackbarMessage: LiveData<Event<String>> = _snackbarMessage

    /**
     * Get data of currentUser logged in
     */
    private fun getCurrentUser(): User {
        val result = userRepository.getCurrentUser()
        return if (result.succeeded) {
            val user = (result as Result.Success).data
            Timber.d("user = $user")
            user
        } else {
            _snackbarMessage.postValue(Event("There was some error."))
            User()
        }
    }

}