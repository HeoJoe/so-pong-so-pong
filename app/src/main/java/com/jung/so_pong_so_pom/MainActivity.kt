package com.jung.so_pong_so_pom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jung.so_pong_so_pom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // ViewBinding Setting
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}