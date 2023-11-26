package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.happybirthday.Activity.MainActivity

class Login2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
    }
    fun iniciarDomicilio(view: View){
        val intent=Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }//tiendas_Activity
    fun olvidarContraDomicilio(view: View){
        val intent=Intent(this,Cambiar_ContraActivity::class.java).apply {  }
        startActivity(intent)
    }
    fun registrarDomicilio(view: View){
        val intent=Intent(this,RegistrarseActivity::class.java).apply {  }
        startActivity(intent)
    }
}