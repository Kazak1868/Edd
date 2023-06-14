package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum13Binding

class QueNum13 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer13btn.setOnClickListener{
            var tehh = binding.answer13.text.toString()
            if(tehh == "облигации")
            {
                val perehod = Intent(this, MainActivity3::class.java)
                startActivity(perehod)
                Toast.makeText(this,"Gotovo", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"НЕВЕРНО", Toast.LENGTH_LONG).show()
            }
        }
    }
}