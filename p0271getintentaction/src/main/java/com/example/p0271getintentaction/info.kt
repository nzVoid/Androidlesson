package com.example.p0271getintentaction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        var intent: Intent = getIntent()
        var action: String? = intent.getAction()

        var format:String = ""
        var textInfo:String = ""

        if (action.equals("ru.startandroid.intent.action.showtime")){
            format = "HH:mm:ss"
            textInfo = "Time: "
        }
        else if (action.equals("ru.startandroid.intent.action.showdate")){
            format = "dd.MM.yyyy"
            textInfo = "Date: "
        }

        var sdf = SimpleDateFormat(format)
        var datetime:String = sdf.format(Date(System.currentTimeMillis()))

        var tvDate: TextView = findViewById(R.id.tvInfo)
        tvDate.setText(textInfo + datetime)
    }
}