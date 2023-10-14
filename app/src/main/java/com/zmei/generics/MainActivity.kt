package com.zmei.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        sayHiAndPrint(Money(2))
    }

    fun <T>sayHiAndPrint(item : T) {
        var textView: TextView
        textView = findViewById(R.id.textView)
        textView.text = "Hi $item"
    }
}