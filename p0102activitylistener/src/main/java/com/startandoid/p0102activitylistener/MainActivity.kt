package com.startandoid.p0102activitylistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvOut: TextView
    private lateinit var btnOk: Button
    private lateinit var btnCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvOut = findViewById(R.id.tvOut)
        btnOk = findViewById(R.id.btnOk)
        btnCancel = findViewById(R.id.btnCancel)

        btnOk.setOnClickListener(this::onClick)
        btnCancel.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        when(v.id){
            R.id.btnOk -> tvOut.setText("Нажата кнопка ОК")
            R.id.btnCancel -> tvOut.setText("Нажата кнопка Cancel")
        }
    }
}