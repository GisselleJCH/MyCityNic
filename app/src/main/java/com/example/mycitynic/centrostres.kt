package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class centrostres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_centrostres)

        // Para el boton atras
        val btn: Button = findViewById<Button>(R.id.buttonatras14)

        btn.setOnClickListener{
            val intento = Intent(this,recomendadostres::class.java)
            startActivity(intento)
        }
    }
}