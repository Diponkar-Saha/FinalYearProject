package com.example.cohorts.ui.publicuser

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.cohorts.model.topdoctor.AllDoctor
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class UserViewDoctorFragmentArgs(
  val doctorProfile: AllDoctor
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): UserViewDoctorFragmentArgs {
      bundle.setClassLoader(UserViewDoctorFragmentArgs::class.java.classLoader)
      val __doctorProfile : AllDoctor?
      if (bundle.containsKey("doctorProfile")) {
        if (Parcelable::class.java.isAssignableFrom(AllDoctor::class.java) ||
            Serializable::class.java.isAssignableFrom(AllDoctor::class.java)) {
          __doctorProfile = bundle.get("doctorProfile") as AllDoctor?
        } else {
          throw UnsupportedOperationException(AllDoctor::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__doctorProfile == null) {
          throw IllegalArgumentException("Argument \"doctorProfile\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"doctorProfile\" is missing and does not have an android:defaultValue")
      }
      return UserViewDoctorFragmentArgs(__doctorProfile)
    }
  }
}
