package com.example.hellodoctor.ui.doctor

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hellodoctor.R
import com.example.hellodoctor.databinding.ActivityDoctorBinding
import com.example.hellodoctor.ui.login.DrLoginActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DoctorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDoctorBinding
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.nav_host_fragment_activity_doctor)

        val navView1: BottomNavigationView = binding.navViewDoctor

        visibilityNavElements(navController)
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView1.setupWithNavController(navController)

    }

    private fun visibilityNavElements(navController: NavController) {


        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.userViewDoctorFragment -> hideBothNavigation()



                else -> showBothNavigation()
            }
        }

    }

    private fun hideBothNavigation() { //Hide both drawer and bottom navigation bar
        binding.navViewDoctor.visibility = View.GONE
    }
    private fun showBothNavigation() {
        binding.navViewDoctor.visibility = View.VISIBLE

        setupNavControl() //To configure navController with drawer and bottom navigation
    }
    private fun setupNavControl() {
        binding.navViewDoctor.setupWithNavController(navController) //Setup Drawer navigation with navController

    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@DoctorActivity, DrLoginActivity::class.java))
        finish()

    }
}