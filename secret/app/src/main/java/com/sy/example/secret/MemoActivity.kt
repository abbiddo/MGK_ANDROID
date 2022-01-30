package com.sy.example.secret

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secret_memo)

        val sentence = findViewById<EditText>(R.id.editTextTextPersonName)

        findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener{
            val sentenceText = sentence.text.toString()
            val sendIntent= Intent().apply{
                action= Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, sentenceText)
                type="text/plain"
            }
            val shareIntent= Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}