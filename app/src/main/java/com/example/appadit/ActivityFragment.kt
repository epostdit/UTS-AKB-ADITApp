package com.example.appadit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import kotlinx.android.synthetic.main.fragment_activity.*


data class Movie(val judul: String, val image: Int)

class ActivityFragment : Fragment() {

    private val nicCageMovies = listOf(
        Movie("Setiap bangun tidur atau subuh berangkat kepasar untung mengirim barang", R.drawable.dagang),
        Movie("membantu bisnis orang tua dirumah atau dipasar", R.drawable.dagang),
        Movie("Pergi kekampus jika ada kelas", R.drawable.ss),
        Movie("Mengerjakan Tugas", R.drawable.ss),
        Movie("Touring bareng teman 2 Bulan 1x atau 1 Bulan 1x ke luar Kota jika hari libur", R.drawable.turing),
        Movie("Bermain Drum jika waktu sudah sore dan sedang santai",  R.drawable.adit7),
        Movie("Bermain game jika tugas sudah selesai", R.drawable.game)
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_activity, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            list_recycler_view.layoutManager = LinearLayoutManager(activity)
            list_recycler_view.adapter = ListAdapter(nicCageMovies)
        }
    }
}