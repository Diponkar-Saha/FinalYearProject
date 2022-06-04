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

data class UserAppointmentFragmentArgs(
  val doc: AllDoctor
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): UserAppointmentFragmentArgs {
      bundle.setClassLoader(UserAppointmentFragmentArgs::class.java.classLoader)
      val __doc : AllDoctor?
      if (bundle.containsKey("doc")) {
        if (Parcelable::class.java.isAssignableFrom(AllDoctor::class.java) ||
            Serializable::class.java.isAssignableFrom(AllDoctor::class.java)) {
          __doc = bundle.get("doc") as AllDoctor?
        } else {
          throw UnsupportedOperationException(AllDoctor::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__doc == null) {
          throw IllegalArgumentException("Argument \"doc\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"doc\" is missing and does not have an android:defaultValue")
      }
      return UserAppointmentFragmentArgs(__doc)
    }
  }
}
