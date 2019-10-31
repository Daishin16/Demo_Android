package com.example.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item.view.*

class RecyclerAdapter(private val context: Context, private val imageUrlList: List<String>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageUrlList.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.MyViewHolder, position: Int) {
        Glide.with(context)
            .load(imageUrlList.get(position))
            .into(holder.itemView.item_iv)
    }

}