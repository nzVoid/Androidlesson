package com.startandoid.p0261intentfilter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ActivityTime : AppCompatActivity() {
    private lateinit var tvTime: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        var sdf:SimpleDateFormat = SimpleDateFormat("HH:mm:ss")
        var time:String = sdf.format(Date(System.currentTimeMillis()))
        tvTime = findViewById(R.id.tvTime)
        tvTime.setText(time)
    }
}