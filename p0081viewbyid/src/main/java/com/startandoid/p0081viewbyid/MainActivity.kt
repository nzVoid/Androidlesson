package com.startandoid.p0081viewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.CheckBox;

class MainActivity : AppCompatActivity() {
    /*private lateinit var text: TextView
    private lateinit var btn: Button
    private lateinit var chb: CheckBox*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //установка текста
        var text: TextView = findViewById(R.id.myText)
        text.setText("New text in TextView")
        //кнопка
        var btn: Button = findViewById(R.id.myBtn);
        btn.setText("My button");
        btn.setEnabled(false);
        //checkbox
        var chb: CheckBox = findViewById(R.id.myChb);
        chb.setChecked(true);
        

    }
}