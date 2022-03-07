package com.roynaldi19.lazkotlinrecyclerview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TextAdapter(private val listName: List<String>,
                  private val listener: OnAdapterListener) :
    RecyclerView.Adapter<TextAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tv_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_text, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = listName[position]
        holder.tvName.text = name
        holder.tvName.setOnClickListener {
            Log.i("TextAdapter", name)
            listener.onClick(name)
        }
    }

    override fun getItemCount() = listName.size

    interface OnAdapterListener {
        fun onClick(name: String)

    }
}