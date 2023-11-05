package com.example.ejercicio6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnLayout1: Button
    private lateinit var btnLayout2: Button
    private lateinit var btnLayout3: Button
    private lateinit var btnLayout4: Button
    private lateinit var btnLayout5: Button
    private lateinit var btnLayout6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLayout1 = findViewById(R.id.LL1)
        btnLayout2 = findViewById(R.id.LL2)
        btnLayout3 = findViewById(R.id.TL1)
        btnLayout4 = findViewById(R.id.TL2)
        btnLayout5 = findViewById(R.id.CL1)
        btnLayout6 = findViewById(R.id.CL2)

        btnLayout1.setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayout1::class.java)
            startActivity(intent)
        }

        btnLayout2.setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayout2::class.java)
            startActivity(intent)
        }

        btnLayout3.setOnClickListener {
            val intent = Intent(this@MainActivity, TableLayout1::class.java)
            startActivity(intent)
        }

        btnLayout4.setOnClickListener {
            val intent = Intent(this@MainActivity, TableLayout2::class.java)
            startActivity(intent)
        }

        btnLayout5.setOnClickListener {
            val intent = Intent(this@MainActivity, ConstraintLayout1::class.java)
            startActivity(intent)
        }

        btnLayout6.setOnClickListener {
            val intent = Intent(this@MainActivity, ConstraintLayout2::class.java)
            startActivity(intent)
        }

    }
}