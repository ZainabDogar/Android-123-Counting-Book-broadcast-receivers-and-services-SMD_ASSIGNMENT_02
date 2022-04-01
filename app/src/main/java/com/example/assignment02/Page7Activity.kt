package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page7)

        val button12 = findViewById<View>(R.id.button2) as Button
        button12.setOnClickListener {
            startActivity(Intent(this@Page7Activity, Page8Activity::class.java))
        }

        val button13 = findViewById<View>(R.id.button3) as Button
        button13.setOnClickListener {
            finish()
        }
    }
}