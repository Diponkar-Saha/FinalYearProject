package com.example.cohorts.ui.publicuser

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.cohorts.R
import com.example.cohorts.model.topdoctor.AllDoctor
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class UserViewDoctorFragmentDirections private constructor() {
  private data class ActionUserViewDoctorFragmentToUserAppointmentFragment(
    val doc: AllDoctor
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_userViewDoctorFragment_to_userAppointmentFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(AllDoctor::class.java)) {
        result.putParcelable("doc", this.doc as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(AllDoctor::class.java)) {
        result.putSerializable("doc", this.doc as Serializable)
      } else {
        throw UnsupportedOperationException(AllDoctor::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionUserViewDoctorFragmentToUserAppointmentFragment(doc: AllDoctor): NavDirections =
        ActionUserViewDoctorFragmentToUserAppointmentFragment(doc)

    fun actionUserViewDoctorFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_userViewDoctorFragment_to_homeFragment)
  }
}
