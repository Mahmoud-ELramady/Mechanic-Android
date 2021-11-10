package com.elramady.mechanic.User.home_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.elramady.mechanic.R
import com.google.android.material.button.MaterialButton

class HomePageActivity : AppCompatActivity() {

    lateinit var b: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        b=findViewById(R.id.icon_5)

        b.setOnClickListener {
            Toast.makeText(this,"gggggg",Toast.LENGTH_SHORT).show()
        }


    }
}