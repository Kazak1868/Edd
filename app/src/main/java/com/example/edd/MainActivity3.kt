package com.example.edd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edd.databinding.QuestionsBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: QuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}