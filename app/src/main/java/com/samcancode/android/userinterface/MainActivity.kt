package com.samcancode.android.userinterface

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

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

            // Toast messages can be suppressed by user via the O/S. So they are
            // not ideal for display important info specifically in our app. Better to use snackbar.
            // Snackbar should be used with CoordinatorLayout component as its root element, or
            // within a child of the CoordinatorLayout. Snackbar will automatically reference
            // itself up to the parent that is a CoordinatorLayout. Snackbar also can have a
            // button for additional functionality.
//            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            Snackbar.make(it, message, Snackbar.LENGTH_LONG)
                    .setAction("Click Me", { showAnotherMessage() })
                    .show()
        }
    }

    private fun showAnotherMessage() {
        Toast.makeText(this, "You Clicked!", Toast.LENGTH_LONG).show()
    }

}