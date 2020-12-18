package com.example.p0271getintentaction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnData:Button
    private lateinit var btnTime:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnData = findViewById(R.id.btnDate)
        btnTime = findViewById(R.id.btnTime)

        btnData.setOnClickListener(this::onClick)
        btnData.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        var intent:Intent
        when(v.id){
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