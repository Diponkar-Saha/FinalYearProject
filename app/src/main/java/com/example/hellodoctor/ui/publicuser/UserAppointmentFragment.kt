package com.example.hellodoctor.ui.publicuser

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.hellodoctor.R
import com.example.hellodoctor.databinding.FragmentUserAppointmentBinding
import com.example.hellodoctor.model.report.ReportList
import com.example.hellodoctor.model.topdoctor.AllDoctor
import com.example.hellodoctor.ui.doctor.AppoinntmentViewModel
import com.example.hellodoctor.ui.doctor.EditDoctorProfileViewModel
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class UserAppointmentFragment : Fragment() {

    private var _binding: FragmentUserAppointmentBinding? = null

    private val binding get() = _binding!!
    private val args: UserAppointmentFragmentArgs by navArgs()
    private lateinit var doctor: AllDoctor
    private lateinit var email: String
    private val viewModel: EditDoctorProfileViewModel by activityViewModels()
    private val viewModel1: AppoinntmentViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserAppointmentBinding.inflate(inflater, container, false)

        doctor=args.doc
        val id =doctor._id
        val name =doctor.firstname+" "+doctor.lastname
        binding.appCompatTextView4.text = name
        binding.appCompatTextViewtitle.text = doctor.title

        profilePic(id)

        binding.next.setOnClickListener { mView->
            postReport(id)
            lifecycleScope.launch {
                delay(100L)
            }
            val direction = UserAppointmentFragmentDirections.actionUserAppointmentFragmentToDashBoardFragment()
            mView.findNavController().navigate(direction)
        }






//        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
//            val text = "You selected: " + if (R.id.radioMale == checkedId) "male" else "female"
//            Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
//        }

        return binding.root
    }

    private fun postReport(id: String) {
        val ee= FirebaseAuth.getInstance().currentUser?.email.toString()
        Log.d("eeeeee", ee)
        val name: String = binding.name.text.toString().trim()
        val age: String = binding.appCompatEditTextAge.text.toString().trim()
        val weight: String = binding.appCompatEditTextweight.text.toString().trim()
        val reason: String = binding.appCompatEditTextReason.text.toString().trim()
        val briefReason: String = binding.appCompatEditTextBrief.text.toString().trim()

        viewModel1.postLoginPublic(ReportList(id,age,name,weight,briefReason,reason,ee))
        viewModel1.response1.observe(requireActivity()) { response ->



            Log.d("body", response.body().toString())
            Log.d("body", response.toString())
            Toast.makeText(
                requireContext(),
                "Successfully Upload ...",
                Toast.LENGTH_SHORT
            ).show()
        }
    }


    private fun profilePic(id: String) {
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

                    Glide.with(requireContext()).load(z[i].imageurl).circleCrop().into(binding.appCompatImageView)

                }


            }
        })

    }




    override fun onAttach(context: Context) {
        super.onAttach(context)
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true)
            {
                override fun handleOnBackPressed() {
                    // Leave empty do disable back press or
                    // write your code which you want
                    findNavController().navigate(R.id.action_userAppointmentFragment_to_userViewDoctorFragment)
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(
            this,
            callback
        )
    }
}