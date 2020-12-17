package com.startandoid.p0181dynamiclayout3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    private lateinit var sbWeight:SeekBar
    private lateinit var btn1:Button
    private lateinit var btn2:Button
    private lateinit var lParams1: LinearLayout.LayoutParams
    private lateinit var lParams2: LinearLayout.LayoutParams

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sbWeight = findViewById(R.id.sbWeight)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        lParams1 = btn1.layoutParams as LinearLayout.LayoutParams
        lParams2 = btn2.layoutParams as LinearLayout.LayoutParams

        sbWeight.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, formUser: Boolean){
                var leftValue:Int = progress
                var rightValue: Int = seekBar.getMax() - progress
                lParams1.weight = leftValue.toFloat()
                lParams2.weight = rightValue.toFloat()
                btn1.setText(leftValue.toString())
                btn2.setText(rightValue.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar){

            }

            override fun onStopTrackingTouch(seekBar: SeekBar){

            }

        })
    }

}

