package com.example.fastingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Signup2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val spinnerCountry = findViewById<Spinner>(R.id.countryBox)

        val adapter = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinnerCountry.adapter = adapter;

        val btnContinue : Button = findViewById(R.id.btnContinue)
        val labelName : EditText = findViewById(R.id.label_name)
        btnContinue.setOnClickListener {
            if (labelName.text.isEmpty()) {
                Toast.makeText(
                    this,"Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}