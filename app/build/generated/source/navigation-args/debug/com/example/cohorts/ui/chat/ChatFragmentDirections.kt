package com.example.cohorts.ui.chat

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.cohorts.R
import com.example.cohorts.core.model.Cohort
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

class ChatFragmentDirections private constructor() {
  private data class ActionChatToAddNewMember(
    val cohort: Cohort? = null
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_chat_to_addNewMember

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

  private data class ActionChatToCohortInfo(
    val cohort: Cohort? = null
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_chat_to_cohortInfo

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

  private data class ActionChatToDetailedImage(
    val imageUrl: String? = "null"
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_chat_to_detailedImage

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("imageUrl", this.imageUrl)
      return result
    }
  }

  private data class ActionChatToTasks(
    val cohort: Cohort? = null
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_chat_to_tasks

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

  companion object {
    fun actionChatToAddNewMember(cohort: Cohort? = null): NavDirections =
        ActionChatToAddNewMember(cohort)

    fun actionChatToCohortInfo(cohort: Cohort? = null): NavDirections =
        ActionChatToCohortInfo(cohort)

    fun actionChatToDetailedImage(imageUrl: String? = "null"): NavDirections =
        ActionChatToDetailedImage(imageUrl)

    fun actionChatToTasks(cohort: Cohort? = null): NavDirections = ActionChatToTasks(cohort)
  }
}
