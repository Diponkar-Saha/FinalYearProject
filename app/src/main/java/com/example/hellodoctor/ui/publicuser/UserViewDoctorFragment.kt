package com.example.hellodoctor.ui.publicuser

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.hellodoctor.databinding.FragmentUserViewDoctorBinding
import com.example.hellodoctor.model.topdoctor.AllDoctor
import com.example.hellodoctor.ui.doctor.EditDoctorProfileViewModel


class UserViewDoctorFragment : Fragment() {
    private var _binding: FragmentUserViewDoctorBinding? = null
    private val binding get() = _binding!!
    private val args: UserViewDoctorFragmentArgs by navArgs()
    private lateinit var doctor: AllDoctor
    private val viewModel: EditDoctorProfileViewModel by activityViewModels()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserViewDoctorBinding.inflate(inflater, container, false)
        val root: View = binding.root
        doctor=args.doctorProfile
        val id =doctor._id
        val name =doctor.firstname+" "+doctor.lastname
        binding.appCompatTextViewname2.text = name
        binding.appCompatTextViewtitle.text = doctor.title


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


        binding.buttonAppointment1.setOnClickListener { mView->
            val direction = UserViewDoctorFragmentDirections.actionUserViewDoctorFragmentToUserAppointmentFragment(doctor)
            mView.findNavController().navigate(direction)
        }

        return root
    }




}