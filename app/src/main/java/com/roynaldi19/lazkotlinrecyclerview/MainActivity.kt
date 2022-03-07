package com.roynaldi19.lazkotlinrecyclerview

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heroAdapter()

    }

    private fun textAdapter() {
        val names = listOf(
            "Budi",
            "Aris",
            "Ando",
            "Koko",
            "Jaka",
            "Eko",
            "Gus",
            "Hari",
            "Tresno"
        )
        Log.i("MainActivity", "size ${names.size}")

        names.forEach {
            Log.i("MainActivity", it)
        }

        val textAdapter = TextAdapter(names, object : TextAdapter.OnAdapterListener{
            override fun onClick(name: String) {
                Toast.makeText(applicationContext, name, Toast.LENGTH_SHORT).show()
            }

        })
        findViewById<RecyclerView>(R.id.rv_main).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = textAdapter

        }
    }

    private fun numberAdapter() {
        val numbers = listOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9
        )

        val numberAdapter = NumberAdapter(numbers)
        findViewById<RecyclerView>(R.id.rv_main).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = numberAdapter

        }
    }

    private fun imageAdapter() {
        val images = listOf(
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto
        )

        val imageAdapter = ImageAdapter(images)

        findViewById<RecyclerView>(R.id.rv_main).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = imageAdapter

        }
    }

    private fun heroAdapter(){
        val hero = listOf<HeroModel>(
        HeroModel(1, "Ahmad Dahlan", R.drawable.ahmad_dahlan),
        HeroModel(2, "Ahmad Yani", R.drawable.ahmad_yani),
        HeroModel(3, "Bung Tomo", R.drawable.bung_tomo),
        HeroModel(4, "Gatot Subroto", R.drawable.gatot_subroto)
        )

        val heroAdapter = HeroAdapter(hero, object : HeroAdapter.OnAdapterListener{
            override fun onClick(hero: HeroModel) {
                Log.i("MainActivity", hero.toString())
                Toast.makeText(applicationContext, hero.id.toString(), Toast.LENGTH_SHORT).show()
            }

        })
        findViewById<RecyclerView>(R.id.rv_main).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = heroAdapter
        }

    }

}