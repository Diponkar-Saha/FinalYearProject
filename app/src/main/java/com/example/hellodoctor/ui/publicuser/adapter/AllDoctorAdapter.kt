package com.example.hellodoctor.ui.publicuser.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hellodoctor.databinding.TopDoctorBinding
import com.example.hellodoctor.model.topdoctor.AllDoctor
import com.example.hellodoctor.ui.publicuser.HomeFragmentDirections


class AllDoctorAdapter : RecyclerView.Adapter<AllDoctorAdapter.MyViewHolder>()  {
    inner class MyViewHolder(val binding: TopDoctorBinding):
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<AllDoctor>(){
        override fun areItemsTheSame(oldItem: AllDoctor, newItem: AllDoctor): Boolean {
            return oldItem.firstname == newItem.firstname
        }

        override fun areContentsTheSame(oldItem: AllDoctor, newItem: AllDoctor): Boolean {
            return newItem == oldItem
        }
    }
    private val differ = AsyncListDiffer(this, diffCallback)

    var doctorShows: List<AllDoctor>
        get() = differ.currentList
        set(value) {
            differ.submitList(value)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            TopDoctorBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentTvShow = doctorShows[position]

        holder.binding.apply {

//            val name: String = currentTvShow.firstname
//            val name1: String = currentTvShow.lastname
//            val name2:String = "$name $name1"
            textViewName.text = currentTvShow.lastname

//            specialImg.load(currentTvShow.imageurl) {
//                crossfade(true)
//                crossfade(1000)
//            }
            holder.binding.buttonAppointment.setOnClickListener { mView->
                val direction = HomeFragmentDirections.actionHomeFragmentToUserViewDoctorFragment(currentTvShow)
                mView.findNavController().navigate(direction)
            }
        }


    }

    override fun getItemCount()= doctorShows.size
}