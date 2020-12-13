package com.startandoid.p0121logandmess

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tvOut: TextView
    private lateinit var btnOk: Button
    private lateinit var btnCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Tag", "найдём элементы")
        tvOut = findViewById(R.id.tvOut)
        btnOk = findViewById(R.id.btnOk)
        btnCancel = findViewById(R.id.btnCancel)

        Log.d("Tag","присваиваем обработчик кнопкам")
        btnOk.setOnClickListener(this::onClick)
        btnCancel.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        Log.d("Tag", "по id определяем кнопку, вызвавшую этот обработчик")
        when(v.id){
            R.id.btnOk -> {
                Log.d("Tag", "кнопка ОК")
                tvOut.setText("Нажата кнопка ОК")
                Toast.makeText(this,"Нажата кнопка ОК", Toast.LENGTH_LONG).show()
            }

            R.id.btnCancel -> {
                Log.d("Tag", "кнопка Cancel")
                tvOut.setText("Нажата кнопка Cancel")
                Toast.makeText(this,"Нажата кнопка Cancel", Toast.LENGTH_LONG).show()
            }
        }
    }
}