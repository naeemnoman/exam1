package com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this@MainActivity, ProductActivity_04_17::class.java))gi
            finish()
        }, 3000)
    }
}