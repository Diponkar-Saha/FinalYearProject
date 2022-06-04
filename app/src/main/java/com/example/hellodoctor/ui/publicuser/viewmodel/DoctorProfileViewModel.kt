package com.example.hellodoctor.ui.publicuser.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.model.topdoctor.AllDoctor
import com.example.hellodoctor.repositort.SpecialRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DoctorProfileViewModel
@Inject
constructor(private val repository: SpecialRepository) : ViewModel()
{
    private val _response = MutableLiveData<List<AllDoctor>>()
    val responseDoctorlistShow: LiveData<List<AllDoctor>>
        get() = _response

    init {
        allDoctorlist()
    }

    private fun allDoctorlist() =viewModelScope.launch {
        repository.allDoctorlist().let { response ->
            if (response.isSuccessful){
                _response.postValue(response.body()?.result)
                Log.d("hhmmv", response.body().toString())
            }else{
                Log.d("tag", "getAllTvShows Error: ${response.code()}")

            }
        }
    }

}