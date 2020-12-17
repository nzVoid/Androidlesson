package com.startandoid.p0161dynamiclayout

import android.app.ActionBar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var linLayout: LinearLayout = LinearLayout(this)
        linLayout.setOrientation(LinearLayout.VERTICAL)

        var linLayoutParam = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linLayout, linLayoutParam)

        var lpView: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        var tv:TextView = TextView(this)
        tv.setText("TextView")
        tv.setLayoutParams(lpView)
        linLayout.addView(tv)

        var btn: Button = Button(this)
        btn.setText("Button")
        linLayout.addView(btn, lpView)

        var leftMarginParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        leftMarginParams . leftMargin = 50
        var btn1:Button = Button(this)
        btn1.setText("Button1")
        linLayout.addView(btn1, leftMarginParams)

        var rightGravityParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        rightGravityParams.gravity = Gravity.RIGHT

        var btn2:Button = Button(this)
        btn2.setText("Button2")
        linLayout.addView(btn2, rightGravityParams)

    }
}