package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cafeteriastres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafeteriastres)

        // Para el boton atras
        val btn: Button = findViewById<Button>(R.id.buttonatras3)

        btn.setOnClickListener{
            val intento = Intent(this,recomendaciones::class.java)
            startActivity(intento)
        }
    }
}