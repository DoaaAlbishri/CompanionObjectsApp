package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var textview : TextView
    lateinit var editText : EditText
    lateinit var clMain : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        textview = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        clMain = findViewById(R.id.clMain)

        button.setOnClickListener {
         val type =editText.text.toString()
            when(type.toLowerCase()){
              "day" ->{
                  Background.background.change(clMain,Background.background.day)
                  textview.setTextColor(Color.BLACK)
                  textview.setBackgroundColor(Color.WHITE)
                  editText.setTextColor(Color.BLACK)
                  editText.setBackgroundColor(Color.WHITE)

              }
              "night" ->{
                  Background.background.change(clMain,Background.background.night)
                  textview.setTextColor(Color.WHITE)
                  textview.setBackgroundColor(Color.BLACK)
                  editText.setTextColor(Color.WHITE)
                  editText.setBackgroundColor(Color.BLACK)
              }
            }
        }
    }
}