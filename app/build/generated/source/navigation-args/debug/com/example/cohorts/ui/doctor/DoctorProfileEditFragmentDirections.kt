package com.example.cohorts.ui.doctor

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.cohorts.R

class DoctorProfileEditFragmentDirections private constructor() {
  companion object {
    fun actionDoctorProfileEditFragmentToDoctorProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_doctorProfileEditFragment_to_doctorProfileFragment)
  }
}
