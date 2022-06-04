package com.example.cohorts.ui.doctor

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.cohorts.R

class DoctorProfileFragmentDirections private constructor() {
  companion object {
    fun actionDoctorProfileFragmentToDoctorProfileEditFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_doctorProfileFragment_to_doctorProfileEditFragment)
  }
}
