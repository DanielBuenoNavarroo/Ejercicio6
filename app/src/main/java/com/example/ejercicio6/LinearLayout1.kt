package com.example.ejercicio6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LinearLayout1 : AppCompatActivity() {
    private lateinit var btnInicio : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout1)

        btnInicio = findViewById(R.id.btnInicio1)
        btnInicio.setOnClickListener {
            val intent = Intent(this@LinearLayout1, MainActivity::class.java)
            startActivity(intent)
        }
    }
}