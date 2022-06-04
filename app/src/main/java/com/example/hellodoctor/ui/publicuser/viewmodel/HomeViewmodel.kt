package com.example.hellodoctor.ui.publicuser.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.model.special.SpecialItem
import com.example.hellodoctor.repositort.SpecialRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewmodel
@Inject
constructor(private val repository: SpecialRepository) : ViewModel(){
    private val _response = MutableLiveData<List<SpecialItem>>()
    val responseSpecialShow: LiveData<List<SpecialItem>>
        get() = _response

    init {
        getAllSpecialShows()
    }

    private fun getAllSpecialShows() =viewModelScope.launch {
        repository.getSpeciallist().let { response ->
            if (response.isSuccessful){
                _response.postValue(response.body()?.result)
                Log.d("hhmmv", response.body().toString())
            }else{
                Log.d("tag", "getAllTvShows Error: ${response.code()}")
            }
        }
    }
}