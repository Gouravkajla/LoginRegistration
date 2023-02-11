package com.login.relativelayout3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var  btnLogin:Button
    lateinit var tvDontHaveAccount:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        tvDontHaveAccount=findViewById(R.id.tvDontHaveAccount)


        btnLogin.setOnClickListener {
     if (etEmail.text.isEmpty()){
         etEmail.error="Enter your Email"
     }
     else if (etPassword.text.isEmpty()){
         etPassword.error="Enter your password"
     }
     else if (etPassword.text.toString().length <6){
         etPassword.error="enter your 6 digit password"
     }
        }
            tvDontHaveAccount.setOnClickListener {
                val intent = Intent(this, Regiteration::class.java)
                startActivity(intent)
                Toast.makeText(this,"Activity",Toast.LENGTH_SHORT).show()
     }

    }
}

