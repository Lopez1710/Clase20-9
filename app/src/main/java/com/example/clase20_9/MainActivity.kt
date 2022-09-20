package com.example.clase20_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    var etn_Num1:EditText?=null
    // otra forma es
    lateinit var etn_Num2:EditText
    lateinit var tv_Resultado:TextView
    lateinit var rb_Suma:RadioButton
    lateinit var rb_Resta:RadioButton
    lateinit var rb_Multiplicacion:RadioButton
    lateinit var rb_Divicion:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //claseAnidadasyInternas()
        etn_Num1=findViewById(R.id.etn_Num1)
        etn_Num2=findViewById(R.id.etn_Num2)
        tv_Resultado=findViewById(R.id.resultado)
        rb_Suma =findViewById(R.id.rb_Suma)
        rb_Resta =findViewById(R.id.rb_Resta)
        rb_Multiplicacion =findViewById(R.id.rb_Multiplicacion)
        rb_Divicion =findViewById(R.id.rb_Divicion)
    }
    fun Calcular(vista:View){
        val valor1_String=etn_Num1?.text.toString()
        val valor2_String=etn_Num2.text.toString()

        var num1 = valor1_String.toInt()
        var num2 = valor2_String.toInt()

        if(rb_Suma.isChecked==true){
            val suma = num1+num2

            val resultado = suma.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Resta.isChecked==true){
            val resta = num1-num2

            val resultado = resta.toString()
            tv_Resultado.setText(resultado)
        }else if(rb_Divicion.isChecked==true){
            if(num2 != 0 && num1 != 0){
            val divicion = num1/num2

            val resultado = divicion.toString()
            tv_Resultado.setText(resultado)}else{
                Toast.makeText(this, "valor indefinido", Toast.LENGTH_SHORT).show()
            }
        }else if(rb_Multiplicacion.isChecked==true) {
            val multiplicacion = num1*num2

            val resultado = multiplicacion.toString()
            tv_Resultado.setText(resultado)
        }else{
            Toast.makeText(this, "Seleccione una opcion", Toast.LENGTH_LONG).show()
        }

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

