package com.example.gd3_c_0836

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0836.entity.Dosen

class RVDosenAdapter(private val  data: Array<Dosen>) : RecyclerView.Adapter<RVDosenAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVDosenAdapter.viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_dosen, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RVDosenAdapter.viewHolder, position: Int) {
        val curentItem = data[position]
        holder.tvNamaDosen.text = curentItem.name
        holder.tvDetailsDosen.text = curentItem.pengajar
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvNamaDosen : TextView = itemView.findViewById(R.id.tv_nama_dosen)
        val tvDetailsDosen : TextView = itemView.findViewById(R.id.tv_details_dosen)
    }
}