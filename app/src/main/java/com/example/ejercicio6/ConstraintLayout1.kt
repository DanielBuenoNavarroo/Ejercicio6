package com.example.ejercicio6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstraintLayout1 : AppCompatActivity() {
    private lateinit var btnInicio : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout1)

        btnInicio = findViewById(R.id.botonInicio)
        btnInicio.setOnClickListener {
            val intent = Intent(this@ConstraintLayout1, MainActivity::class.java)
            startActivity(intent)
        }
    }
}