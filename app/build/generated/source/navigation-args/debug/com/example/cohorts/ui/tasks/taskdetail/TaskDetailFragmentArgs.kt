package com.example.cohorts.ui.tasks.taskdetail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.cohorts.core.model.Task
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class TaskDetailFragmentArgs(
  val task: Task? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Task::class.java)) {
      result.putParcelable("task", this.task as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Task::class.java)) {
      result.putSerializable("task", this.task as Serializable?)
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): TaskDetailFragmentArgs {
      bundle.setClassLoader(TaskDetailFragmentArgs::class.java.classLoader)
      val __task : Task?
      if (bundle.containsKey("task")) {
        if (Parcelable::class.java.isAssignableFrom(Task::class.java) ||
            Serializable::class.java.isAssignableFrom(Task::class.java)) {
          __task = bundle.get("task") as Task?
        } else {
          throw UnsupportedOperationException(Task::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __task = null
      }
      return TaskDetailFragmentArgs(__task)
    }
  }
}
