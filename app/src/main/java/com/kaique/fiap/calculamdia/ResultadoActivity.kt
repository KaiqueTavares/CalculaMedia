package com.kaique.fiap.calculamdia

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kaique.fiap.calculamdia.extensions.format
import kotlinx.android.synthetic.main.resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)
        //Resgatando os valores da outra tela
        //Em variaveis
        val rm = intent?.getStringExtra("RM")!!.toInt()
        val nota1 = intent?.getStringExtra("NOTA1")!!.toDouble()
        val nota2 = intent?.getStringExtra("NOTA2")!!.toDouble()
        val nota3 = intent?.getStringExtra("NOTA3")!!.toDouble()
        val media = (nota1+nota2+nota3)/3

        //Setando as variaveis nos meus text view
        //Devo converter elas em string.
        tvRm.text = rm.toString()
        tvNota1.text = nota1.toString()
        tvNota3.text = nota2.toString()
        tvNota3.text = nota3.toString()
        //Format é um script do extensions criado por mim.
        tvMedia.text = media.format(digits = 1)

        //Se a media for maior ou igual a cinco, chamo uma função que muda o texto e passo o parametro.
        if (media >= 5){
            alterarTexto(texto = "APROVADO!")
        }else{
            alterarTexto(texto = "REPROVADO")
        }
    }
    //Função que recebe um parametro string e passa dentro de minha text view um texto;
    fun alterarTexto (texto: String){
        tvResultado.text = texto
    }
}