package com.example.androidleson570group

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidleson570group.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickWithShowToast(this, binding.btn1.text.toString())
        binding.btn2.setOnClickWithShowToast(this, binding.btn2.text.toString())
        binding.btn3.setOnClickWithShowToast(this, binding.btn3.text.toString())
        binding.btn4.setOnClickWithShowToast(this, binding.btn4.text.toString())
        binding.btn5.setOnClickWithShowToast(this, binding.btn5.text.toString())
    }
}


