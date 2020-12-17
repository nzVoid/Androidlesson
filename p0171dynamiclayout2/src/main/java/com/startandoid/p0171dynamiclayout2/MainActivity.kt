package com.startandoid.p0171dynamiclayout2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import android.widget.LinearLayout.*

class MainActivity : AppCompatActivity() {
    private lateinit var llMain:LinearLayout
    private lateinit var rgGravity: RadioGroup
    private lateinit var etName: EditText
    private lateinit var btnCreate: Button
    private lateinit var btnClear: Button
    private var wrapContent: Int = LinearLayout.LayoutParams.WRAP_CONTENT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llMain = findViewById(R.id.llMain)
        rgGravity = findViewById(R.id.rgGravity)
        etName = findViewById(R.id.etName)
        btnCreate = findViewById(R.id.btnCreate)
        btnCreate.setOnClickListener(this::onClick)
        btnClear = findViewById(R.id.btnClear)
        btnClear.setOnClickListener(this::onClick)
    }

    fun onClick(v: View){
        when(v.getId()){
            R.id.btnCreate ->{
                var lParams: LayoutParams = LayoutParams(wrapContent, wrapContent)
                var btnGravity: Int = Gravity.LEFT
                when(rgGravity.checkedRadioButtonId){
                    R.id.rbLeft ->{
                        btnGravity = Gravity.LEFT
                    }
                    R.id.rbCenter ->{
                        btnGravity = Gravity.CENTER_HORIZONTAL
                    }
                    R.id.rbRight ->{
                        btnGravity = Gravity.RIGHT
                    }
                }
                lParams.gravity = btnGravity
                var btnNew:Button = Button(this)
                btnNew.setText(etName.getText().toString())
                llMain.addView(btnNew, lParams)
            }
            R.id.btnClear ->{
                llMain.removeAllViews()
                Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show()
            }
        }
    }

}