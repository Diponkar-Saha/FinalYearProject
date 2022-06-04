package com.example.hellodoctor.ui.publicuser.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hellodoctor.databinding.SpecialItemBinding
import com.example.hellodoctor.model.special.SpecialItem


class SpecialShowViewAdater : RecyclerView.Adapter<SpecialShowViewAdater.MyViewHolder>() {
    inner class MyViewHolder(val binding: SpecialItemBinding):
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<SpecialItem>(){
        override fun areItemsTheSame(oldItem: SpecialItem, newItem: SpecialItem): Boolean {
            return oldItem.special == newItem.special
        }

        override fun areContentsTheSame(oldItem: SpecialItem, newItem: SpecialItem): Boolean {
            return newItem == oldItem
        }
    }
    private val differ = AsyncListDiffer(this, diffCallback)

    var tvShows: List<SpecialItem>
        get() = differ.currentList
        set(value) {
            differ.submitList(value)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            SpecialItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentTvShow = tvShows[position]

        holder.binding.apply {
            specialText.text = currentTvShow.special

//            specialImg.load(currentTvShow.imageurl) {
//                crossfade(true)
//                crossfade(1000)
//            }
        }
    }

    override fun getItemCount() = tvShows.size

}