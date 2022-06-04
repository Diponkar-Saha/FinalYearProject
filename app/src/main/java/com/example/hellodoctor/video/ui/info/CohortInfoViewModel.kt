package com.example.hellodoctor.ui.info

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.video.core.Result
import com.example.hellodoctor.core.model.Cohort
import com.example.hellodoctor.core.model.User
import com.example.hellodoctor.core.repository.cohorts.CohortsRepo
import com.example.hellodoctor.core.repository.user.UserRepo
import com.example.hellodoctor.video.core.succeeded
import com.example.hellodoctor.utils.Event
import com.google.firebase.firestore.Query
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class CohortInfoViewModel @Inject constructor(
    private val cohortsRepository: CohortsRepo,
    private val userRepository: UserRepo,
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _currentUser = MutableLiveData<User>()
    val currentUser: LiveData<User> = _currentUser

    private val _snackbarMessage = MutableLiveData<Event<String>>()
    val snackbarMessage: LiveData<Event<String>> = _snackbarMessage

    fun fetchUsersQuery(cohortUid: String): Query {
        val result = cohortsRepository.fetchUsersQuery(cohortUid)
        return (result as Result.Success).data
    }

    /**
     * Get the data of current user and initialise the _currentUser liveData
     */
    fun getCurrentUser() {
        viewModelScope.launch(coroutineDispatcher) {
            val result = userRepository.getCurrentUser()
            if (result.succeeded) {
                Timber.d("got current user - ${(result as Result.Success).data}")
                _currentUser.postValue(result.data!!)
            } else {
                Timber.e((result as Result.Error).exception, "couldn't get current user")
                _snackbarMessage.postValue(
                    Event("There was some error getting current user.")
                )
            }
        }
    }


    fun removeThisUserFromCohort(user: User, cohort: Cohort) {
        viewModelScope.launch(coroutineDispatcher) {
            val result = cohortsRepository.removeThisUserFromCohort(user, cohort)
            if (result.succeeded) {
                _snackbarMessage.postValue(
                    Event("${user.userName} was removed from ${cohort.cohortName}.")
                )
            } else {
                val exception = (result as Result.Error).exception
                Timber.e(exception, "error removing user from cohort")
                _snackbarMessage.postValue(
                    Event("There was some error removing the user.")
                )
            }
        }
    }

    fun updateThisCohort(cohort: Cohort) {
        viewModelScope.launch(coroutineDispatcher) {
            val result = cohortsRepository.saveCohort(cohort)
            if (result.succeeded) {
                _snackbarMessage.postValue(
                    Event("Cohort updated.")
                )
            } else {
                val exception = (result as Result.Error).exception
                Timber.e(exception, "error updating cohort info")
                _snackbarMessage.postValue(
                    Event("There was some error updating the cohort.")
                )
            }
        }
    }

}