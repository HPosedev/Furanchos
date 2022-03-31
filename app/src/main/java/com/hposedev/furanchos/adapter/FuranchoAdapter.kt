package com.hposedev.furanchos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.Furancho
import com.hposedev.furanchos.R

class FuranchoAdapter (val furanchoList: List<Furancho>): RecyclerView.Adapter<FuranchoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuranchoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FuranchoViewHolder(layoutInflater.inflate(R.layout.item_furancho, parent, false))
    }

    override fun onBindViewHolder(holder: FuranchoViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = furanchoList.size

}