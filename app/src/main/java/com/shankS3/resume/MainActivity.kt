package com.shankS3.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistoryButton = findViewById<Button>(R.id.work_history_button)
        workHistoryButton.setOnClickListener {
            val moveToWorkHistory = Intent(applicationContext, WorkHistory::class.java)
            startActivity(moveToWorkHistory)
        }
    }
}