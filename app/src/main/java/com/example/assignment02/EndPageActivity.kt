package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class EndPageActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_endpage)
        val image = findViewById<View>(R.id.image) as ImageView
    }
    fun clickEnd(view: View) {
        val button = findViewById<View>(R.id.button2) as Button
        button.setOnClickListener {
            startActivity(Intent(this@EndPageActivity, MainActivity::class.java))
        }
    }
    fun clickBack(view: View) {
        val button = findViewById<View>(R.id.button3) as Button
        button.setOnClickListener {
            finish()
        }
    }
}