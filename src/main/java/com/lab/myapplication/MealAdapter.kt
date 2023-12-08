package com.lab.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MealAdapter(private val data: ArrayList<MealPlans>): RecyclerView.Adapter<MealHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MealHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MealHolder, position: Int) {
        holder.bindtwo(data[position])
    }
}