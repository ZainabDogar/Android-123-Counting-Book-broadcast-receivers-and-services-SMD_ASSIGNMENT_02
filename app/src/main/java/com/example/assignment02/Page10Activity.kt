package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page10)
    }
    fun click10(view: View) {
        val button = findViewById<View>(R.id.button2) as Button
        button.setOnClickListener {
            startActivity(Intent(this@Page10Activity, EndPageActivity::class.java))
        }
    }
    fun clickBack(view: View) {
        val button = findViewById<View>(R.id.button3) as Button
        button.setOnClickListener {
            finish()
        }
    }
}