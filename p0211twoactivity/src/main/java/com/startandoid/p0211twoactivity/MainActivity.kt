package com.startandoid.p0211twoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnActTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnActTwo = findViewById(R.id.btnActTwo)
        btnActTwo.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        when(v.getId()){
            R.id.btnActTwo ->{
                var intent:Intent = Intent(this, ActivityTwo::class.java)
                startActivity(intent)
            }
        }
    }
}