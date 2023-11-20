package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistrarseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)
    }
    fun btonRegistrarDomi(view: View){
        val intent= Intent(this,Login2Activity::class.java).apply {  }
        startActivity(intent)
    }
}