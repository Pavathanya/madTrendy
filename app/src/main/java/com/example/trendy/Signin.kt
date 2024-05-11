package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        var Home1 = findViewById<TextView>(R.id.btn_33)
        Home1.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }

    }
}