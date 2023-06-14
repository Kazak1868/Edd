package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.edd.databinding.ActivityQueNum3Binding

class QueNum3 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer3btn.setOnClickListener{
            var tehh = binding.answer3.text.toString()
            if(tehh == "биржа")
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