package com.example.tms_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val btn = findViewById<Button>(R.id.button3)
        val btn2 = findViewById<Button>(R.id.button7)

        btn.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("from3", "from 3 act")
            startActivity(intent)
        }
    }
}