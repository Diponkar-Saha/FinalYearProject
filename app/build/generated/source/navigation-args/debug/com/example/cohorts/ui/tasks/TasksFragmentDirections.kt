package com.example.cohorts.ui.tasks

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.cohorts.R
import com.example.cohorts.core.model.Cohort
import com.example.cohorts.core.model.Task
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

class TasksFragmentDirections private constructor() {
  private data class ActionTaskToAddTask(
    val cohort: Cohort? = null
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_task_to_add_task

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Cohort::class.java)) {
        result.putParcelable("cohort", this.cohort as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(Cohort::class.java)) {
        result.putSerializable("cohort", this.cohort as Serializable?)
      }
      return result
    }
  }

  private data class ActionTaskToTaskDetail(
    val task: Task? = null
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_task_to_task_detail

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Task::class.java)) {
        result.putParcelable("task", this.task as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(Task::class.java)) {
        result.putSerializable("task", this.task as Serializable?)
      }
      return result
    }
  }

  companion object {
    fun actionTaskToAddTask(cohort: Cohort? = null): NavDirections = ActionTaskToAddTask(cohort)

    fun actionTaskToTaskDetail(task: Task? = null): NavDirections = ActionTaskToTaskDetail(task)
  }
}
