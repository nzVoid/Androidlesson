package com.startandoid.p0141menuadv

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.TextView
import java.lang.StringBuilder
//import android.R


class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var chb: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById<TextView>(R.id.textView)
        chb = findViewById<CheckBox>(R.id.chbExtMenu)
    }

    @SuppressLint("ResourceType")
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.layout.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        menu.setGroupVisible(1, chb.isChecked())
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var sb:StringBuilder = StringBuilder()
        sb.append("Item Menu")
        sb.append("\r\n groupId: " + item.groupId.toString())//valueOf(item.groupId))
        sb.append("\r\n itemId: " + item.itemId.toString())//valueOf(item.itemId))
        sb.append("\r\n order: " + item.order.toString())//valueOf(item.order))
        sb.append("\r\n title: " + item.title)
        tv.setText(sb.toString())
        return super.onOptionsItemSelected(item)
    }
}