package com.samcancode.android.userinterface

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            displayImageAsset("monster01.webp")
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            displayImageAsset("monster02.webp")
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            displayImageAsset("monster03.webp")
        }
    }

    private fun displayImageAsset(fileName:String) {
        assets.open(fileName).use {
            val drawable = Drawable.createFromStream(it, null)
            val monsterImage = findViewById<ImageView>(R.id.monsterImage)
            monsterImage.setImageDrawable(drawable)
        }
    }
}