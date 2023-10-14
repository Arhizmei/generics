package com.zmei.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView: TextView
        textView = findViewById(R.id.textView)
        val money = Money(1000000)
        val jewelery = Jewelery("gold")
        val moneyCase = Case<Money, Double>(Money(1000000), 12.3)
        moneyCase.add(Money(5000))
        var jeweleryCase = Case(Jewelery("Brilliant"), 12.6)
        jeweleryCase.add(Jewelery("Gold"))
        textView.text = "${jeweleryCase.get()}"
    }
}