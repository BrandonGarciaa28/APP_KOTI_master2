package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registrar_TiendaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_tienda)
    }
    fun btonRegistrarTienda(view: View){
        val intent= Intent(this,Registrar_Tienda2Activity::class.java).apply {  }
        startActivity(intent)
    }
}