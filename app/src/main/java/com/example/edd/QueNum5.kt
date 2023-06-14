package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.edd.databinding.ActivityQueNum5Binding

class QueNum5 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer5btn.setOnClickListener{
            var tehh = binding.answer5.text.toString()
            if(tehh == "фонды")
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