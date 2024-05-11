package com.example.trendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn_1 = findViewById<Button>(R.id.btn_1)

        btn_1.setOnClickListener {

            val intent = Intent(this,Login_1::class.java)

            startActivity(intent)
            finish()
        }

    }

}
