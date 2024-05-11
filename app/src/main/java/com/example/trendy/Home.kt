package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var profile = findViewById<ImageView>(R.id.imageView10)

        profile.setOnClickListener {

            val intent = Intent(this,Profile::class.java)

            startActivity(intent)
            finish()
        }

        var image110 = findViewById<ImageView>(R.id.image110)
        image110.setOnClickListener {

            val intent = Intent(this,dress::class.java)

            startActivity(intent)
            finish()
        }

        var addcard = findViewById<ImageView>(R.id.image12)

        addcard.setOnClickListener {

            val intent = Intent(this,AddToCard::class.java)

            startActivity(intent)
            finish()
        }

        var imageView4 = findViewById<ImageView>(R.id.imageView4)

        imageView4.setOnClickListener {

            val intent = Intent(this,favourite::class.java)

            startActivity(intent)
            finish()
        }
    }
}