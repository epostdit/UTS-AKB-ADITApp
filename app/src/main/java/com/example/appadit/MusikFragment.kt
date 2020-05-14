package com.example.appadit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import kotlinx.android.synthetic.main.fragment_activity.*
import kotlinx.android.synthetic.main.fragment_musik.*


data class Musik(val title: String, val year: Int, val image: Int)

class MusikFragment : Fragment() {

    private val nicCageMusik = listOf(
        Musik("Raising Arizona", 1987, R.drawable.bg1),
        Musik("Vampire's Kiss", 1988,  R.drawable.bg1),
        Musik("Con Air", 1997,  R.drawable.bg1),
        Musik("Face/Off", 1997,  R.drawable.bg1),
        Musik("National Treasure", 2004,  R.drawable.bg1),
        Musik("The Wicker Man", 2006,  R.drawable.bg1),
        Musik("Bad Lieutenant", 2009,  R.drawable.bg1),
        Musik("Kick-Ass", 2010,  R.drawable.bg1)
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_musik, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_musik.apply {
            list_musik.layoutManager = LinearLayoutManager(activity)
            list_musik.adapter = ListAdapterMusik(nicCageMusik)
        }
    }
}