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

        val rm = intent?.getStringExtra("RM")!!.toInt()
        val nota1 = intent?.getStringExtra("NOTA1")!!.toDouble()
        val nota2 = intent?.getStringExtra("NOTA2")!!.toDouble()
        val nota3 = intent?.getStringExtra("NOTA3")!!.toDouble()
        val media = (nota1+nota2+nota3)/3

        tvRm.text = rm.toString()
        tvNota1.text = nota1.toString()
        tvNota3.text = nota2.toString()
        tvNota3.text = nota3.toString()
        tvMedia.text = media.format(digits = 1)

        if (media >= 5){
            alterarTexto(texto = "APROVADO!")
        }else{
            alterarTexto(texto = "REPROVADO")
        }
    }

    fun alterarTexto (texto: String){
        tvResultado.text = texto
    }
}