package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page1Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
    }
    fun click1(view: View) {
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            startActivity(Intent(this@Page1Activity, Page2Activity::class.java))
        }
    }
}