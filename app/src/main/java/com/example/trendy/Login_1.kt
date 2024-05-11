package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        var signin = findViewById<TextView>(R.id.signin)

        signin.setOnClickListener {

            val intent = Intent(this,Signin::class.java)

            startActivity(intent)
            finish()
        }

        var home = findViewById<TextView>(R.id.btn_33)

        home.setOnClickListener {

            val intent = Intent(this,Home::class.java)

            startActivity(intent)
            finish()
        }



    }


}