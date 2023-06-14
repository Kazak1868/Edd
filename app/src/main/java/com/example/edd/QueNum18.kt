package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum18Binding

class QueNum18 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum18Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum18Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer18btn.setOnClickListener{
            var tehh = binding.answer18.text.toString()
            if(tehh == "инвестиции")
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