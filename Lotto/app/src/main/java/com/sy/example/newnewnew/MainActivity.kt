package com.sy.example.newnewnew

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {
    val random=Random()
    val numbers=arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1=findViewById<Button>(R.id.buttonNum1)
        val num2=findViewById<Button>(R.id.buttonNum2)
        val num3=findViewById<Button>(R.id.buttonNum3)
        val num4=findViewById<Button>(R.id.buttonNum4)
        val num5=findViewById<Button>(R.id.buttonNum5)
        val num6=findViewById<Button>(R.id.buttonNum6)

        findViewById<FloatingActionButton>(R.id.floatingActionButton2).setOnClickListener {
            ltnum(num1)
            ltnum(num2)
            ltnum(num3)
            ltnum(num4)
            ltnum(num5)
            ltnum(num6)
            numbers.clear()
        }
    }
    fun ltnum(lottoNum:Button){
        var num=0
        while (true){
            num=random.nextInt(45)+1
            if (!numbers.contains(num)){
                numbers.add(num)
                break
            }
        }
        lottoNum.text="${num}"

        if (num<11){
            lottoNum.backgroundTintList=ColorStateList.valueOf(Color.rgb(251,192,45))
        }
        else if (num<21){
            lottoNum.backgroundTintList=ColorStateList.valueOf(Color.rgb(2,136,209))
        }
        else if (num<31){
            lottoNum.backgroundTintList=ColorStateList.valueOf(Color.rgb(230,74,25))
        }
        else if (num<41){
            lottoNum.backgroundTintList=ColorStateList.valueOf(Color.rgb(81,81,81))
        }
        else{
            lottoNum.backgroundTintList=ColorStateList.valueOf(Color.rgb(56,142,60))
        }
    }
}