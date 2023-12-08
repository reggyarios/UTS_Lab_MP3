package com.lab.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent:ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recyler_view_template,parent,false)) {

        private var imgView: ImageView? = null
        private var title: TextView? = null
        private var kalori: TextView? = null
        private var waktu: TextView? = null
        private var kelas: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        title = itemView.findViewById(R.id.title)
        kalori = itemView.findViewById(R.id.kalori)
        waktu = itemView.findViewById(R.id.waktu)
        kelas = itemView.findViewById(R.id.kelas)
    }

    fun bind(data: AdditionalExercise){
        imgView?.setImageResource(data.imgView)
        title?.text = data.title
        kalori?.text = data.kalori
        waktu?.text = data.waktu
        kelas?.text = data.kelas
    }

}