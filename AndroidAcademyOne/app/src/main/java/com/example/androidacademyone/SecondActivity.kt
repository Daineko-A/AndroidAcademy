package com.example.androidacademyone

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            openSecondActivity()
        }

        val buttonOpenWeb: Button = findViewById(R.id.button3)
        buttonOpenWeb.setOnClickListener{
            openOnliner()
        }
    }

    private fun openOnliner() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(intent)
    }

    private fun openSecondActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
