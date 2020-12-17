package com.startandoid.p0261intentfilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnTime:Button
    private lateinit var btnDate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTime = findViewById(R.id.btnTime)
        btnTime.setOnClickListener(this::onClick)
        btnDate = findViewById(R.id.btnDate)
        btnDate.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        var intent: Intent
        when(v.getId()){
            R.id.btnTime ->{
                intent = Intent("ru.startandroid.intent.action.showtime")
                startActivity(intent)
            }
            R.id.btnDate ->{
                intent = Intent("ru.startandroid.intent.action.showdate")
                startActivity(intent)
            }
        }
    }
}