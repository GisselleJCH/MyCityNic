package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class centros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_centros)

        // Para el boton atras
        val btn: Button = findViewById<Button>(R.id.buttonatras12)

        btn.setOnClickListener{
            val intento = Intent(this,recomendadostres::class.java)
            startActivity(intento)
        }
    }
}