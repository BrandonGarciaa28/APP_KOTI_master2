package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registrar_Tienda2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_tienda2)
    }
    fun btonRegistrarTienda2(view: View){
        val intent= Intent(this,Login3Activity::class.java).apply {  }
        startActivity(intent)
    }
}