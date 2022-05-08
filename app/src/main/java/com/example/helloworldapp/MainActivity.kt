package com.example.helloworldapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btnMoney: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMoney=findViewById(R.id.btnMoney)
        btnMoney.setOnClickListener {
            val intent=Intent(this,sendmoney::class.java)
            startActivity(intent)
        }
    }
}