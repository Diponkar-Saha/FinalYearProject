package com.example.hellodoctor.ui.publicuser

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hellodoctor.databinding.FragmentDashBoardBinding
import com.example.hellodoctor.ui.main.MainActivity


class DashBoardFragment : Fragment() {

    private var _binding: FragmentDashBoardBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashBoardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonRegisterHere.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
        }



        return root
    }


}