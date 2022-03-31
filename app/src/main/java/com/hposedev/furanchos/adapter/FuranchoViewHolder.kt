package com.hposedev.furanchos.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.Furancho
import com.hposedev.furanchos.R

class FuranchoViewHolder(view:View) : RecyclerView.ViewHolder(view){

    val nameFurancho = view.findViewById<TextView>(R.id.textViewFurancho)
    val imageFurancho = view.findViewById<ImageView>(R.id.imageViewFurancho)

    fun render(furancho: Furancho){
        nameFurancho.text = furancho.nombre
        imageFurancho.drawable
    }
}