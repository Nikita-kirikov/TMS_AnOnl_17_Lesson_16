package com.example.tms_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val text = findViewById<TextView>(R.id.textView4)
        val someText1 = intent.getStringExtra("from3")
        val someText2 = intent.getStringExtra("from4")

        if ( someText1 != null) {
            text.text = someText1
        }

        if (someText2 != null) {
            text.text = someText2
        }

        val btn = findViewById<Button>(R.id.button5)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}