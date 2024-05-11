package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AddToCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_card)

        var Home2 = findViewById<ImageView>(R.id. imageView12)

        Home2.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }

    }
}