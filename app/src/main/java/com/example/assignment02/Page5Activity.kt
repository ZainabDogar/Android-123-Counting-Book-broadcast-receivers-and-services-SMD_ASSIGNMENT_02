package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        val button8 = findViewById<View>(R.id.button2) as Button
        button8.setOnClickListener {
            startActivity(Intent(this@Page5Activity, Page6Activity::class.java))
        }

        val button9 = findViewById<View>(R.id.button3) as Button
        button9.setOnClickListener {
            finish()
        }
    }
}