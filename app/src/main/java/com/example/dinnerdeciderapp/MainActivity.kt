package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Reference the components
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var addButton: Button
    private lateinit var decideButton: Button
    private lateinit var editText: EditText

    private val foodList = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the components
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        addButton = findViewById(R.id.button)
        decideButton = findViewById(R.id.button2)
        editText = findViewById(R.id.editTextText)

        // Set up the listeners
        decideButton.setOnClickListener {
            val randomFood = foodList[Random.nextInt(foodList.size)]
            textView.text = randomFood
        }

        addButton.setOnClickListener {
            val newFood = editText.text.toString()
            if (newFood.isNotEmpty()) {
                foodList.add(newFood)
                editText.text.clear()
            }
        }
    }
}
