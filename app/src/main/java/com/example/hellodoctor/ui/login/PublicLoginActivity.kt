package com.example.hellodoctor.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.hellodoctor.ui.register.PublicRegisterActivity
import com.example.hellodoctor.databinding.ActivityPublicLoginBinding
import com.example.hellodoctor.model.Login
import com.example.hellodoctor.repositort.FirebaseAuthViewModel
import com.example.hellodoctor.repositort.Resource
import com.example.hellodoctor.ui.publicuser.PublUserActivity
import com.example.hellodoctor.video.ui.splash.SplashScreenActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PublicLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPublicLoginBinding
    private val authViewModel: FirebaseAuthViewModel by viewModels()
    private val viewModel: Login1ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPublicLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initViews()

    }

    private fun initViews() {


        binding.textViewLogin.setOnClickListener {
            startActivity(Intent(this@PublicLoginActivity, PublicRegisterActivity::class.java))
            finish()
        }




        binding.apply {
            buttonSignup.setOnClickListener {
                if (isValidData()) {
                    val email: String = binding.editTextInputPhone.text.toString().trim()
                    val password: String = binding.editTextInputPassword.text.toString().trim()


                    viewModel.postLoginPublic(Login(email, password))
                    viewModel.response1.observe(this@PublicLoginActivity, { response ->
                        authViewModel.loginUser(
                            editTextInputPhone.text.toString(),
                            editTextInputPassword.text.toString()
                        )
                    })
                }
            }
        }

        authViewModel.loginState.observe(this, Observer { state ->
            when (state) {
                is Resource.Success -> {
                    Toast.makeText(
                        this@PublicLoginActivity,
                        "User  Logged in succesfuuly",
                        Toast.LENGTH_LONG
                    ).show()
                    navigateToMainActivity()
                }
                is Resource.Error -> {
                    Toast.makeText(
                        this@PublicLoginActivity,
                        "User  Errr",
                        Toast.LENGTH_LONG
                    ).show()
                }
                is Resource.Loading -> {
                    Toast.makeText(
                        this@PublicLoginActivity,
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
        startActivity(Intent(this@PublicLoginActivity, PublUserActivity::class.java))
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@PublicLoginActivity, SplashScreenActivity::class.java))
        finish()

    }
}