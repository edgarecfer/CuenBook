package com.isc.cuenbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_historico.*

class HistoricoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)

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