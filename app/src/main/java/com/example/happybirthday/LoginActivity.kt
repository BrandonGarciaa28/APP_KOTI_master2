package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun Domicilio (view: View){
        val intent= Intent(this,Login2Activity::class.java).apply {  }
        startActivity(intent)
    }
    fun Tienda(view: View){
        val intent= Intent(this,Login3Activity::class.java).apply {  }
        startActivity(intent)
    }
}