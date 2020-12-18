package com.startandoid.p0261intentfilter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ActivityDateEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_ex)

        var sdf:SimpleDateFormat = SimpleDateFormat("EEE, MMM d, yyyy")
        var date:String = sdf.format(Date(System.currentTimeMillis()))

        var tvDate: TextView = findViewById(R.id.tvDate)
        tvDate.setText(date)



    }
}