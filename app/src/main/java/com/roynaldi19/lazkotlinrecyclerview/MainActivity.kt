package com.roynaldi19.lazkotlinrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val mainAdapter = MainAdapter(names)
        findViewById<RecyclerView>(R.id.rv_main).adapter = mainAdapter
    }
}