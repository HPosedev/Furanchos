package com.hposedev.furanchos

import android.content.Intent
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

        setSupportActionBar(binding.myToolbar)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val manager = GridLayoutManager(this, 2)

        binding.recyclerFurancho.layoutManager = manager
        binding.recyclerFurancho.adapter = FuranchoAdapter(ListaFuranchos.listaFuranchos)
        {furancho -> onItemSelected(furancho)}


    }

    fun onItemSelected(furancho: Furancho){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("nombre", furancho.nombre)
        intent.putExtra("direccion", furancho.direccion)
        intent.putExtra("imagen", furancho.imagen)
        startActivity(intent)
    }
}