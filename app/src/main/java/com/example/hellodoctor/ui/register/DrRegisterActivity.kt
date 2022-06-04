package com.example.hellodoctor.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.hellodoctor.R
import com.example.hellodoctor.databinding.ActivityDrRegisterBinding
import com.example.hellodoctor.model.Doctor
import com.example.hellodoctor.repositort.FirebaseAuthViewModel
import com.example.hellodoctor.repositort.Resource
import com.example.hellodoctor.repositort.isValidEmail
import com.example.hellodoctor.ui.login.DrLoginActivity
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DrRegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDrRegisterBinding
    private val authViewModel: FirebaseAuthViewModel by viewModels()
    private val viewModel:AUthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val special = resources.getStringArray(R.array.speciality)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, special)

        binding.autoCompleteTextView.setAdapter(arrayAdapter)


        initView()
    }

    private fun initView() {

        binding.apply {
            buttonLogin.setOnClickListener {
                startActivity(Intent(this@DrRegisterActivity, DrLoginActivity::class.java))
                finish()

            }
            buttonSignup.setOnClickListener {

                if (isValidData()) {

                    val name = editTextInputFirstName.text.toString()+editTextInputlastName.text.toString()

                    val firstname: String = binding.editTextInputFirstName.text.toString().trim()
                    val lastname: String = binding.editTextInputlastName.text.toString().trim()
                    val phone: String = binding.editTextInputPhone.text.toString().trim()
                    val password: String = binding.editTextInputPassword.text.toString().trim()
                    val title: String = binding.editTextInputTitle.text.toString().trim()
                    val dateofbirth: String = binding.editTextInputEmail.text.toString().trim()
                    val bmdc: String = binding.editTextInputbmdc.text.toString().trim()
                    val nid: String = binding.editTextInputNid.text.toString().trim()
                    val speciality: String = binding.autoCompleteTextView.text.toString().trim()

                    viewModel.postSignupDoctor(Doctor(firstname, lastname, phone, password,title, speciality, dateofbirth, nid, bmdc))
                    viewModel.responseDoctor.observe(this@DrRegisterActivity, { response ->


                        authViewModel.createUser(
                            FirebaseAuth.getInstance().uid.toString(),
                            name,
                            editTextInputEmail.text.toString(),
                            editTextInputPassword.text.toString(),
                            "doctor"

                        )
                    })
                }
            }
        }

        authViewModel.registerState.observe(this, Observer { state->
            when (state) {
                is Resource.Success -> {

                    navigateToMainActivity()
                    Toast.makeText(this@DrRegisterActivity, "success", Toast.LENGTH_SHORT)
                        .show()
                }
                is Resource.Error -> {
                    Toast.makeText(this@DrRegisterActivity, "errror", Toast.LENGTH_SHORT)
                        .show()
                }
                is Resource.Loading -> {
                    Toast.makeText(this@DrRegisterActivity, "loading", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })

    }

    private fun navigateToMainActivity() {
        startActivity(Intent(this@DrRegisterActivity, DrLoginActivity::class.java))
        finish()
    }

    private fun isValidData(): Boolean {
        binding.apply {

            if (editTextInputFirstName.text.isNullOrEmpty() || editTextInputFirstName.text.toString().length <= 3) {
                editTextInputFirstName.error = "Please enter the valid name"
                return false
            } else if (editTextInputEmail.text.isNullOrEmpty() || !editTextInputEmail.text.toString().isValidEmail()) {
                editTextInputEmail.error = "Please enter the valid email"
                return false
            } else if (editTextInputPhone.text.isNullOrEmpty() || editTextInputPhone.text.toString().length != 10) {
                editTextInputPhone.error = "Please enter the valid phone number"
                return false
            } else if (editTextInputPassword.text.isNullOrEmpty() || editTextInputPassword.text!!.length < 6) {
                editTextInputPassword.error = "Password Length should be greater than 6"
                return false
            }
            else if (editTextInputbmdc.text.isNullOrEmpty() ) {
                editTextInputbmdc.error = "Please enter the valid bmdc"
            return false
        } else if (editTextInputNid.text.isNullOrEmpty() ) {
                editTextInputNid.error = "Please enter the valid nid"
            return false
        } else if (editTextInputTitle.text.isNullOrEmpty()) {
                editTextInputTitle.error = "Please enter the valid title"
            return false
        }
            else if (autoCompleteTextView.text.isNullOrEmpty()) {
                autoCompleteTextView.error = "Please enter the valid title"
                return false
            }
//binding.autoCompleteTextView.text.toString().trim()

            else if (editTextInputlastName.text.isNullOrEmpty() ) {
                editTextInputlastName.error = "Please enter the valid name"
                return false
            }
            return true
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@DrRegisterActivity, PublicRegisterActivity::class.java))
        finish()

    }
}