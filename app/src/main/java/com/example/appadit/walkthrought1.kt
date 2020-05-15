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

class walkthrought1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrought1)

        button2.setOnClickListener {
            val intent = Intent(this, walkthrought2::class.java)
            startActivity(intent)
        }
    }
}