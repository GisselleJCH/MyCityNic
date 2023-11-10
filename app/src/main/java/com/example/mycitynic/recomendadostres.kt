package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class recomendadostres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomendadostres)

        // Para el boton atras
        val btn: Button = findViewById<Button>(R.id.buttonatras11)

        btn.setOnClickListener{
            val intento = Intent(this,MainActivity::class.java)
            startActivity(intento)
        }

        // Para la primera recomendacion
        val recomedacion: TextView = findViewById<TextView>(R.id.textView32)

        recomedacion.setOnClickListener{
            val intento2 = Intent(this,centros::class.java)
            startActivity(intento2)
        }

        // Para la primera recomendacion - imagen
        val recomedacionuno: ImageView = findViewById<ImageView>(R.id.imageView19)

        recomedacionuno.setOnClickListener{
            val intento3 = Intent(this,centros::class.java)
            startActivity(intento3)
        }

        // Para la segunda recomendacion
        val recomedaciondos: TextView = findViewById<TextView>(R.id.textView33)

        recomedaciondos.setOnClickListener{
            val intento4 = Intent(this,centrosdos::class.java)
            startActivity(intento4)
        }

        // Para la segunda recomendacion - imagen
        val recomedaciondosimagen: ImageView = findViewById<ImageView>(R.id.imageView21)

        recomedaciondosimagen.setOnClickListener{
            val intento5 = Intent(this,centrosdos::class.java)
            startActivity(intento5)
        }

        // Para la tercera recomendacion
        val recomedaciontres: TextView = findViewById<TextView>(R.id.textView34)

        recomedaciontres.setOnClickListener{
            val intento6 = Intent(this,centrostres::class.java)
            startActivity(intento6)
        }

        // Para la segunda recomendacion - imagen
        val recomedaciontresimagen: ImageView = findViewById<ImageView>(R.id.imageView20)

        recomedaciontresimagen.setOnClickListener{
            val intento7 = Intent(this,centrostres::class.java)
            startActivity(intento7)
        }

        // Para la cuarta recomendacion
        val recomedacioncuatro: TextView = findViewById<TextView>(R.id.textView35)

        recomedacioncuatro.setOnClickListener{
            val intento8 = Intent(this,centroscuatro::class.java)
            startActivity(intento8)
        }

        // Para la segunda recomendacion - imagen
        val recomedacioncuatroimagen: ImageView = findViewById<ImageView>(R.id.imageView22)

        recomedacioncuatroimagen.setOnClickListener{
            val intento9 = Intent(this,centroscuatro::class.java)
            startActivity(intento9)
        }
    }
}