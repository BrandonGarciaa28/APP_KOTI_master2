package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.auth
import com.example.happybirthday.Activity.MainActivity

class Login2Activity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val btonCrearCuenta: TextView = findViewById(R.id.btonCrearCuenta)
        val loginButton: Button = findViewById(R.id.registrarUsuario)
        val emailEditText: EditText = findViewById(R.id.edtEmail)
        val passwordEditText: EditText = findViewById(R.id.edtContraseña)
        firebaseAuth= Firebase.auth
        btonCrearCuenta.setOnClickListener() {
            val i = Intent (this, RegistrarseActivity::class.java)
            startActivity(i)
        }
        loginButton.setOnClickListener()
        {
            signIn(emailEditText.text.toString(), passwordEditText.text.toString())
        }
    }
    private fun signIn(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                val user = firebaseAuth.currentUser
                Toast.makeText(baseContext,"Autenticación Exitosa", Toast.LENGTH_SHORT).show()
                val i = Intent( this, MainActivity::class.java)
                startActivity(i)
            }
            else{
                Toast.makeText(baseContext,"Error de Email y/o Contraseña", Toast.LENGTH_SHORT).show()
            }

        }
    }

}