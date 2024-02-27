package com.example.conversorlinear

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversorlinear.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonReal.setOnClickListener{
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao :Double = 4.4

            var real : Double = euros*taxaConversao

            real = String.format("%.2f",real).toDouble()

            binding.textValorConvertido.text= "$real R$"
        }

        binding.buttonDolar.setOnClickListener{
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao :Double = 1.2

            var dolar : Double = euros*taxaConversao

            dolar = String.format("%.2f",dolar).toDouble()

            binding.textValorConvertido.text= "$dolar $"
        }

        binding.buttonPeso.setOnClickListener{
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaConversao :Double = 31.5

            var pesos : Double = euros*taxaConversao

            pesos = String.format("%.2f",pesos).toDouble()

            binding.textValorConvertido.text= "$pesos Pesos"
        }
    }


}