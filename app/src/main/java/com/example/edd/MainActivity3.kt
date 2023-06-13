package com.example.edd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.edd.databinding.QuestionsBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: QuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = QuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun QNum1 (view: View)
    {
        val something = Intent(this, MainActivity3::class.java)
        startActivity(something)
    }
}