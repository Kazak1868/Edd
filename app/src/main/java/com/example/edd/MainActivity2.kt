package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.edd.databinding.MaingameBinding

class MainActivity2 : AppCompatActivity() {

        private lateinit var binding: MaingameBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = MaingameBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }
    fun questions (view: View)
    {
        val something = Intent(this, MainActivity3::class.java)
        startActivity(something)
    }
}