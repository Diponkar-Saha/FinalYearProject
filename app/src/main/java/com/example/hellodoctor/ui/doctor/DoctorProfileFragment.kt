package com.example.hellodoctor.ui.doctor

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.example.hellodoctor.databinding.FragmentDoctorProfileBinding


class DoctorProfileFragment : Fragment() {

    private var _binding: FragmentDoctorProfileBinding? = null

    private val binding get() = _binding!!

    private val viewModel: EditDoctorProfileViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDoctorProfileBinding.inflate(inflater, container, false)

        val id = viewModel.getUserDetails1().id
        val name = viewModel.getUserDetails1().firstname+" " + viewModel.getUserDetails1().lastname
        binding.aboutDoctor.text = name
        binding.appCompatTextViewname.text = name
        binding.appCompatTextViewtitle.text = viewModel.getUserDetails1().title


        viewModel.getDoctorProfile(id)
        viewModel.response1.observe(viewLifecycleOwner, Observer { response ->
            if (response.isSuccessful) {
                Log.d("message", response.body().toString())
                Log.d("message", response.toString())
                val z = response.body()?.result
                for (i in z!!.indices) {
                    Log.d("message", z[i].imageurl)
                    Log.d("message", z[i].ratting)
                    Log.d("message", z[i].doctordescription)
                    binding.edPatient.text = z[i].totalpatient
                    binding.editRatting.text = z[i].ratting
                    binding.editExperience.text = z[i].experience
                    binding.editSurgery.text = z[i].surgery
                    binding.aboutDoctorDescription.text =  z[i].doctordescription
                    Glide.with(requireContext()).load(z[i].imageurl).circleCrop().into(binding.profileImage)

                }


            }
        })

        binding.buttonAppointment1.setOnClickListener {mView->
            val direction = DoctorProfileFragmentDirections.actionDoctorProfileFragmentToDoctorProfileEditFragment()
            mView.findNavController().navigate(direction)
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}