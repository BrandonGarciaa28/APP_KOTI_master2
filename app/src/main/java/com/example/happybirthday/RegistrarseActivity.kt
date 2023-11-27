package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegistrarseActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)
        val nombreUsuario: EditText = findViewById(R.id.edtNombre)
        val nombreEmail: EditText = findViewById(R.id.edtEmail)
        val textoContraseña: EditText = findViewById(R.id.edtContraseña)
        val textoTelefono: EditText = findViewById(R.id.edtTelefono)
        val registrarUsuario: TextView = findViewById(R.id.registrarUsuario)
        registrarUsuario.setOnClickListener() {
            createAccount(nombreEmail.text.toString(), textoContraseña.text.toString())

        }
        firebaseAuth= Firebase.auth
    }
    private fun createAccount(email: String, password: String ) {
        firebaseAuth.createUserWithEmailAndPassword(email, password).
        addOnCompleteListener(this) { task ->
            if (task.isSuccessful){
                Toast.makeText(baseContext,"Cuenta Creada", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login2Activity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(baseContext,"Error al Crear la Cuenta: " + task.exception, Toast.LENGTH_SHORT).show()
            }
        }
    }
}