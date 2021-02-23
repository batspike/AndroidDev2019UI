package com.samcancode.android.userinterface

import android.app.ActionBar
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

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
        findViewById<LinearLayout>(R.id.linearLayout).addView(view)
    }

}