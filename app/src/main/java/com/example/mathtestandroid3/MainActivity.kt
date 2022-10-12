package com.example.mathtestandroid3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClicker()
    }

    private fun initClicker() {
        binding.btnPlus.setOnClickListener {
            binding.tvResult.text = Math().add(
                binding.etFirstNumber.text.toString(),
                binding.etSecondNumber.text.toString()
            )
        }
        binding.btnDivide.setOnClickListener {
            binding.tvResult.text = Math().divide(
                binding.etFirstNumber.text.toString(),
                binding.etSecondNumber.text.toString()
            )
        }
    }
}