package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var pho1 = findViewById<ImageView>(R.id.pho1)
        pho1.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
            finish()
        }
    }
}