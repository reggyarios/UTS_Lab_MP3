package com.lab.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MealHolder(inflater: LayoutInflater,parent:ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.recyler_view_template_2,parent,false)){

    private var imgView: ImageView? = null
    private var title: TextView? = null
    private var kalori: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        title = itemView.findViewById(R.id.title)
        kalori = itemView.findViewById(R.id.kalori)
    }
    fun bindtwo(data: MealPlans){
        imgView?.setImageResource(data.imgView)
        title?.text = data.title
        kalori?.text = data.kalori}
}