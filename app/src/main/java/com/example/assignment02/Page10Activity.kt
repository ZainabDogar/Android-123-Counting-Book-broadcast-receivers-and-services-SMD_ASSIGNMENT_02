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

        val button19 = findViewById<View>(R.id.button2) as Button
        button19.setOnClickListener {
            startActivity(Intent(this@Page10Activity, EndPageActivity::class.java))
        }

        val button18 = findViewById<View>(R.id.button3) as Button
        button18.setOnClickListener {
            finish()
        }
    }
}