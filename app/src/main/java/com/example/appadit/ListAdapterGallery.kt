package com.example.appadit

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
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null
    private var mImageView: ImageView? = null


    init {
        mTitleView = itemView.findViewById(R.id.judul)
        mYearView = itemView.findViewById(R.id.desc)
        mImageView = itemView.findViewById(R.id.image)
    }

    fun bind(musik: Gallery) {
        mTitleView?.text = musik.title
        mYearView?.text = musik.year.toString()
        mImageView?.setImageResource(musik.image)
    }

}