package com.example.appadit
/*
Tanggal Pengerjaan  : 13-05-2020
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class   ListAdapterGallery(private val list: List<Gallery>)
    : RecyclerView.Adapter<GalleryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return GalleryViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val gallery: Gallery = list[position]
        holder.bind(gallery)
    }

    override fun getItemCount(): Int = list.size

}

class GalleryViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item_gallery, parent, false)) {
    private var mImageView: ImageView? = null


    init {
        mImageView = itemView.findViewById(R.id.image)
    }

    fun bind(musik: Gallery) {
        mImageView?.setImageResource(musik.image)
    }

}