package com.example.hellodoctor.ui.publicuser

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hellodoctor.databinding.FragmentHomeBinding
import com.example.hellodoctor.ui.publicuser.adapter.AllDoctorAdapter
import com.example.hellodoctor.ui.publicuser.adapter.SpecialShowViewAdater
import com.example.hellodoctor.ui.publicuser.viewmodel.DoctorProfileViewModel
import com.example.hellodoctor.ui.publicuser.viewmodel.HomeViewmodel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val viewModel: HomeViewmodel by activityViewModels()
    private val viewModel1: DoctorProfileViewModel by activityViewModels()
    private lateinit var specialShowViewAdater: SpecialShowViewAdater
    private lateinit var doctorShowViewAdater: AllDoctorAdapter

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        lifecycleScope.launch {
            delay(800L)
            setUpRv2()

        }


        lifecycleScope.launch {
            delay(1000L)
            setUpRv1()

        }

        return root
    }

    private fun setUpRv1() {
        specialShowViewAdater = SpecialShowViewAdater()

        binding.recyclerViewSpecial.apply {
            adapter = specialShowViewAdater
            layoutManager = LinearLayoutManager(
                requireContext(), LinearLayoutManager.HORIZONTAL,
                false
            )

            setHasFixedSize(true)
        }

        viewModel.responseSpecialShow.observe(requireActivity()) { listTvShows ->

            specialShowViewAdater.tvShows = listTvShows
            Log.d("body", listTvShows.toString())

        }

    }

    private fun setUpRv2() {
        doctorShowViewAdater = AllDoctorAdapter()

        binding.recyclerViewTopDoctor.apply {
            adapter = doctorShowViewAdater
            layoutManager = LinearLayoutManager(
                requireContext()

            )

            setHasFixedSize(true)
        }

        viewModel1.responseDoctorlistShow.observe(requireActivity()) { listTvShows1 ->
            doctorShowViewAdater.doctorShows = listTvShows1
            //Log.Timber.d(listTvShows1.toString())

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}