package com.isc.cuenbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SplashTeam)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAventura.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            abrirAventura(nombre,apellido)
        }
        btnTerror.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            abrirTerror(nombre,apellido)
        }
        btnCienciaF.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            abrirCiencia(nombre,apellido)
        }
        btnInfantiles.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            abrirInfantiles(nombre,apellido)
        }
        btnRealistas.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            abrirRealistas(nombre,apellido)
        }
        btnHistoricos.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            abrirHistorico(nombre,apellido)
        }
        tvAcercaDe.setOnClickListener {
            informacion()
        }
    }

    fun abrirAventura(nom:String,ape:String){
        val intent = Intent(this,AventuraActivity::class.java)
        intent.putExtra("Nombre", nom)
        intent.putExtra("Apellido",ape)
        startActivity(intent)
    }

    fun abrirTerror(nom:String,ape:String){
        val intent = Intent(this,TerrorActivity::class.java)
        intent.putExtra("Nombre", nom)
        intent.putExtra("Apellido",ape)
        startActivity(intent)
    }

    fun abrirCiencia(nom:String,ape:String){
        val intent = Intent(this,CienciaActivity::class.java)
        intent.putExtra("Nombre", nom)
        intent.putExtra("Apellido",ape)
        startActivity(intent)
    }

    fun abrirInfantiles(nom:String,ape:String){
        val intent = Intent(this,InfantilesActivity::class.java)
        intent.putExtra("Nombre", nom)
        intent.putExtra("Apellido",ape)
        startActivity(intent)
    }

    fun abrirRealistas(nom:String,ape:String){
        val intent = Intent(this,RealistaActivity::class.java)
        intent.putExtra("Nombre", nom)
        intent.putExtra("Apellido",ape)
        startActivity(intent)
    }

    fun abrirHistorico(nom:String,ape:String){
        val intent = Intent(this,HistoricoActivity::class.java)
        intent.putExtra("Nombre", nom)
        intent.putExtra("Apellido",ape)
        startActivity(intent)
    }

    fun informacion(){
        val builder = AlertDialog.Builder(this)
        // inflar la vista
        val view = LayoutInflater.from(this).inflate(R.layout.informacion, null)

        builder.setView(view)
        builder.create()
        builder.show()
    }
}