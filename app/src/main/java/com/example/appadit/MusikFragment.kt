package com.example.appadit
/*
Tanggal Pengerjaan  : 13-05-2020
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
import kotlinx.android.synthetic.main.fragment_musik.*


data class Musik(val title: String, val desc: String, val image: Int)

class MusikFragment : Fragment() {

    private val nicCageMusik = listOf(
        Musik("Avenged Sevenfold", "Save me", R.drawable.a7x),
        Musik("Avenged Sevenfold", "Almost Easy",  R.drawable.a7x),
        Musik("Avenged Sevenfold", "So Far Away",  R.drawable.a7x),
        Musik("Avenged Sevenfold", "Beast and The Harlot",  R.drawable.a7x),
        Musik("One Ok Rock", "The Beginning",  R.drawable.onokrock),
        Musik("One Ok Rock", "Takking Off",  R.drawable.onokrock),
        Musik("One Ok Rock", "Let's take it's someday",  R.drawable.onokrock),
        Musik("One Ok Rock", "Answer is near",  R.drawable.onokrock)
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