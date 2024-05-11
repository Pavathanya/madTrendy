package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        var Home3 = findViewById<TextView>(R.id. paynow)

        Home3.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }

        var godress = findViewById<ImageView>(R.id.b1)

        godress.setOnClickListener {

            val intent = Intent(this,dress::class.java)

            startActivity(intent)
            finish()
        }
    }
}