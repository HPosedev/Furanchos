package com.hposedev.furanchos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
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
    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerFurancho.layoutManager = LinearLayoutManager(this)
        binding.recyclerFurancho.adapter = FuranchoAdapter(ListaFuranchos.listaFuranchos)
        {furancho -> onItemSelected(furancho)}
        binding.recyclerFurancho.addItemDecoration(decoration)
    }

    fun onItemSelected(furancho: Furancho){

    }
}