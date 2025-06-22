package com.example.navigation_component

import android.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation_component.databinding.ExampleadapterBinding

class ExampleRecyclerAdapter : RecyclerView.Adapter<ExampleRecyclerAdapter.ExampleViewHolder>() {

    private val adpterList = mutableListOf<Product>()

    inner class ExampleViewHolder(private var binding: ExampleadapterBinding): RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: Product){
        }
    }

    fun sumbitList(list: List<Product>) {
        adpterList.addAll(list)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExampleRecyclerAdapter.ExampleViewHolder {
        return ExampleViewHolder(
        ExampleadapterBinding.inflate(LayoutInflater.from(parent.context), parent , false )
        )
    }

    override fun onBindViewHolder(
        holder: ExampleRecyclerAdapter.ExampleViewHolder,
        position: Int
    ) {
        holder.onBind(adpterList[position])
    }

    override fun getItemCount(): Int {
        return adpterList.size
    }
}