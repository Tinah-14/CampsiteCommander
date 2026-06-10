package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val displayButton =
            findViewById<Button>(R.id.displayButton)

        val backButton =
            findViewById<Button>(R.id.backButton)

        displayButton.setOnClickListener {
        }
        backButton.setOnClickListener {
            finish()
        }
    }
}