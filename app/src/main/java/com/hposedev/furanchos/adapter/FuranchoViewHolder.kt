package com.hposedev.furanchos.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.Furancho
import com.hposedev.furanchos.R
import com.hposedev.furanchos.databinding.ItemFuranchoBinding


class FuranchoViewHolder(view:View) : RecyclerView.ViewHolder(view){

    val binding = ItemFuranchoBinding.bind(view)


    fun render(furancho: Furancho){
        binding.textViewFurancho.text = furancho.nombre
        binding.imageViewFurancho.setImageResource(furancho.imagen)
    }
}

private fun ImageView.setImageResource(imageFurancho: ImageView?) {

}
