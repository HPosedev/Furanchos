package com.hposedev.furanchos.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.hposedev.furanchos.R
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
        val image = bundle?.get("image") as List<Int>
        val open = bundle?.get("open")
        val imageList = ArrayList<SlideModel>()
        for (i in image) {
            imageList.add(SlideModel(i, ScaleTypes.CENTER_CROP))
        }
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
        binding.tvName.text = name.toString()
        binding.tvAdress.text = adress.toString()
        binding.tvDescription.text = description.toString()
        binding.tvOpeningHours.text = open.toString()

    }
}