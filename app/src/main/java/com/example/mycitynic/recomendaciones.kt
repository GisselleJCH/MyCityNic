package com.example.mycitynic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class recomendaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomendaciones)

        // Para el boton atras
        val btn: Button = findViewById<Button>(R.id.buttonatras1)

        btn.setOnClickListener{
            val intento = Intent(this,MainActivity::class.java)
            startActivity(intento)
        }

        // Para la primera recomendacion
        val recomedacion: TextView = findViewById<TextView>(R.id.textView3)

        recomedacion.setOnClickListener{
            val intento2 = Intent(this,cafeterias::class.java)
            startActivity(intento2)
        }

        // Para la primera recomendacion - imagen
        val recomedacionuno: ImageView = findViewById<ImageView>(R.id.imageView)

        recomedacionuno.setOnClickListener{
            val intento3 = Intent(this,cafeterias::class.java)
            startActivity(intento3)
        }

        // Para la segunda recomendacion
        val recomedaciondos: TextView = findViewById<TextView>(R.id.textView4)

        recomedaciondos.setOnClickListener{
            val intento4 = Intent(this,cafeteriasdos::class.java)
            startActivity(intento4)
        }

        // Para la segunda recomendacion - imagen
        val recomedaciondosimagen: ImageView = findViewById<ImageView>(R.id.imageView2)

        recomedaciondosimagen.setOnClickListener{
            val intento5 = Intent(this,cafeteriasdos::class.java)
            startActivity(intento5)
        }

        // Para la tercera recomendacion
        val recomedaciontres: TextView = findViewById<TextView>(R.id.textView5)

        recomedaciontres.setOnClickListener{
            val intento6 = Intent(this,cafeteriastres::class.java)
            startActivity(intento6)
        }

        // Para la segunda recomendacion - imagen
        val recomedaciontresimagen: ImageView = findViewById<ImageView>(R.id.imageView4)

        recomedaciontresimagen.setOnClickListener{
            val intento7 = Intent(this,cafeteriastres::class.java)
            startActivity(intento7)
        }

        // Para la cuarta recomendacion
        val recomedacioncuatro: TextView = findViewById<TextView>(R.id.textView6)

        recomedacioncuatro.setOnClickListener{
            val intento8 = Intent(this,cafeteriacuatro::class.java)
            startActivity(intento8)
        }

        // Para la segunda recomendacion - imagen
        val recomedacioncuatroimagen: ImageView = findViewById<ImageView>(R.id.imageView5)

        recomedacioncuatroimagen.setOnClickListener{
            val intento9 = Intent(this,cafeteriacuatro::class.java)
            startActivity(intento9)
        }

        // Para la quinta recomendacion
        val recomedacionquinta: TextView = findViewById<TextView>(R.id.textView7)

        recomedacionquinta.setOnClickListener{
            val intento10 = Intent(this,cafeteriacinco::class.java)
            startActivity(intento10)
        }

        // Para la quinta recomendacion - imagen
        val recomedacionquintaimagen: ImageView = findViewById<ImageView>(R.id.imageView6)

        recomedacionquintaimagen.setOnClickListener{
            val intento11 = Intent(this,cafeteriacinco::class.java)
            startActivity(intento11)
        }
    }
}