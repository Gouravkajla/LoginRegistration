package com.login.relativelayout3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Regiteration : AppCompatActivity() {
    lateinit var tvRegitertion: TextView
    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var etGender: EditText
    lateinit var btnDone: Button
    lateinit var tvAlreadyRegiteration: TextView
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regiteration)
        etName = findViewById(R.id.etName)
        tvRegitertion = findViewById(R.id.tvRegitertion)
        tvAlreadyRegiteration = findViewById(R.id.tvAlReadyRegiter)
        etAge = findViewById(R.id.etAge)
        etGender = findViewById(R.id.etGender)
        btnDone = findViewById(R.id.btnDone)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnDone.setOnClickListener {

        }
        btnDone.setOnClickListener{
        if (etName.text.isEmpty()){
            etName.error="Enter Your name"
        }else if(etAge.text.isEmpty()){
            etAge.error="Enter Your age"
        }else if (etGender.text.isEmpty()){
            etGender.error="Enter Your Gender"
        }else if (etEmail.error.isEmpty()){
            etEmail.error="Enter Your Email"
        }else if(etPassword.error.isEmpty()){
            etPassword.error="Enter Your Password"
        }}

        tvAlreadyRegiteration.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
