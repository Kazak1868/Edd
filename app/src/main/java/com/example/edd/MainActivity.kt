package com.example.edd


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.example.edd.databinding.ActivityMainBinding

import java.lang.Exception

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun changelist(view: View)
    {
        val something = Intent(this, MainActivity2::class.java)
        startActivity(something)
    }
    fun questions (view: View)
    {
        val something = Intent(this, MainActivity3::class.java)
        startActivity(something)
    }
    fun exit ()
    {
        finishAffinity()
    }

}