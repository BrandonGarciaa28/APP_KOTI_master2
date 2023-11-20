package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login3)
    }
    fun iniciarTienda(view: View){
        val intent= Intent(this,MainActivity2::class.java).apply {  }
        startActivity(intent)
    }
    fun olvidarContraTienda(view: View){
        val intent= Intent(this,Cambiar_contra2Activity::class.java).apply {  }
        startActivity(intent)
    }
    fun registrarTienda(view: View){
        val intent= Intent(this,Registrar_TiendaActivity::class.java).apply {  }
        startActivity(intent)
    }
}