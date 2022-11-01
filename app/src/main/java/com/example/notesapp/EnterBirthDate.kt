package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.Date

class EnterBirthDate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_birth_date)

        val capturedIntent = intent.extras
        val userName = if (capturedIntent?.getString("Name") != null) capturedIntent.getString("Name") else ""
        val userEmail = if (capturedIntent?.getString("Email") != null) capturedIntent.getString("Email") else ""

        val button = findViewById(R.id.btnFinish) as Button
        val birthdayPicker = findViewById<DatePicker>(R.id.datePicker)

        button.setOnClickListener {
            val newIntent =  Intent(this, DisplayInformation::class.java)
            newIntent.putExtra("Name", userName)
            newIntent.putExtra("Email", userEmail)
            newIntent.putExtra("Birthdate", "${birthdayPicker.month}/${birthdayPicker.dayOfMonth + 1}/${birthdayPicker.year}")
            startActivity(newIntent)
        }
    }

}