package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum8Binding

class QueNum8 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer8btn.setOnClickListener{
            var tehh = binding.answer8.text.toString()
            if(tehh == "номинальный доход")
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