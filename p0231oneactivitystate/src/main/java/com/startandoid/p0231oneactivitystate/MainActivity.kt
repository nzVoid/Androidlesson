package com.startandoid.p0231oneactivitystate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Tag", "MainActivity: onCreate()")
    }

    override fun onStart(){
        super.onStart()
        Log.d("Tag", "MainActivity: onStart()")
    }

    override fun onResume(){
        super.onResume()
        Log.d("Tag", "MainActivity: onResume()")
    }

    override fun onPause(){
        super.onPause()
        Log.d("Tag", "MainActivity: onPause()")
    }

    override fun onStop(){
        super.onStop()
        Log.d("Tag", "MainActivity: onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag", "MainActivity: onDestroy()")
    }
}