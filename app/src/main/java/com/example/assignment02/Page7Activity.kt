package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click7(view: View) {
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            startActivity(Intent(this@Page7Activity, Page8Activity::class.java))
        }
    }
}