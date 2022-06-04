package com.example.hellodoctor.core.repository.tasks

import com.example.hellodoctor.video.core.Result
import com.example.hellodoctor.core.model.Task
import com.example.hellodoctor.utils.safeCall
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import kotlinx.coroutines.tasks.await
import timber.log.Timber
import javax.inject.Inject


class TasksRepository @Inject constructor(
    firebaseDatabase: FirebaseDatabase
) : TasksRepo {

    companion object {
        private const val TASKS_CHILD = "tasks"
    }

    private val tasksReference = firebaseDatabase.reference.child(TASKS_CHILD)


    override fun fetchTaskReference(cohortUid: String): Result<DatabaseReference> {
        return safeCall {
            Result.Success(tasksReference.child(cohortUid))
        }
    }


    override suspend fun addNewTask(task: Task, cohortUid: String): Result<Any> {
        return safeCall {
            tasksReference.child(cohortUid).child(task.taskId).setValue(task).await()
            Result.Success(Any())
        }
    }

    override suspend fun markTaskCompleteOrActive(task: Task): Result<Any> {
        return safeCall {
            task.isCompleted = !task.isCompleted
            tasksReference.child(task.taskOfCohort!!).child(task.taskId).setValue(task).await()
            Result.Success(Any())
        }
    }


    override suspend fun clearAllTasks(ofCohortUid: String): Result<Any> {
        return safeCall {
            tasksReference.child(ofCohortUid).removeValue().await()
            Result.Success(Any())
        }
    }


    override suspend fun clearCompletedTasks(ofCohortUid: String): Result<Any> {
        return safeCall {
            val tasksSnapshot = tasksReference.child(ofCohortUid).get().await()
            for (snapshot in tasksSnapshot.children) {
                if (snapshot.exists()) {
                    val task = snapshot.getValue<Task>()!!
                    if (task.isCompleted) {
                        snapshot.ref.removeValue()
                    }
                }
            }
            Result.Success(Any())
        }
    }


    override suspend fun updateTask(task: Task): Result<Any> {
        return safeCall {
            Timber.d("updating task - $task")
            tasksReference.child(task.taskOfCohort!!).child(task.taskId).setValue(task).await()
            Result.Success(Any())
        }
    }


    override suspend fun deleteTask(task: Task): Result<Any> {
        return safeCall {
            tasksReference.child(task.taskOfCohort!!).child(task.taskId).removeValue().await()
            Result.Success(Any())
        }
    }
}