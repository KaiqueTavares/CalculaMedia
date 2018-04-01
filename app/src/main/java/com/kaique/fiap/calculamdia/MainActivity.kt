package com.kaique.fiap.calculamdia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Quando eu clicar no meu botão, ele ira executar as seguintes funções
        //Eu irei criar uma variavel que irá captar todas as variaveis e mandar para a tela de resultado
        //Pego as variaveis com o putExtra, passando o nome ,e aonde ele pega a variavel e converto em string.
        //Termino a função startando a minha activity de tela resultado.
        btEnviar.setOnClickListener{
            val telaResultado= Intent(this,ResultadoActivity::class.java)
            telaResultado.putExtra("NOME",etNome.editableText.toString())
            telaResultado.putExtra("RM",etRM.editableText.toString())
            telaResultado.putExtra("NOTA1",etNota1.editableText.toString())
            telaResultado.putExtra("NOTA2",etNota2.editableText.toString())
            telaResultado.putExtra("NOTA3",etNota3.editableText.toString())
            startActivity(telaResultado)
        }
    }
}
