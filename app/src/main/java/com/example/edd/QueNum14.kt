package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.edd.databinding.ActivityQueNum14Binding

class QueNum14 : AppCompatActivity() {
    private lateinit var binding: ActivityQueNum14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueNum14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer14btn.setOnClickListener{
            var tehh = binding.answer14.text.toString()
            if(tehh == "налоговый вычет")
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