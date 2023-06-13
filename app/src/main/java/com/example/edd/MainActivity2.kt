package com.example.edd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edd.databinding.MaingameBinding

class MainActivity2 : AppCompatActivity() {

        private lateinit var binding: MaingameBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = MaingameBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }
}