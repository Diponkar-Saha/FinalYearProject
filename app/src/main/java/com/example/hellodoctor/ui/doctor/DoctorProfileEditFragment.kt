package com.example.hellodoctor.ui.doctor

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.hellodoctor.databinding.FragmentDoctorProfileEditBinding
import com.example.hellodoctor.model.DoctorProfile
import com.example.hellodoctor.video.utils.Constants
import com.google.android.gms.tasks.Continuation
import com.google.android.gms.tasks.Task
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.UploadTask
import java.util.*


class DoctorProfileEditFragment : Fragment() {
    private var _binding: FragmentDoctorProfileEditBinding? = null
    private val binding get() = _binding!!
    private val viewModel: EditDoctorProfileViewModel by activityViewModels()

    private lateinit var imageUri: Uri
    private val fileName = UUID.randomUUID().toString()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDoctorProfileEditBinding.inflate(inflater, container, false)

        val name = viewModel.getUserDetails1().firstname+" " + viewModel.getUserDetails1().lastname
        binding.aboutDoctor.text = name
        binding.appCompatTextViewName.text = name
        binding.appCompatTextViewTitle.text = viewModel.getUserDetails1().title

        binding.buttonAppointment1.setOnClickListener {mView->
            uploadImage()
        }




        binding.profileImage.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, Constants.PICK_IMAGE)
        }

        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constants.PICK_IMAGE && resultCode == AppCompatActivity.RESULT_OK) {
            imageUri = data?.data!!
            //viewModel.uri = uri
            Glide.with(requireContext()).load(imageUri).circleCrop().into(binding.profileImage)
        }
    }

    private fun uploadImage(){
        val progressDialog = ProgressDialog(requireContext())
        progressDialog.setMessage("Uploading File....")
        progressDialog.setCancelable(false)
        progressDialog.show()

        val storageRef = FirebaseStorage.getInstance().getReference("images/$fileName")
        val uploadTask = storageRef.putFile(imageUri).addOnSuccessListener {
            if(progressDialog.isShowing) progressDialog.dismiss()
        }.addOnFailureListener {
            if(progressDialog.isShowing) progressDialog.dismiss()
        }



        uploadTask?.continueWithTask(Continuation<UploadTask.TaskSnapshot, Task<Uri>> { task ->
            if (!task.isSuccessful) {
                task.exception?.let {
                    throw it
                }
            }
            return@Continuation storageRef.downloadUrl
        })?.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val downloadUri = task.result
                Log.d("imageurl", downloadUri.toString())


                profileDataUpload(downloadUri.toString())

                // addUploadRecordToDb(downloadUri.toString())
            } else {
                // Handle failures
            }
        }?.addOnFailureListener{

        }
    }

    private fun profileDataUpload(imageUrl: String) {

        val doctordescription: String = binding.aboutDoctorDescription.text.toString().trim()
        val experience: String = binding.editExperience.text.toString().trim()
        val ratting: String = binding.editRatting.text.toString().trim()
        val surgery: String = binding.editSurgery.text.toString().trim()
        val totalpatient: String = binding.editpatient.text.toString().trim()

        val id = viewModel.getUserDetails1().id

        viewModel.postDoctorProfileList(DoctorProfile(doctordescription,id,experience,imageUrl,ratting,surgery,totalpatient))
        viewModel.response.observe(requireActivity(), { response ->


            Log.d("body", response.body().toString())
            Log.d("body", response.toString())
            Toast.makeText(
                requireContext(),
                "Successfully Upload ...",
                Toast.LENGTH_SHORT
            ).show()
            navigate()


        })

    }
    private fun navigate(){
        val direction = DoctorProfileEditFragmentDirections.actionDoctorProfileEditFragmentToDoctorProfileFragment()
        findNavController().navigate(direction)
    }


}