package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class favourite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        var imageView54 = findViewById<ImageView>(R.id.imageView5)

        imageView54.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }

        var imageView10 = findViewById<ImageView>(R.id.imageView10)

        imageView10.setOnClickListener {

            val intent = Intent(this,Profile::class.java)

            startActivity(intent)
            finish()
        }
        var imageView5 = findViewById<ImageView>(R.id.imageView5)

        imageView5.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }
    }
}