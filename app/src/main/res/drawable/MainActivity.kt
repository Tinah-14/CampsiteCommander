package com.example.campsitecommander

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {

    private val item name = arrayOf(
            "Tent", "Marshmallows", "Flashlight"
    )

    private val category = arrayOf(
        "Shelter", "Food", "Safety"
    )

    private val quantity = arrayOf(
        2,3,4
    )

    private val comments = arrayOf(
        "4-person waterproof", "For S'mores (Mega size)", "Flashlight not working"
    )

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        val editTextAmount = findViewById<EditText>(R.id.editTextAmount)
        val amountString = editTextAmount.text.toString()
        try {
// Throws NumberFormatException if input contains non-numeric characters
            val amount = amountString.toInt()
        } catch (e: NumberFormatException) {
// Handle the error gracefully without terminating the app process
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton =
            findViewById<Button>(R.id.startButton)

        calculateButton.setOnClickListener {

            val total =
                calculateTotalItemsPacked()

            total.text =
                "Total Items Packed: $total"

            Log.d(
                "Campsite Commander",
                "Total items packed: $total" calculated"
            )
        }

    private fun calculateTotalItemsPacked(): Double {

        var total = 0

        for (i in quantity.indices) {

            total +=
                (quantity[i] *)
        }
    }
}