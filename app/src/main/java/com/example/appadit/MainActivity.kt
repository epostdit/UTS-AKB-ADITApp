package com.example.appadit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ic_home = HomeFragment()
        val ic_activity = ActivityFragment()
        val ic_gallery = GalleryFragment()
        val ic_music_video = MusikFragment()
        val ic_account = AccountFragment()

        makeCurrentFragment(ic_home)

        bottom_nav.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(ic_home)
                R.id.ic_activity -> makeCurrentFragment(ic_activity)
                R.id.ic_photo -> makeCurrentFragment(ic_gallery)
                R.id.ic_music_video -> makeCurrentFragment(ic_music_video)
                R.id.ic_account -> makeCurrentFragment(ic_account)
        }
            true
        }

    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}
