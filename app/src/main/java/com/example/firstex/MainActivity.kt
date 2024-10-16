package com.example.firstex

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.firstex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)

       // val tapMeButton: Button = findViewById(R.id.tapMeButton)
        binding.tapMeButton.setOnClickListener {
            Toast.makeText(this,"Tapped", Toast.LENGTH_LONG).show()
        }

    }
}