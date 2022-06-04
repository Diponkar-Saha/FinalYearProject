package com.example.cohorts.ui.zoomedimage

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

data class ZoomedImageFragmentArgs(
  val imageUrl: String? = "null"
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("imageUrl", this.imageUrl)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ZoomedImageFragmentArgs {
      bundle.setClassLoader(ZoomedImageFragmentArgs::class.java.classLoader)
      val __imageUrl : String?
      if (bundle.containsKey("imageUrl")) {
        __imageUrl = bundle.getString("imageUrl")
      } else {
        __imageUrl = "null"
      }
      return ZoomedImageFragmentArgs(__imageUrl)
    }
  }
}
