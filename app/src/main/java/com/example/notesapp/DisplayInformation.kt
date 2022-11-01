package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_information)

        val capturedIntent = intent.extras
        val userName = if (capturedIntent?.getString("Name") != null) capturedIntent.getString("Name") else ""
        val userEmail = if (capturedIntent?.getString("Email") != null) capturedIntent.getString("Email") else ""
        val userBirthDate = if (capturedIntent?.getString("Birthdate") != null) capturedIntent.getString("Birthdate") else ""

        val textName = findViewById<TextView>(R.id.lblUserName)
        val textEmail = findViewById<TextView>(R.id.lblEmail)
        val textBirthdate = findViewById<TextView>(R.id.lblBirthDate)

        textName.setText("Name: $userName")
        textEmail.setText("Email: $userEmail")
        textBirthdate.setText("Birthdate: $userBirthDate")
    }
}