package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Cambiar_contra2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_contra2)
    }
    fun registrarNuevaContra2(view: View){
        val intent= Intent(this,Login3Activity::class.java).apply {  }
        startActivity(intent)
    }
}