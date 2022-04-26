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
        val name = bundle?.get("name")
        val adress = bundle?.get("adress")
        val description = bundle?.get("description")
        val image = bundle?.get("image")

        binding.tvName.text = name.toString()
        binding.tvAdress.text = adress.toString()
        binding.tvDescription.text = description.toString()
        binding.ivDetail.setImageResource(image as Int)
    }
}