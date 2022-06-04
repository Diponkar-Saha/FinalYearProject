package com.example.hellodoctor.ui.doctor

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hellodoctor.databinding.FragmentDoctorDashBinding
import com.example.hellodoctor.model.report.rr.ReportResult
import com.example.hellodoctor.ui.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DoctorDashFragment : Fragment(), CellClickListener {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentDoctorDashBinding? = null
    private val binding get() = _binding!!
    private lateinit var reportAdapter: ReportAdapter
    private val viewModel: EditDoctorProfileViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDoctorDashBinding.inflate(inflater, container, false)

        val id = viewModel.getUserDetails1().id

        reportAdapter = ReportAdapter(this)

        binding.recyclerViewPatient.apply {
            adapter = reportAdapter
            layoutManager = LinearLayoutManager(
                requireContext()

            )

            setHasFixedSize(true)
        }
// viewModel.responseSpecialShow.observe(requireActivity(), { listTvShows ->
        viewModel.getDoctorReport(id)
        viewModel.response2.observe(requireActivity(), { response ->
            if (response.isSuccessful) {

                reportAdapter.doctorShows = response.body()?.result!!

            }

            })

        return binding.root
    }

    override fun onCellClickListener(data: ReportResult) {
        val intent = Intent(requireContext(), MainActivity::class.java)
        startActivity(intent)
        viewModel.getUserDetails2(data)
        Toast.makeText(requireContext(),data.toString(),Toast.LENGTH_LONG).show()
    }


}