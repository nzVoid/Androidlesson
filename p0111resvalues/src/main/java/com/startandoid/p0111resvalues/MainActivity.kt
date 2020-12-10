package com.startandoid.p0111resvalues

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var BottomC = getResources().getColor(R.color.llBottomColor);

        var llBottom: LinearLayout = findViewById(R.id.llBottom)
        var tvBottom: TextView = findViewById(R.id.tvBottom)
        var btnBottom: Button = findViewById(R.id.btnBottom)

        llBottom.setBackgroundColor(BottomC)
        tvBottom.setText(R.string.tvBottomText)
        btnBottom.setText(R.string.btnBottomText)

    }
}