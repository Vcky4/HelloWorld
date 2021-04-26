package com.Zuri.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var plus = findViewById<Button>(R.id.buttonPlus)
        var textValue = findViewById<TextView>(R.id.showText)


        plus.setOnClickListener {
            count++
            textValue.text = "$count"
        }

    }
}