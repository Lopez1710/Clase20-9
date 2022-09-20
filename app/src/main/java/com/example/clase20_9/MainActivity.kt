package com.example.clase20_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var etn_Num1:EditText?=null
    // otra forma es
    lateinit var etn_Num2:EditText
    lateinit var tv_Resultado:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //claseAnidadasyInternas()
        etn_Num1=findViewById(R.id.etn_Num1)
        etn_Num2=findViewById(R.id.etn_Num2)
        tv_Resultado=findViewById(R.id.resultado)
    }

    private fun claseAnidadasyInternas(){
        //clase anidada
       val miClaseAnidada = miClaseAnidadayInterna.miClaseAnidada().suma(3,4)

        println("el resultado de la suma es $miClaseAnidada")

        //clase interna

        val miClaseInterna = miClaseAnidadayInterna().miClaseInterna().suma2(5)

        println("el resultado de la suma es $miClaseInterna")
    }
}

    fun Calcular(){
    }