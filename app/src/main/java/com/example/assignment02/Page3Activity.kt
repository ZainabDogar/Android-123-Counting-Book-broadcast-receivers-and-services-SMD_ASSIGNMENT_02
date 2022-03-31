package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click3(view: View) {
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            startActivity(Intent(this@Page3Activity, Page4Activity::class.java))
        }
    }
}