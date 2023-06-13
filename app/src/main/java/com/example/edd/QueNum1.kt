package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.edd.databinding.ActivityQueNum1Binding

class QueNum1 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer1btn.setOnClickListener{
            var tehh = binding.answer1.text.toString()
            if(tehh == "с")
            {
                val perehod = Intent(this, MainActivity3::class.java)
                startActivity(perehod)
                Toast.makeText(this,"Gotovo", Toast.LENGTH_LONG).show()
            }
        }
    }
}