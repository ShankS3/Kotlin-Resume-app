package com.shankS3.resume

import android.content.Intent
import android.net.Uri
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

    val callButton = findViewById<Button>(R.id.callButton)
    callButton.setOnClickListener {
      val phoneURI = Uri.parse("tel:+919664302993")
      val callIntent = Intent(Intent.ACTION_DIAL, phoneURI)
      startActivity(callIntent)
    }

    val emailButton = findViewById<Button>(R.id.emailButton)
    emailButton.setOnClickListener {
      var emailIntent = Intent(Intent.ACTION_SEND)
      emailIntent.setType("plain/text")
      emailIntent.putExtra(Intent.EXTRA_EMAIL, "myemail@gmail.com")
      startActivity(emailIntent)
    }
  }
}
