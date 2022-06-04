package com.example.hellodoctor.video.ui.cohorts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hellodoctor.databinding.FragmentCohortsBinding
import com.example.hellodoctor.core.model.Cohort
import com.example.hellodoctor.ui.cohorts.CohortsAdapter
import com.example.hellodoctor.ui.cohorts.CohortsViewModel
import com.example.hellodoctor.ui.cohorts.ExtendedFloatingActionButtonScrollListener
import com.example.hellodoctor.utils.snackbar
import com.example.hellodoctor.video.ui.main.MainActivity
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber


@AndroidEntryPoint
class CohortsFragment : Fragment() {

    private lateinit var binding: FragmentCohortsBinding
    private lateinit var navController: NavController
    private lateinit var cohortsAdapter: CohortsAdapter
    private val cohortsViewModel: CohortsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCohortsBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = findNavController()

        subscribeToObservers()

        setupCohortRcv()

        binding.addCohortsFab.setOnClickListener {
            navController.navigate(
                CohortsFragmentDirections.cohortsToAddNewCohorts()
            )
        }

        (activity as AppCompatActivity).supportActionBar?.subtitle = ""
    }

    override fun onStart() {
        cohortsAdapter.startListening()
        super.onStart()
    }

    override fun onStop() {
        cohortsAdapter.stopListening()
        super.onStop()
    }

    private fun subscribeToObservers() {
        cohortsViewModel.snackbarMessage.observe(viewLifecycleOwner, { event ->
            event.getContentIfNotHandled()?.let {
                binding.cohortsFragmentRootLayout.snackbar(it)
            }
        })
    }

    private fun setupCohortRcv() {
        val query = cohortsViewModel.fetchCohortsQuery()!!

        val cohortAdapterOptions = FirestoreRecyclerOptions.Builder<Cohort>()
            .setQuery(query, Cohort::class.java)
            .build()

        cohortsAdapter = CohortsAdapter(cohortAdapterOptions)

        // setting up onClickListeners
        cohortsAdapter.setCohortItemClickListener { cohort, mcv ->
            Timber.d( "cohort clicked with id: $cohort")
            val extras = FragmentNavigatorExtras(
                mcv to cohort.cohortUid
            )
            val action = CohortsFragmentDirections.actionCohortToChat(cohort)
            navController.navigate(action, extras)
        }
        cohortsAdapter.setJoinButtonClickListener { cohort ->
            Timber.d( "contained button clicked - $cohort")
            if (!cohortsViewModel.isCurrentUserInMeetingOfThisCohort(cohort)) {
                cohortsViewModel.addCurrentUserToOngoingMeeting(
                    cohort,
                    (activity as MainActivity).broadcastReceiver,
                    requireContext()
                )
            } else {
                binding.cohortsFragmentRootLayout.snackbar(
                    "You are already in this meeting!"
                )
            }
        }

        binding.cohortsRcv.apply {
            adapter = cohortsAdapter
            layoutManager = LinearLayoutManager(requireContext())
            addOnScrollListener(ExtendedFloatingActionButtonScrollListener(binding.addCohortsFab))
        }
    }

}
