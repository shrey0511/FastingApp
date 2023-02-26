package com.example.fastingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin : Button = findViewById(R.id.but_login)
        val mailid : EditText = findViewById(R.id.mailid)
        val pass : EditText = findViewById(R.id.password)
        val sign : TextView = findViewById(R.id.sign)

        sign.setOnClickListener{
            val intent2 = Intent(this, Signup2::class.java)
            startActivity(intent2)
        }
        btnLogin.setOnClickListener {
            if (mailid.text.isEmpty()) {
                Toast.makeText(
                    this,"Please enter your email", Toast.LENGTH_LONG).show()
            }else if(pass.text.isEmpty()) {
                Toast.makeText(
                    this, "Please enter your password", Toast.LENGTH_LONG
                ).show()
            }else {
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)
            }
        }
    }
}