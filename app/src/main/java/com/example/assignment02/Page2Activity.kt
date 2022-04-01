package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page2Activity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val button1 = findViewById<View>(R.id.button2) as Button
        button1.setOnClickListener {
            startActivity(Intent(this@Page2Activity, Page3Activity::class.java))
        }

        val button2 = findViewById<View>(R.id.button3) as Button
        button2.setOnClickListener {
            finish()
        }
    }
}