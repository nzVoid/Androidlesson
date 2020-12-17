package com.startandoid.p0151contextmenu

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var MENU_COLOR_RED: Int = 1
    var MENU_COLOR_GREEN: Int = 2
    var MENU_COLOR_BLUE: Int = 3

    var MENU_SIZE_22: Int = 4
    var MENU_SIZE_26: Int = 5
    var MENU_SIZE_30: Int = 6

    private lateinit var tvColor: TextView
    private lateinit var tvSize: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvColor = findViewById(R.id.tvColor)
        tvSize = findViewById(R.id.tvSize)

        registerForContextMenu(tvColor)
        registerForContextMenu(tvSize)
        Log.d("Tag", "register")
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?){
        super.onCreateContextMenu(menu, v, menuInfo)
        Log.d("Tag", "create context menu")
        when(v?.getId()){
            R.id.tvColor ->{
                Log.d("Tag", "select Color")
                menu?.add(0, MENU_COLOR_RED, 0, "Red")
                menu?.add(0, MENU_COLOR_GREEN, 0, "Green")
                menu?.add(0, MENU_COLOR_BLUE, 0, "Blue")
            }
            R.id.tvSize ->{
                Log.d("Tag", "select Size")
                menu?.add(0, MENU_SIZE_22, 0, "22")
                menu?.add(0, MENU_SIZE_26, 0, "26")
                menu?.add(0, MENU_SIZE_30, 0, "30")
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean{
       return when(item.getItemId()){
            MENU_COLOR_RED -> {
                Log.d("Tag", "select Color red")
                tvColor.setTextColor(Color.RED)
                tvColor.setText("Text color = red")
                return true
            }

            MENU_COLOR_GREEN -> {
                Log.d("Tag", "select Color Green")
                tvColor.setTextColor(Color.GREEN)
                tvColor.setText("Text color = green")
                return true
            }

            MENU_COLOR_BLUE -> {
                Log.d("Tag", "select Color Blue")
                tvColor.setTextColor(Color.BLUE)
                tvColor.setText("Text color = blue")
                return true
            }

            MENU_SIZE_22 -> {
                Log.d("Tag", "select size 22")
                tvSize.setTextSize(22F)
                tvSize.setText("Text color = 22")
                return true
            }

            MENU_SIZE_26 -> {
                Log.d("Tag", "select size 26")
                tvSize.setTextSize(26F)
                tvSize.setText("Text color = 26")
                return true
            }
            MENU_SIZE_30 -> {
                Log.d("Tag", "select size 30")
                tvSize.setTextSize(30F)
                tvSize.setText("Text color = 30")
                return true
            }
            else -> return super.onContextItemSelected(item)
        }

    }

    override fun registerForContextMenu(view: View) {
        view.setOnCreateContextMenuListener(this)
    }
}