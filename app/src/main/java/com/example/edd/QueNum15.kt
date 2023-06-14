package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum15Binding

class QueNum15 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer15btn.setOnClickListener{
            var tehh = binding.answer15.text.toString()
            if(tehh == "реальный доход")
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