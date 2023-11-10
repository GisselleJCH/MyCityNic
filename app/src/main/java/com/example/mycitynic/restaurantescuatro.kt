package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class restaurantescuatro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurantescuatro)

        // Para el boton atras
        val btn: Button = findViewById<Button>(R.id.buttonatras10)

        btn.setOnClickListener{
            val intento = Intent(this,recomendacionesdos::class.java)
            startActivity(intento)
        }
    }
}