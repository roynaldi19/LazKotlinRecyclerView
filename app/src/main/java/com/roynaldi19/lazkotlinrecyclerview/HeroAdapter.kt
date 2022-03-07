package com.roynaldi19.lazkotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeroAdapter(
    private val listHero: List<HeroModel>,
    private val listener: OnAdapterListener
) :
    RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.iv_hero)
        val textView: TextView = view.findViewById(R.id.tv_hero)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HeroAdapter.ViewHolder, position: Int) {
        val hero = listHero[position]
        holder.imageView.setImageResource(hero.image)
        holder.textView.text = hero.name
        holder.itemView.setOnClickListener {
            listener.onClick(hero)

        }
    }

    override fun getItemCount() = listHero.size

    interface OnAdapterListener {
        fun onClick(hero: HeroModel)
    }
}