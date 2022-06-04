package com.example.hellodoctor.ui.cohorts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hellodoctor.databinding.ItemCohortBinding
import com.example.hellodoctor.model.Cohort
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton


class CohortsAdapter(
    options: FirestoreRecyclerOptions<Cohort>,
) : FirestoreRecyclerAdapter<Cohort, ViewHolder>(options) {

    // listener for item click events
    private var cohortItemClickListener: ((Cohort, View) -> Unit)? = null

    // listener for joinButton click events
    private var joinButtonClickListener: ((Cohort) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCohortBinding.inflate(inflater, parent, false)
        return CohortViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, model: Cohort) {
        (holder as CohortViewHolder).bind(model)
    }

    inner class CohortViewHolder(private val binding: ItemCohortBinding):
        ViewHolder(binding.root) {

        fun bind(cohortItem: Cohort) {
            binding.apply {
                cohortItemMcv.apply {
                    setOnClickListener { mcv ->
                        cohortItemClickListener!!(getItem(layoutPosition), mcv)
                    }
                    transitionName = cohortItem.cohortUid
                }
                joinVideoCallContainedButton.setOnClickListener {
                    joinButtonClickListener!!(getItem(layoutPosition))
                }
            }
            binding.cohort = cohortItem
        }
    }

    fun setCohortItemClickListener(listener: (Cohort, View) -> Unit) {
        cohortItemClickListener = listener
    }

    fun setJoinButtonClickListener(listener: (Cohort) -> Unit) {
        joinButtonClickListener = listener
    }

}


class ExtendedFloatingActionButtonScrollListener(
    private val extendedFab: ExtendedFloatingActionButton
) : RecyclerView.OnScrollListener() {

    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        if (newState == RecyclerView.SCROLL_STATE_IDLE
            && !extendedFab.isExtended && recyclerView.computeVerticalScrollOffset() == 0) {
            /*
            * if the top most item is visible and list items are not being scrolled
            * then extend the fab
            */
            extendedFab.extend()
        }
        super.onScrollStateChanged(recyclerView, newState)
    }

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        if (dy > 0 && extendedFab.isExtended) {
            // if the list items are scrolled vertically upwards then shrink the fab
            extendedFab.shrink()
        } else if (dy < 0  && !extendedFab.isExtended) {
            // if the list items are scrolled vertically downwards then extend the fab
            extendedFab.extend()
        }
        super.onScrolled(recyclerView, dx, dy)
    }

}