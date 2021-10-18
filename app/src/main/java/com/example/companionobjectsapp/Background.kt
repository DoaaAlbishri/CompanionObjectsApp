package com.example.companionobjectsapp

import android.view.View

class Background {
companion object background{
    val day = "day"
    val night = "night"
    fun change(layout: View, time : String){
        when(time) {
            "day" -> {
                layout.setBackgroundResource(R.drawable.day)
            }
            "night" -> {
                layout.setBackgroundResource(R.drawable.night)
            }
        }
    }
}
}