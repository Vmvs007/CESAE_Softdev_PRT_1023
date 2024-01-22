package com.example.primeiraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{
            var nome : String = binding.editNome.text.toString()
            binding.textResultado.text="Olá $nome"
        }

    }
}