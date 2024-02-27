package com.example.primeirologin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.primeirologin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            var username: String = binding.textEditUsername.text.toString()
            var password: String = binding.textEditPassword.text.toString()

            binding.textEditUsername.setText("") // ou setText ou clear (funcionam da mesma maneira)
            binding.textEditPassword.text.clear()


            if(username.equals("user") && password.equals("pass")){
                // Login valido
                Toast.makeText(applicationContext, "Login Válido", Toast.LENGTH_SHORT).show()

                // Mudar de atividade
                startActivity(Intent(this,MainActivity2::class.java))



            }else{
                // Login invalido
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}