package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EnterEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_email)
        val capturedIntent = intent.extras
        val userName = if (capturedIntent?.getString("Name") != null) capturedIntent.getString("Name") else ""

        Toast.makeText(this, userName, Toast.LENGTH_LONG).show()
        val button = findViewById(R.id.btnContinueToBirthDate) as Button
        val text = findViewById<TextView>(R.id.txtEmail)

        button.setOnClickListener {
            if(!text.text.isEmpty()) {
                val newIntent =  Intent(this, EnterBirthDate::class.java)
                newIntent.putExtra("Name", userName)
                newIntent.putExtra("Email", text.text.toString())
                startActivity(newIntent)
            }
        }
    }
}