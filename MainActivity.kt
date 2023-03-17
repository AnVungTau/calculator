package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var edtnum1: EditText

    private lateinit var edtnum2: EditText

    private lateinit var TextViewresult: TextView
    private lateinit var cong: Button
    private lateinit var tru: Button
    private lateinit var nhan: Button
    private lateinit var chia: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtnum1 = findViewById(R.id.num1)
        edtnum2 = findViewById(R.id.num2)
        TextViewresult = findViewById(R.id.result)
        cong = findViewById(R.id.cong)
        tru = findViewById(R.id.tru)
        nhan = findViewById(R.id.nhan)
        chia = findViewById(R.id.chia)

        cong.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                // Toast.makeText(this@MainActivity,"Click button cong", Toast.LENGTH_SHORT).show()
                var textNum1 = edtnum1.text.toString()
                var textNum2 = edtnum2.text.toString()

                // kieam tra
                if (textNum1.isNullOrEmpty() || textNum2.isNullOrEmpty()) {
                    Toast.makeText(this@MainActivity, "Ban chua nhap day du", Toast.LENGTH_SHORT)
                        .show()
                    return
                }

                val num1 = textNum1.toInt()
                val num2 = textNum2.toInt()


                val result = num1 + num2


                TextViewresult.text = "Result: $num1 + $num2 = $result"
            }


        })

        tru.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                // Toast.makeText(this@MainActivity,"Click button cong", Toast.LENGTH_SHORT).show()
                var textNum1 = edtnum1.text.toString()
                var textNum2 = edtnum2.text.toString()

                // kieam tra
                if (textNum1.isNullOrEmpty() || textNum2.isNullOrEmpty()) {
                    Toast.makeText(this@MainActivity, "Ban chua nhap day du", Toast.LENGTH_SHORT)
                        .show()
                    return
                }

                val num1 = textNum1.toInt()
                val num2 = textNum2.toInt()


                val result = num1 - num2


                TextViewresult.text = "Result: $num1 - $num2 = $result"
            }


        })
        nhan.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                // Toast.makeText(this@MainActivity,"Click button cong", Toast.LENGTH_SHORT).show()
                var textNum1 = edtnum1.text.toString()
                var textNum2 = edtnum2.text.toString()

                // kieam tra
                if (textNum1.isNullOrEmpty() || textNum2.isNullOrEmpty()) {
                    Toast.makeText(this@MainActivity, "Ban chua nhap day du", Toast.LENGTH_SHORT)
                        .show()
                    return
                }

                val num1 = textNum1.toInt()
                val num2 = textNum2.toInt()


                val result = num1 * num2


                TextViewresult.text = "Result: $num1 * $num2 = $result"
            }


        })
        chia.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                // Toast.makeText(this@MainActivity,"Click button cong", Toast.LENGTH_SHORT).show()
                var textNum1 = edtnum1.text.toString()
                var textNum2 = edtnum2.text.toString()

                // kieam tra
                if (textNum1.isNullOrEmpty() || textNum2.isNullOrEmpty()) {
                    Toast.makeText(this@MainActivity, "Ban chua nhap day du", Toast.LENGTH_SHORT)
                        .show()
                    return
                }

                val num1 = textNum1.toFloat()
                val num2 = textNum2.toFloat()


                val result = num1 / num2


                TextViewresult.text = "Result: $num1 / $num2 = $result"
            }


        })
    }

}

