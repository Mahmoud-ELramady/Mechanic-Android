package com.elramady.mechanic.User.details_mechanic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.elramady.mechanic.R

class DetailsMechanicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_details_mechanic)



    }
}