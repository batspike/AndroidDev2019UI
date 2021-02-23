package com.samcancode.android.userinterface

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var container:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<Button>(R.id.button_click_me).setOnClickListener{
            val userName = findViewById<EditText>(R.id.nameInput).text.toString()
            val password = findViewById<EditText>(R.id.passwordInput).text.toString()
            // using string resouce allow use to provide localisation to our message
            val message = getString(R.string.login_message, userName, password)
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }

}