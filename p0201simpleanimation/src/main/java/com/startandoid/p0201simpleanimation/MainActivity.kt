package com.startandoid.p0201simpleanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var MENU_ALPHA_ID:Int = 1
    var MENU_SCALE_ID:Int = 2
    var MENU_TRANSLATE_ID:Int  = 3
    var MENU_ROTATE_ID: Int = 4
    var MENU_COMBO_ID: Int = 5
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        registerForContextMenu(tv)
    }

    override fun onCreateContextMenu(menu:ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?){
        when(v?.getId()){
            R.id.tv ->{
                menu?.add(0, MENU_ALPHA_ID,0,"alpha")
                menu?.add(0, MENU_SCALE_ID,0,"scale")
                menu?.add(0, MENU_TRANSLATE_ID,0,"translate")
                menu?.add(0,MENU_ROTATE_ID,0,"rotate")
                menu?.add(0,MENU_COMBO_ID,0,"combo")
            }
        }
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var anim: Animation? = null
        when(item.itemId){
            MENU_ALPHA_ID ->{
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha)
            }
            MENU_SCALE_ID ->{
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale)
            }
            MENU_TRANSLATE_ID ->{
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans)
            }
            MENU_ROTATE_ID ->{
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate)
            }
            MENU_COMBO_ID ->{
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo)
            }
        }
        tv.startAnimation(anim)
        return super.onContextItemSelected(item)
    }

    override fun registerForContextMenu(view: View) {
        view.setOnCreateContextMenuListener(this)
    }
}