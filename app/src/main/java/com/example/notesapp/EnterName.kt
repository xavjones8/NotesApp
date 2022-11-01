package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EnterName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_name)

        val button = findViewById<Button>(R.id.btnContinue)
        val txtName = findViewById<TextView>(R.id.txtName)

        button.setOnClickListener {
            if(!txtName.text.isEmpty()) {
                val intent =  Intent(this, EnterEmail::class.java)
                intent.putExtra("Name", txtName.text.toString())
                startActivity(intent)
            }
        }
    }
}