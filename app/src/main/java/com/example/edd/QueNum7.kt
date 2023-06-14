package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum7Binding

class QueNum7 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer7btn.setOnClickListener{
            var tehh = binding.answer7.text.toString()
            if(tehh == "макроэкономика")
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