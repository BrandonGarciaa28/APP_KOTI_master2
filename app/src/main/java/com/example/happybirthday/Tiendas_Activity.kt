package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.happybirthday.R

class tiendas_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiendas)


        fun BottomCart (view: View){
            val intent= Intent(this,cart_Activity::class.java).apply {  }
            startActivity(intent)
        }

    }
}