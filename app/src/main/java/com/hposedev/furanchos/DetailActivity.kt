package com.hposedev.furanchos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hposedev.furanchos.databinding.DetailActivityBinding

class DetailActivity: AppCompatActivity() {

    private lateinit var binding: DetailActivityBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = DetailActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData()


    }

    private fun getData() {
        val bundle = intent.extras
        val name = bundle?.get("nombre")
        val direccion = bundle?.get("direccion")
        val imagen = bundle?.get("imagen")

        binding.tvNombre.text = name.toString()
        binding.tvDireccion.text = direccion.toString()
        binding.ivDetail.setImageResource(imagen as Int)
    }
}