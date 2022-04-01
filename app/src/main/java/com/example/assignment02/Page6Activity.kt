package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val button11 = findViewById<View>(R.id.button2) as Button
        button11.setOnClickListener {
            startActivity(Intent(this@Page6Activity, Page7Activity::class.java))
        }

        val button10 = findViewById<View>(R.id.button3) as Button
        button10.setOnClickListener {
            finish()
        }
    }
}