package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        val button6 = findViewById<View>(R.id.button2) as Button
        button6.setOnClickListener {
            startActivity(Intent(this@Page4Activity, Page5Activity::class.java))
        }

        val button7 = findViewById<View>(R.id.button3) as Button
        button7.setOnClickListener {
            finish()
        }
    }
}