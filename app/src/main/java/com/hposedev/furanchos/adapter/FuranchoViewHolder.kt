package com.hposedev.furanchos.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.Furancho
import com.hposedev.furanchos.databinding.ItemFuranchoBinding


class FuranchoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemFuranchoBinding.bind(view)


    fun render(furancho: Furancho, onClickListener: (Furancho) ->
    Unit) {
        binding.textViewFurancho.text = furancho.nombre
        binding.imageViewFurancho.setImageResource(furancho.imagen)
        binding.imageViewFurancho.setOnClickListener { onClickListener(furancho) }
    }
}

