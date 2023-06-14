package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.edd.databinding.ActivityQueNum6Binding

class QueNum6 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer6btn.setOnClickListener{
            var tehh = binding.answer6.text.toString()
            if(tehh == "финансовая защита")
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