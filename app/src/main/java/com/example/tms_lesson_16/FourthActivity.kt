package com.example.tms_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val btn = findViewById<Button>(R.id.button4)

        btn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("from4", "from 4 act")
            startActivity(intent)
        }
    }
}