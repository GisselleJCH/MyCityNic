package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Para el primer botón
        val btn: Button = findViewById<Button>(R.id.buttoncafe)

        btn.setOnClickListener{
            val intento = Intent(this,recomendaciones::class.java)
            startActivity(intento)
        }

        // Para el segundo botón
        val btn2: Button = findViewById<Button>(R.id.buttonrestaurantes)

        btn2.setOnClickListener {
            val intento2 = Intent(this, recomendacionesdos::class.java)
            startActivity(intento2)
        }

        // Para el tercer botón
        val btn3: Button = findViewById<Button>(R.id.buttoncentrocomercial)

        btn3.setOnClickListener {
            val intento3 = Intent(this, recomendadostres::class.java)
            startActivity(intento3)
        }

    }
}