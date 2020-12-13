package com.startandoid.p0141menuadv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.TextView
import java.lang.StringBuilder


class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var chb: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById<TextView>(R.id.textView)
        chb = findViewById<CheckBox>(R.id.chbExtMenu)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0,1,0,"add")
        menu.add(0,2,0,"edit")
        menu.add(0,3,3,"delete")
        menu.add(1,4,1,"copy")
        menu.add(1,5,2,"paste")
        menu.add(1,6,4,"exit")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        menu.setGroupVisible(1, chb.isChecked())
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var sb:StringBuilder = StringBuilder()
        sb.append("Item Menu")
        sb.append("\r\n groupId: " + String.)//valueOf(item.groupId))
        sb.append("\r\n itemId: " + String.)//valueOf(item.itemId))
        sb.append("\r\n order: " + String.)//valueOf(item.order))
        sb.append("\r\n title: " + item.title)
        tv.setText(sb.toString())
        return super.onOptionsItemSelected(item)
    }
}