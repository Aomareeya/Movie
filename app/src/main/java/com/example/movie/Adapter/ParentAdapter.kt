package com.example.movie.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movie.databinding.ParentRecyclerViewBinding
import com.example.movie.model.Parent

class ParentAdapter(val list: List<Parent>):
    RecyclerView.Adapter<ParentAdapter.MyViewHolder>() {

    inner class MyViewHolder(val viewDataBinding: ParentRecyclerViewBinding):RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentAdapter.MyViewHolder {
        val binding =
            ParentRecyclerViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ParentAdapter.MyViewHolder, position: Int) {
        holder.viewDataBinding.section.text=list[position].section

        holder.viewDataBinding.childRecyclerView.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=ChildAdapter(list[position].list)
        }
    }
    override fun getItemCount(): Int {
       return list.size
    }
}