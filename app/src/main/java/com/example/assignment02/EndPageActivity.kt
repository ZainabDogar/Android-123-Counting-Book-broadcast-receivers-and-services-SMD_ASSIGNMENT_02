package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EndPageActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
    }
    fun clickEnd(view: View) {
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            startActivity(Intent(this@EndPageActivity, MainActivity::class.java))
        }
    }
    fun clickBack(view: View) {
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            startActivity(Intent(this@EndPageActivity, Page10Activity::class.java))
        }
    }
}