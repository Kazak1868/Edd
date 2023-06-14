package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum20Binding

class QueNum20 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum20Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum20Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer20btn.setOnClickListener{
            var tehh = binding.answer20.text.toString()
            if(tehh == "финансовыецели")
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