package com.jung.so_pong_so_pom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.jung.so_pong_so_pom.databinding.ActivitySplashBinding
import com.jung.so_pong_so_pom.onBoarding.OnBoardingActivity

class SplashActivity : AppCompatActivity() {
    // ViewBinding Setting
    private var _binding: ActivitySplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1초 후 온보딩 페이지로 이동
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}