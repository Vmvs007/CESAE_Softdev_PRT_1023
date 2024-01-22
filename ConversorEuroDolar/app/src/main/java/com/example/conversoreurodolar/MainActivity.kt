package com.example.conversoreurodolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConversor.setOnClickListener{
            var euros: Double = binding.editTextEuro.text.toString().toDouble()
            var taxaConversao :Double = 1.09

            var dolares : Double = euros*taxaConversao

            binding.textDolares.text= "$dolares Dolares"
        }
    }
}