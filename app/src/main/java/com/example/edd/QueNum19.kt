package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum19Binding

class QueNum19 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum19Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum19Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer19btn.setOnClickListener{
            var tehh = binding.answer19.text.toString()
            if(tehh == "экономический агент")
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