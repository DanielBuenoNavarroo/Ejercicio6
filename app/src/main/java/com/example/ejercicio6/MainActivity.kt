package com.example.ejercicio6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnLayout1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLayout1 = findViewById(R.id.LL1)
        btnLayout1.setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayout1::class.java)
            startActivity(intent)
        }
    }
}