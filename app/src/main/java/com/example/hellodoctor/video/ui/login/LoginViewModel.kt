package com.example.hellodoctor.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.core.repository.user.UserRepo
import com.example.hellodoctor.video.core.succeeded
import com.example.hellodoctor.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepo,
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _snackbarMessage = MutableLiveData<Event<String>>()
    val snackbarMessage: LiveData<Event<String>> = _snackbarMessage

    fun registerCurrentUser() {
        viewModelScope.launch(coroutineDispatcher) {
            val result = userRepository.registerCurrentUser()
            if (!result.succeeded) {
                _snackbarMessage.postValue(Event("Cannot log you in. Please try again."))
            }
        }
    }

}