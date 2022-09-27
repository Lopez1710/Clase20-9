package com.example.clase20_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*

class listViewApp : AppCompatActivity() {

    private var lv_Lenguajes:ListView?=null
    private var tv_Seleccion:TextView?=null


    private val lenguajes= arrayOf("Kotlin","Java","C#","C++","Php","VB.net")
    private val posicion = arrayOf("3","4","2","1","6","5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_app)

        lv_Lenguajes=findViewById(R.id.lv_lenguajes)
        tv_Seleccion=findViewById(R.id.tv_Seleccion)

        var adaptador:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.nuevoxmlparalistview,lenguajes)
        lv_Lenguajes?.adapter=adaptador
        lv_Lenguajes?.onItemClickListener= object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {

                tv_Seleccion?.text="La posicion del tenguaje ${lv_Lenguajes?.getItemAtPosition(position)} es ${posicion[position]}"

            }

        }
    }




}