package com.tanvi.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapterClass(private val images:List<Int>):RecyclerView.Adapter<ViewPagerAdapterClass.ViewPagerViewHolder>() {


    inner class ViewPagerViewHolder( itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView=itemView.findViewById(R.id.ivImage)

    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapterClass.ViewPagerViewHolder {
         val view=LayoutInflater.from(parent.context).inflate(R.layout.itemswork,parent,false)
            return ViewPagerViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewPagerAdapterClass.ViewPagerViewHolder, position: Int) {
            val curImage=images[position]
            holder.imageView.setImageResource(curImage)

        }

    override fun getItemCount(): Int {
       return images.size
    }
}