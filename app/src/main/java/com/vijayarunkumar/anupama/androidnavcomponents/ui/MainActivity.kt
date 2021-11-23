package com.vijayarunkumar.anupama.androidnavcomponents.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vijayarunkumar.anupama.androidnavcomponents.R
import com.vijayarunkumar.anupama.androidnavcomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}