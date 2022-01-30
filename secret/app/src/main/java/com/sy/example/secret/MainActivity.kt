package com.sy.example.secret

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pass = findViewById<EditText>(R.id.editTextNumberPassword)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val intent= Intent(this,MemoActivity::class.java)

        findViewById<Button>(R.id.button).setOnClickListener {
            val passwordText = pass.text.toString()
            val emailText = email.text.toString()

            if (emailText != "abbiddo@naver.com"){
                findViewById<TextView>(R.id.textView).text="이메일이 틀렸습니다!"
                findViewById<TextView>(R.id.textView2).text="비밀번호를 입력하세요"
            } else if (passwordText == "1234") {
                startActivity(intent)
            } else {
                findViewById<TextView>(R.id.textView).text="이메일을 입력하세요"
                findViewById<TextView>(R.id.textView2).text="비밀번호가 틀렸습니다!"
            }
        }
    }
}