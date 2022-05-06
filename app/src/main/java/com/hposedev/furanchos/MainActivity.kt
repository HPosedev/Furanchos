package com.hposedev.furanchos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.hposedev.furanchos.adapter.FuranchoAdapter
import com.hposedev.furanchos.databinding.ActivityMainBinding
import java.io.Serializable

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
        intent.putExtra("name", furancho.name)
        intent.putExtra("adress", furancho.adress)
        intent.putExtra("description", furancho.description)
        intent.putExtra("image", furancho.image as Serializable)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.settings -> {
            // User chose the "Settings" item, show the app settings UI...
            true
        }

        R.id.action_favorite -> {
            // User chose the "Favorite" action, mark the current item
            // as a favorite...
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}