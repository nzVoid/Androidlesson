package com.startandoid.p0101listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvOut: TextView
    private lateinit var btnOk: Button
    private lateinit var btnCancel: Button

    private fun clickEvent(v: View){
        when(v.getId()){
            R.id.btnOk -> tvOut.setText("Нажата кнопка ОК")
            R.id.btnCancel -> tvOut.setText("Нажата кнопка Cancel")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvOut = findViewById(R.id.tvOut)
        btnOk = findViewById(R.id.btnOk)
        btnCancel = findViewById(R.id.btnCancel)

        btnOk.setOnClickListener(this::clickEvent)
        btnCancel.setOnClickListener(this::clickEvent)

    }
}



