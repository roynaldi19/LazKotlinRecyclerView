package com.roynaldi19.lazkotlinrecyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageAdapter()
    }

    private fun textAdapter() {
        val names = listOf(
            "Budi",
            "Aris",
            "Ando",
            "Budi",
            "Aris",
            "Ando",
            "Budi",
            "Aris",
            "Ando"
        )
        Log.i("MainActivity", "size ${names.size}")

        names.forEach {
            Log.i("MainActivity", it)
        }

        val textAdapter = TextAdapter(names)
        findViewById<RecyclerView>(R.id.rv_main).adapter = textAdapter
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
        findViewById<RecyclerView>(R.id.rv_main).adapter = numberAdapter
    }

    private fun imageAdapter() {
        val images = listOf(
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto
        )

        val imageAdapter = ImageAdapter(images)
        findViewById<RecyclerView>(R.id.rv_main).adapter = imageAdapter
    }

}