package com.startandoid.p0261intentfilter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ActivityDate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)
        var sdf:SimpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
        var Date = sdf.format(Date(System.currentTimeMillis()))

        var tvDate: TextView = findViewById(R.id.tvDate)
        tvDate.setText(Date)

    }
}