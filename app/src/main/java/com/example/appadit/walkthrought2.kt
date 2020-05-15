package com.example.appadit
/*
Tanggal Pengerjaan  : 06-05-2020
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_walkthrought1.*
import kotlinx.android.synthetic.main.activity_walkthrought2.*

class walkthrought2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrought2)

        button3.setOnClickListener {
            val intent = Intent(this, walkthrought3::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this, walkthrought1::class.java)
            startActivity(intent)

        }
    }
}
