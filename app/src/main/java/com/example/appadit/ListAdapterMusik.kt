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

class   ListAdapterMusik(private val list: List<Musik>)
    : RecyclerView.Adapter<MusikViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusikViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MusikViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MusikViewHolder, position: Int) {
        val musik: Musik = list[position]
        holder.bind(musik)
    }

    override fun getItemCount(): Int = list.size

}

class MusikViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item_musik, parent, false)) {
    private var mTitleView: TextView? = null
    private var mDescView: TextView? = null
    private var mImageView: ImageView? = null


    init {
        mTitleView = itemView.findViewById(R.id.judul)
        mDescView = itemView.findViewById(R.id.desc)
        mImageView = itemView.findViewById(R.id.image)
    }

    fun bind(musik: Musik) {
        mTitleView?.text = musik.title
        mDescView?.text = musik.desc.toString()
        mImageView?.setImageResource(musik.image)
    }

}