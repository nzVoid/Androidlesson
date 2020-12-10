package com.startandoid.p0091onclickbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvOut:TextView = findViewById(R.id.tvOut)
        var btnOk:Button = findViewById(R.id.btnOk)
        var btnCancel:Button = findViewById(R.id.btnCancel)
        btnOk.setOnClickListener {
            tvOut.text = "Нажата кнопка ОК"
        }
        btnCancel.setOnClickListener {
            tvOut.text = "Нажата кнопка Cancel"
        }
    }


}




