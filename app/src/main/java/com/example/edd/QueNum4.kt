package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.edd.databinding.ActivityQueNum4Binding

class QueNum4 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer4btn.setOnClickListener{
            var tehh = binding.answer4.text.toString()
            if(tehh == "финансовый институт")
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