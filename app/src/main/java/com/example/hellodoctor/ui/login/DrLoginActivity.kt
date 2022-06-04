package com.example.hellodoctor.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.hellodoctor.databinding.ActivityDrLoginBinding
import com.example.hellodoctor.model.Login
import com.example.hellodoctor.repositort.FirebaseAuthViewModel
import com.example.hellodoctor.repositort.Resource
import com.example.hellodoctor.ui.doctor.DoctorActivity
import com.example.hellodoctor.ui.register.DrRegisterActivity
import com.example.hellodoctor.ui.register.PublicRegisterActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DrLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDrLoginBinding
    private val authViewModel: FirebaseAuthViewModel by viewModels()
    private val viewModel: Login1ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initViews()

    }

    private fun initViews() {


        binding.textViewLogin.setOnClickListener {
            startActivity(Intent(this@DrLoginActivity, PublicRegisterActivity::class.java))
            finish()
        }




        binding.apply {
            textViewLogin.setOnClickListener {

                startActivity(Intent(this@DrLoginActivity, DrRegisterActivity::class.java))
                finish()
            }
            buttonSignup.setOnClickListener {
                if (isValidData()) {
                    val phone: String = binding.editTextInputPhone.text.toString().trim()
                    val password: String = binding.editTextInputPassword.text.toString().trim()


                    viewModel.postLoginDoctor(Login(phone, password))
                    viewModel.response.observe(this@DrLoginActivity, { response ->
                    authViewModel.loginUser(editTextInputPhone.text.toString(), editTextInputPassword.text.toString())
                        })
                }
            }
        }

        authViewModel.loginState.observe(this, Observer { state ->
            when (state) {
                is Resource.Success -> {
                    Toast.makeText(
                        this@DrLoginActivity,
                        "User  Logged in succesfuuly",
                        Toast.LENGTH_LONG
                    ).show()
                    navigateToMainActivity()
                }
                is Resource.Error -> {
                    Toast.makeText(
                        this@DrLoginActivity,
                        "User  Errr",
                        Toast.LENGTH_LONG
                    ).show()
                }
                is Resource.Loading -> {
                    Toast.makeText(
                        this@DrLoginActivity,
                        "User  Loading",
                        Toast.LENGTH_LONG
                    ).show()
                }


            }



        })

    }

    private fun isValidData(): Boolean {
        binding.apply {
            if (editTextInputPhone.text.isNullOrEmpty() ) {
                editTextInputPhone.error = "Please enter the valid email"
                return false
            } else if (editTextInputPassword.text.isNullOrEmpty() || editTextInputPassword.text!!.length < 6) {
                editTextInputPassword.error = "Password Length should be greater than 6"
                return false
            }
            return true
        }
    }

    private fun navigateToMainActivity() {
        startActivity(Intent(this@DrLoginActivity, DoctorActivity::class.java))
        finish()
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@DrLoginActivity, DrRegisterActivity::class.java))
        finish()

    }
}