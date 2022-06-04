package com.example.hellodoctor.repositort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FirebaseAuthViewModelFactory(private val repository: FirebaseAuthRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FirebaseAuthViewModel(repository) as T
    }

}