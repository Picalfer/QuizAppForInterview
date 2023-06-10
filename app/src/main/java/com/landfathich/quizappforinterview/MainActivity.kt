package com.landfathich.quizappforinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.landfathich.quizappforinterview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
    }
}