package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum12Binding

class QueNum12 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer12btn.setOnClickListener{
            var tehh = binding.answer12.text.toString()
            if(tehh == "акции")
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