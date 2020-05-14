package com.example.appadit

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


data class Gallery(val title: String, val year: Int, val image: Int)

class GalleryFragment : Fragment() {

    private val nicCageGallery = listOf(
        Gallery("Raising Arizona", 1987, R.drawable.bg1),
        Gallery("Vampire's Kiss", 1988,  R.drawable.bg1),
        Gallery("Con Air", 1997,  R.drawable.bg1),
        Gallery("Face/Off", 1997,  R.drawable.bg1),
        Gallery("National Treasure", 2004,  R.drawable.bg1),
        Gallery("The Wicker Man", 2006,  R.drawable.bg1),
        Gallery("Bad Lieutenant", 2009,  R.drawable.bg1),
        Gallery("Kick-Ass", 2010,  R.drawable.bg1)
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