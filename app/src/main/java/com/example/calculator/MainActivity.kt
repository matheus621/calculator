package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Calc(v:View){
        val n1 = findViewById<EditText>(R.id.num1) as EditText
        val n2 = findViewById<EditText>(R.id.num2) as EditText
        val res = findViewById<TextView>(R.id.result) as TextView
        val number1:Float
        val number2:Float
        val result:Float


        if(TextUtils.isEmpty(n1.text.toString())){
            n1.error = "Informe o numero"
            return
        }
        else{
            number1 = n1.text.toString().toFloat()
        }

        if(TextUtils.isEmpty(n2.text.toString())){
            n2.error = "Informe o numero"
            return
        }
        else{
            number2 = n2.text.toString().toFloat()
        }


        when (v.id){
            R.id.add -> {
                result = number1 + number2
                res.text = result.toString()
            }
            R.id.sub -> {
                result = number1 - number2
                res.text = result.toString()
            }
            R.id.mul -> {
                result = number1 * number2
                res.text = result.toString()
            }
            R.id.div ->{
                if(number2 == 0.0F){
                    Toast.makeText(this@MainActivity, "Dividir por 0 é nulo", Toast.LENGTH_SHORT).show()
                }else{
                    result = number1 / number2
                    res.text = result.toString()
                }
            }
        }
    }
}
