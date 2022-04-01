package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val button4 = findViewById<View>(R.id.button2) as Button
        button4.setOnClickListener {
            startActivity(Intent(this@Page3Activity, Page4Activity::class.java))
        }

        val button5 = findViewById<View>(R.id.button3) as Button
        button5.setOnClickListener {
            finish()
        }
    }
}