package com.example.hellodoctor.ui.tasks.addNewTask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellodoctor.video.core.Result
import com.example.hellodoctor.core.model.Task
import com.example.hellodoctor.core.repository.tasks.TasksRepo
import com.example.hellodoctor.video.core.succeeded
import com.example.hellodoctor.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * ViewModel to Add new task screen
 */
@HiltViewModel
class AddNewTaskViewModel @Inject constructor(
    private val tasksRepository: TasksRepo,
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _snackbarMessage = MutableLiveData<Event<String>>()
    val snackbarMessage: LiveData<Event<String>> = _snackbarMessage

    /**
     * Save new [Task] to firebase database
     *
     * @param newTask task object to be saved on firebase
     * @param cohortUid uid of cohort the task belongs to
     */
    fun addNewTask(newTask: Task, cohortUid: String) {
        viewModelScope.launch(coroutineDispatcher) {
            val result = tasksRepository.addNewTask(newTask, cohortUid)
            if (result.succeeded) {
                _snackbarMessage.postValue(Event("Task added successfully!"))
            } else {
                val exception = (result as Result.Error).exception
                Timber.e(exception, "error adding new task")
                _snackbarMessage.postValue(Event("Couldn't add new task."))
            }
        }
    }

}