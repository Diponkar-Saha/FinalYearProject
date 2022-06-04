package com.example.hellodoctor.ui.publicuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hellodoctor.R
import com.example.hellodoctor.databinding.ActivityPublUserBinding
import com.example.hellodoctor.ui.login.PublicLoginActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PublUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPublUserBinding
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPublUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.nav_host_fragment_activity_main_user)

        val navView1: BottomNavigationView = binding.navViewUser

        visibilityNavElements(navController)
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView1.setupWithNavController(navController)
    }
    private fun visibilityNavElements(navController: NavController) {


        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.userViewDoctorFragment -> hideBothNavigation()
                R.id.userAppointmentFragment -> hideBothNavigation()



                else -> showBothNavigation()
            }
        }

    }

    private fun hideBothNavigation() { //Hide both drawer and bottom navigation bar
        binding.navViewUser.visibility = View.GONE
    }
    private fun showBothNavigation() {
        binding.navViewUser.visibility = View.VISIBLE

        setupNavControl() //To configure navController with drawer and bottom navigation
    }
    private fun setupNavControl() {
        binding.navViewUser.setupWithNavController(navController) //Setup Drawer navigation with navController

    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@PublUserActivity, PublicLoginActivity::class.java))
        finish()

    }
}