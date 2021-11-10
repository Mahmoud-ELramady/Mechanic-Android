package com.elramady.mechanic.User.requests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.elramady.mechanic.R
import androidx.viewpager.widget.ViewPager
import com.elramady.mechanic.User.adapters.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout


class RequestsActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var toolbar: Toolbar



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requests)


        toolbar=findViewById(R.id.toolbar_requests)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager_requests)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tablayout_requests)
        tabs.setupWithViewPager(viewPager)


    }
}