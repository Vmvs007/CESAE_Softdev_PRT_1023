package com.example.primeiraapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    /* TODO Versão 1 : Slide Primeira App
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{
            var nome : String = binding.editNome.text.toString()
            binding.textResultado.text="Olá $nome"
        }

    }
    */

    /* TODO Versão 2 : Nome e Apelido
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{

            var nome : String = binding.editTextNome.text.toString()
            var apelido : String = binding.editTextApelido.text.toString()

            if(nome.isEmpty() || apelido.isEmpty()){ // if(nome == "" || apelido == "")
                // Apresentar mensagem de erro
                binding.textResultado.text="Não foi inserido nome ou apelido"
            }else{
                // Apresentar mensagem de olá
                binding.textResultado.text="Olá $nome $apelido"
            }

        }

    }
    */


/* TODO Versão 3 : Nome e Apelido (mais casos)
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(binding.root)

binding.buttonOla.setOnClickListener {

    var nome: String = binding.editTextNome.text.toString()
    var apelido: String = binding.editTextApelido.text.toString()

    if(nome.isEmpty() && apelido.isEmpty()){
        // Apresentar mensagem de erro
        binding.textResultado.text = "Não foi inserido nome e apelido"

    }else if (nome.isEmpty()) {
        // Apresentar mensagem de erro
        binding.textResultado.text = "Não foi inserido nome"

    } else if(apelido.isEmpty()){
        // Apresentar mensagem de erro
        binding.textResultado.text = "Não foi inserido apelido"

    }else{

        if(nome.equals("Vitor") && apelido.equals("Santos")){
            // Apresentar mensagem de olá especial
            binding.textResultado.text = "Olá chefe"

        }else{
            // Apresentar mensagem de olá
            binding.textResultado.text = "Olá $nome $apelido"

        }

    }

}



}

*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {

            var nome: String = binding.editTextNome.text.toString()
            var apelido: String = binding.editTextApelido.text.toString()

            if(nome.isEmpty() && apelido.isEmpty()){
                // Apresentar mensagem de erro
                Toast.makeText(applicationContext, "Não foi inserido nome e apelido", Toast.LENGTH_SHORT).show()

            }else if (nome.isEmpty()) {
                // Apresentar mensagem de erro
                Toast.makeText(applicationContext, "Não foi inserido nome", Toast.LENGTH_SHORT).show()

            } else if(apelido.isEmpty()){
                // Apresentar mensagem de erro
                Toast.makeText(applicationContext, "Não foi inserido apelido", Toast.LENGTH_SHORT).show()

            }else{

                if(nome.equals("Vitor") && apelido.equals("Santos")){
                    // Apresentar mensagem de olá especial
                    Toast.makeText(applicationContext, "Olá chefe", Toast.LENGTH_SHORT).show()

                }else{
                    // Apresentar mensagem de olá
                    Toast.makeText(applicationContext, "Olá ${nome} ${apelido}", Toast.LENGTH_SHORT).show()

                }

            }

        }



    }
}