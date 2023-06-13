package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.edd.databinding.ActivityQueNum2Binding

class QueNum2 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer2btn.setOnClickListener{
            var tehh = binding.answer1.text.toString()
            if(tehh == "финансы")
            {
                val perehod = Intent(this, MainActivity3::class.java)
                startActivity(perehod)
                Toast.makeText(this,"Gotovo", Toast.LENGTH_LONG).show()
            }
        }
    }
}