package com.example.cohorts.ui.publicuser

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.cohorts.R
import com.example.cohorts.model.topdoctor.AllDoctor
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToUserViewDoctorFragment(
    val doctorProfile: AllDoctor
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeFragment_to_userViewDoctorFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(AllDoctor::class.java)) {
        result.putParcelable("doctorProfile", this.doctorProfile as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(AllDoctor::class.java)) {
        result.putSerializable("doctorProfile", this.doctorProfile as Serializable)
      } else {
        throw UnsupportedOperationException(AllDoctor::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionHomeFragmentToUserViewDoctorFragment(doctorProfile: AllDoctor): NavDirections =
        ActionHomeFragmentToUserViewDoctorFragment(doctorProfile)
  }
}
