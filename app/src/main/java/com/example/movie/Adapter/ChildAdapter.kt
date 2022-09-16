package com.example.movie.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movie.R
import com.example.movie.databinding.ChildRecyclerViewBinding
import com.example.movie.databinding.ParentRecyclerViewBinding

class ChildAdapter (private val list: List<String>):
        RecyclerView.Adapter<ChildAdapter.MyViewHolder>(){

        inner class MyViewHolder(val viewDataBinding: ChildRecyclerViewBinding):
        RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildAdapter.MyViewHolder {
        val binding =
            ChildRecyclerViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ChildAdapter.MyViewHolder, position: Int) {
//        holder.viewDataBinding.childText.text = list[position]
      Glide
          .with(holder.itemView.context)
          .load(list[position])
          .fitCenter()
          .placeholder(R.drawable.ic_launcher_background)
          .into(holder.viewDataBinding.imageview)
    }
    override fun getItemCount(): Int {
        return list.size
    }
}