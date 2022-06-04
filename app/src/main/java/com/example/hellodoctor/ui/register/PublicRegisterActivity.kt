package com.example.hellodoctor.ui.register

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.hellodoctor.databinding.ActivityPublicRegisterBinding
import com.example.hellodoctor.model.Public
import com.example.hellodoctor.repositort.FirebaseAuthViewModel
import com.example.hellodoctor.repositort.Resource
import com.example.hellodoctor.repositort.isValidEmail
import com.example.hellodoctor.ui.login.DrLoginActivity
import com.example.hellodoctor.ui.login.PublicLoginActivity
import com.example.hellodoctor.ui.publicuser.PublUserActivity
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PublicRegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPublicRegisterBinding
    private val authViewModel: FirebaseAuthViewModel by viewModels()
    private val viewModel:AUthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPublicRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initView()

    }

    private fun initView() {

        binding.apply {
            buttonRegisterHere.setOnClickListener {
                startActivity(Intent(this@PublicRegisterActivity,DrLoginActivity::class.java))
                finish()
            }
            buttonSignup.setOnClickListener {

                if (isValidData()) {
                    val name = editTextInputFirstName.text.toString()+editTextInputlastName.text.toString()

                    val firstname: String = binding.editTextInputFirstName.text.toString().trim()
                    val lastname: String = binding.editTextInputlastName.text.toString().trim()
                    val phone: String = binding.editTextInputPhone.text.toString().trim()
                    val password: String = binding.editTextInputPassword.text.toString().trim()
                    val email: String = binding.editTextInputemail.text.toString().trim()

                    viewModel.postSignupPublic(Public(firstname, lastname, phone,email, password))
                    viewModel.response.observe(this@PublicRegisterActivity, { response ->

                        Log.d("message", firstname + lastname + phone + password)
                        Log.d("body", response.body().toString())
                        Log.d("body", response.toString())
                        authViewModel.createUser(
                            FirebaseAuth.getInstance().uid.toString(),
                            name,
                            editTextInputemail.text.toString(),
                            editTextInputPassword.text.toString(),
                            "public"

                        )
                    })


                }
            }
        }

        authViewModel.registerState.observe(this, Observer { state->
            when (state) {
                is Resource.Success -> {

                    navigateToMainActivity()
                    Toast.makeText(this@PublicRegisterActivity, "success", Toast.LENGTH_SHORT)
                        .show()
                }
                is Resource.Error -> {
                    Toast.makeText(this@PublicRegisterActivity, "errror", Toast.LENGTH_SHORT)
                        .show()
                }
                is Resource.Loading -> {
                    Toast.makeText(this@PublicRegisterActivity, "loading", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })

    }

    private fun navigateToMainActivity() {
        startActivity(Intent(this@PublicRegisterActivity,PublUserActivity::class.java))
        finish()
    }

    private fun isValidData(): Boolean {
        binding.apply {

            if (editTextInputFirstName.text.isNullOrEmpty() || editTextInputFirstName.text.toString().length <= 3) {
                editTextInputFirstName.error = "Please enter the valid name4"
                return false
            } else if (editTextInputemail.text.isNullOrEmpty() || !editTextInputemail.text.toString().isValidEmail()) {
                editTextInputemail.error = "Please enter the valid email"
                return false
            } else if (editTextInputPhone.text.isNullOrEmpty() || editTextInputPhone.text.toString().length != 10) {
                editTextInputPhone.error = "Please enter the valid phone number"
                return false
            } else if (editTextInputPassword.text.isNullOrEmpty() || editTextInputPassword.text!!.length < 6) {
                editTextInputPassword.error = "Password Length should be greater than 6"
                return false
            } else if (editTextInputlastName.text.isNullOrEmpty() ) {
                editTextInputlastName.error = "Passwords Should Match"
                return false
            }
            return true
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@PublicRegisterActivity, PublicLoginActivity::class.java))
        finish()

    }



}