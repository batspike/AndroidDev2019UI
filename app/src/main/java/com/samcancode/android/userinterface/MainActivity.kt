package com.samcancode.android.userinterface

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var container:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        container = findViewById(R.id.linearLayout)

        // programatically add 3 TextView widgets
        addTextView("Hello")
        addTextView("From")
        addTextView("Android")

    }

    private fun addTextView(label:String) {
        val view = TextView(this)
        view.text = label
        view.textSize = 28f  // 28dp
        view.setTextColor(Color.parseColor("#FF0000"))
        container.addView(view)
    }

}