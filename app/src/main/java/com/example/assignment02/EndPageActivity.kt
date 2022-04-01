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

        val button20 = findViewById<View>(R.id.button2) as Button
        button20.setOnClickListener {
            startActivity(Intent(this@EndPageActivity, MainActivity::class.java))
        }

        val button21 = findViewById<View>(R.id.button3) as Button
        button21.setOnClickListener {
            finish()
        }
    }
}