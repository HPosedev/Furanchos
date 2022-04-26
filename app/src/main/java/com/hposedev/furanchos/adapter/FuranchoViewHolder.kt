package com.hposedev.furanchos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.Furancho
import com.hposedev.furanchos.databinding.ItemFuranchoBinding


class FuranchoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemFuranchoBinding.bind(view)


    fun render(furancho: Furancho, onClickListener: (Furancho) ->
    Unit) {
        binding.textViewFurancho.text = furancho.name
        binding.imageViewFurancho.setImageResource(furancho.image)
        binding.imageViewFurancho.setOnClickListener { onClickListener(furancho) }
    }
}

