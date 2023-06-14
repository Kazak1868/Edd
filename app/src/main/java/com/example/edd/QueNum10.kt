package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum10Binding

class QueNum10 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer10btn.setOnClickListener{
            var tehh = binding.answer10.text.toString()
            if(tehh == "диверсификация")
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