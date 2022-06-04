package com.example.hellodoctor.ui.doctor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.hellodoctor.databinding.PatientAppointmentBinding
import com.example.hellodoctor.model.report.rr.ReportResult


class ReportAdapter(private val cellClickListener: CellClickListener)
: RecyclerView.Adapter<ReportAdapter.MyViewHolder>()
{
    inner class MyViewHolder(val binding: PatientAppointmentBinding):
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<ReportResult>(){
        override fun areItemsTheSame(oldItem: ReportResult, newItem:ReportResult): Boolean {
            return oldItem._id == newItem._id
        }

        override fun areContentsTheSame(oldItem: ReportResult, newItem: ReportResult): Boolean {
            return newItem == oldItem
        }
    }
    private val differ = AsyncListDiffer(this, diffCallback)

    var doctorShows: List<ReportResult>
        get() = differ.currentList
        set(value) {
            differ.submitList(value)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            PatientAppointmentBinding.inflate(
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
            textViewName.text = currentTvShow.patientname
            textViewAge.text = currentTvShow.patientage
            textViewProblem.text = currentTvShow.reasonvisit
            textViewProblemDec.text = currentTvShow.reasonbriefvisit

//            specialImg.load(currentTvShow.imageurl) {
//                crossfade(true)
//                crossfade(1000)
//            }
//            holder.binding.buttonAppointment.setOnClickListener {v ->
//                val intent = Intent(v.context, MainActivity::class.java)
//                v.context.startActivity(intent)
//               // sharedPref.saveReportData(currentTvShow)
//            }

        }
        holder.binding.buttonAppointment.setOnClickListener {
            cellClickListener.onCellClickListener(currentTvShow)
        }



    }

    override fun getItemCount()= doctorShows.size
}
interface CellClickListener {
    fun onCellClickListener(data: ReportResult)
}