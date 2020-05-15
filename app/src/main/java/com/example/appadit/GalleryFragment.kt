package com.example.appadit
/*
Tanggal Pengerjaan  :13-05-2020
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import kotlinx.android.synthetic.main.fragment_activity.*
import kotlinx.android.synthetic.main.fragment_gallery.*
import kotlinx.android.synthetic.main.fragment_musik.*


data class Gallery(val image: Int)

class GalleryFragment : Fragment() {

    private val nicCageGallery = listOf(
        Gallery( R.drawable.adit1),
        Gallery(R.drawable.adit2),
        Gallery(R.drawable.adit3),
        Gallery(R.drawable.adit4),
        Gallery(R.drawable.adit5),
        Gallery(R.drawable.adit6),
        Gallery(R.drawable.adit7),
        Gallery(R.drawable.bg1)
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_gallery, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_galeri.apply {
            list_galeri.layoutManager = LinearLayoutManager(activity)
            list_galeri.adapter = ListAdapterGallery(nicCageGallery)
        }
    }
}