package com.example.appadit
/*
Tanggal Pengerjaan  :09-05-2020
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_account.*

/**
 * A simple [Fragment] subclass.
 */
class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findMe.setOnClickListener{
                val uri = Uri.parse("geo:-6.889612, 107.631851?q=6°53'22.6\"S 107°37'54.7\"E")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            try {
                Toast.makeText(activity, "Open Maps", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.889612, 107.631851?q=6°53'22.6\"S 107°37'54.7\"E")))
            }
        }
    }
}
