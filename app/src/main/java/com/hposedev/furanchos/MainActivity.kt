package com.hposedev.furanchos

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
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
        val manager = GridLayoutManager(this, 2)

        binding.recyclerFurancho.layoutManager = manager
        binding.recyclerFurancho.adapter = FuranchoAdapter(ListaFuranchos.listaFuranchos)
        {furancho -> onItemSelected(furancho)}


    }

    fun onItemSelected(furancho: Furancho){
        Toast.makeText(applicationContext, furancho.nombre, Toast.LENGTH_SHORT).show()
    }
}