package com.roynaldi19.lazkotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberAdapter(private val listNumbers: List<Int>): RecyclerView.Adapter<NumberAdapter.ViewHolder>() {

    class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        val tvNumbers: TextView = view.findViewById(R.id.tv_numbers)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
           LayoutInflater.from(parent.context).inflate( R.layout.item_number, parent, false)
       )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNumbers.text = listNumbers[position].toString()
    }

    override fun getItemCount() = listNumbers.size
}