package com.startandoid.p0191simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etNum1:EditText
    private lateinit var etNum2:EditText
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnMult: Button
    private lateinit var btnDiv: Button
    private lateinit var tvResult: TextView
    var oper:String = ""
    var MENU_RESET_ID:Int = 1
    var MENU_QUIT_ID:Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMult = findViewById(R.id.btnMult)
        btnDiv = findViewById(R.id.btnDiv)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener(this::onClick)
        btnSub.setOnClickListener(this::onClick)
        btnMult.setOnClickListener(this::onClick)
        btnDiv.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        var num1:Float = 0F
        var num2:Float = 0F
        var result:Float = 0F

        if(TextUtils.isEmpty(etNum1.getText().toString())|| TextUtils.isEmpty(etNum2.getText().toString())){
            return
        }

        num1 = (etNum1.getText().toString()).toFloat()
        num2 = (etNum2.getText().toString()).toFloat()

        when(v.getId()){
            R.id.btnAdd ->{
                oper = "+"
                result = num1 + num2
            }
            R.id.btnSub ->{
                oper = "-"
                result = num1 - num2
            }
            R.id.btnMult ->{
                oper = "*"
                result = num1 * num2
            }
            R.id.btnDiv -> {
                oper = "/"
                result = num1 / num2
            }
        }
        tvResult.setText(num1.toString() + " " + oper + " " + num2.toString() + " = " + result)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, MENU_RESET_ID, 0, "Reset")
        menu.add(0, MENU_QUIT_ID, 0, "Quit")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.getItemId()){
            MENU_QUIT_ID ->{
                etNum1.setText("")
                etNum2.setText("")
                tvResult.setText("")
            }
            MENU_QUIT_ID ->{
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}