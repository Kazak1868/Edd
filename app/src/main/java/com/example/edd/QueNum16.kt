package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum16Binding

class QueNum16 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum16Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum16Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer16btn.setOnClickListener{
            var tehh = binding.answer16.text.toString()
            if(tehh == "микроэкономика")
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