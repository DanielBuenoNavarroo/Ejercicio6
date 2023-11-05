package com.example.ejercicio6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var btnInicio : Button
class TableLayout2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout2)

        btnInicio = findViewById(R.id.botonInicio)
        btnInicio.setOnClickListener {
            intent = Intent(this@TableLayout2, MainActivity::class.java)
            startActivity(intent)
        }
    }
}