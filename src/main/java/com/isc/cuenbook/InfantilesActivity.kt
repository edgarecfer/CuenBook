package com.isc.cuenbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_infantiles.*

class InfantilesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infantiles)

        val obj = intent
        val nombre = obj.getStringExtra("Nombre")
        val apellido = obj.getStringExtra("Apellido")
        txtBien1.text = "Bienvenid@ $nombre $apellido\n Comencemos con la lectura."

        tvRegresar.setOnClickListener {
            regresar()
        }
    }

    fun regresar(){
        startActivity(Intent(this, MainActivity::class.java))
    }
}