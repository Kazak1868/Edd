package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum17Binding

class QueNum17 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum17Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum17Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer17btn.setOnClickListener{
            var tehh = binding.answer17.text.toString()
            if(tehh == "накопления")
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