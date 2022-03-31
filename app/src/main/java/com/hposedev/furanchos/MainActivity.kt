package com.hposedev.furanchos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hposedev.furanchos.adapter.FuranchoAdapter
import com.hposedev.furanchos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    fun initRecyclerView(){

        binding.recyclerFurancho.layoutManager = LinearLayoutManager(this)
        binding.recyclerFurancho.adapter = FuranchoAdapter(ListaFuranchos.listaFuranchos)
    }
}