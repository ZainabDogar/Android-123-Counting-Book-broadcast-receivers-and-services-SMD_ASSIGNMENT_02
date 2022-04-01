package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page9)

        val button16 = findViewById<View>(R.id.button2) as Button
        button16.setOnClickListener {
            startActivity(Intent(this@Page9Activity, Page10Activity::class.java))
        }

        val button17 = findViewById<View>(R.id.button3) as Button
        button17.setOnClickListener {
            finish()
        }
    }
}