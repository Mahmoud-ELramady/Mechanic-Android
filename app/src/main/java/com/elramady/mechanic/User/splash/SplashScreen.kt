package com.elramady.mechanic.User.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.elramady.mechanic.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
    }
}