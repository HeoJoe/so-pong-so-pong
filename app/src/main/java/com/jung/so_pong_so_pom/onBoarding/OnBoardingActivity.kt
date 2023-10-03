package com.jung.so_pong_so_pom.onBoarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jung.so_pong_so_pom.databinding.ActivityOnBoardingBinding

// 온보딩 페이지
class OnBoardingActivity : AppCompatActivity() {
    // ViewBinding Setting
    private var _binding: ActivityOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}