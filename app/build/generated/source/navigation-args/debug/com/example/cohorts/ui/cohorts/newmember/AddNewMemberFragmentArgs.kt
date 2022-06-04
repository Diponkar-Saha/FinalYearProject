package com.example.cohorts.ui.cohorts.newmember

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.cohorts.core.model.Cohort
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class AddNewMemberFragmentArgs(
  val cohort: Cohort? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Cohort::class.java)) {
      result.putParcelable("cohort", this.cohort as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Cohort::class.java)) {
      result.putSerializable("cohort", this.cohort as Serializable?)
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): AddNewMemberFragmentArgs {
      bundle.setClassLoader(AddNewMemberFragmentArgs::class.java.classLoader)
      val __cohort : Cohort?
      if (bundle.containsKey("cohort")) {
        if (Parcelable::class.java.isAssignableFrom(Cohort::class.java) ||
            Serializable::class.java.isAssignableFrom(Cohort::class.java)) {
          __cohort = bundle.get("cohort") as Cohort?
        } else {
          throw UnsupportedOperationException(Cohort::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __cohort = null
      }
      return AddNewMemberFragmentArgs(__cohort)
    }
  }
}
