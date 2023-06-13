package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.edd.databinding.ActivityQueNum1Binding

class QueNum1 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var tehh = binding.answer1.text.toString()

        binding.answer1btn.setOnClickListener{
            if(tehh == "страховая компания")
            {
                val perehod = Intent(this, MainActivity3::class.java)
                startActivity(perehod)
            }
        }
    }
}