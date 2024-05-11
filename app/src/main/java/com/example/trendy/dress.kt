package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class dress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dress)

        var pay2 = findViewById<TextView>(R.id.pay)

        pay2.setOnClickListener {

            val intent = Intent(this,Payment::class.java)

            startActivity(intent)
            finish()
        }
        var add = findViewById<TextView>(R.id.textView14)

        add.setOnClickListener {

            val intent = Intent(this,AddToCard::class.java)

            startActivity(intent)
            finish()
        }
        var back3 = findViewById<ImageView>(R.id. pho1)

        back3.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }

    }
}