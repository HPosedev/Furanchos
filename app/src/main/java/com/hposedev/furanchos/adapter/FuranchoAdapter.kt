package com.hposedev.furanchos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.Furancho
import com.hposedev.furanchos.R

class FuranchoAdapter(
    val furanchoList: List<Furancho>,
    private val onClickListener: (Furancho) ->
    Unit) : RecyclerView.Adapter<FuranchoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuranchoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FuranchoViewHolder(layoutInflater.inflate(R.layout.item_furancho, parent, false))
    }

    override fun onBindViewHolder(holder: FuranchoViewHolder, position: Int) {
        val item = furanchoList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = furanchoList.size

}