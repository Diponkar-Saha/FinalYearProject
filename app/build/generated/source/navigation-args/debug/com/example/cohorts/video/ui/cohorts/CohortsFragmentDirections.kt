package com.example.cohorts.video.ui.cohorts

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.cohorts.R
import com.example.cohorts.core.model.Cohort
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

class CohortsFragmentDirections private constructor() {
  private data class ActionCohortToChat(
    val cohort: Cohort? = null
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_cohortTo_chat

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
    fun cohortsToAddNewCohorts(): NavDirections =
        ActionOnlyNavDirections(R.id.cohorts_to_addNewCohorts)

    fun actionCohortToProfile(): NavDirections =
        ActionOnlyNavDirections(R.id.action_cohortTo_profile)

    fun actionCohortToChat(cohort: Cohort? = null): NavDirections = ActionCohortToChat(cohort)
  }
}
