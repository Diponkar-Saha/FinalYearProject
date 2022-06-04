package com.example.hellodoctor.repositort

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.core.model.User
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FirebaseAuthViewModel @Inject constructor(private val repository: FirebaseAuthRepository) : ViewModel() {
    var userLiveData: MutableLiveData<FirebaseUser>? = repository.userLiveData
    var loginUserLiveData: MutableLiveData<FirebaseUser>? = repository.loginUserLiveData

    val progress = MutableLiveData<Boolean>()
    private val _registerState = MutableLiveData<Resource<User>>()
    val registerState: LiveData<Resource<User>> = _registerState


    fun createUser(uid: String, name: String, email: String, password: String,photoUrl: String) = viewModelScope.launch {
       // progress.value  = true
        repository.createUser(uid,name, email,password,photoUrl).collect { status ->
            _registerState.postValue(status)
        }
    }

    private val _loginState = MutableLiveData<Resource<User>>()
    val loginState: LiveData<Resource<User>> = _loginState

    fun loginUser( email: String, password: String)= viewModelScope.launch   {

        repository.loginUser(email, password).collect {
            _loginState.postValue(it)
        }
    }

}