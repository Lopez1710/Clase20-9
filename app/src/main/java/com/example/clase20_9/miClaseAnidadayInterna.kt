package com.example.clase20_9

class miClaseAnidadayInterna {

    ///clase anidada es una clase que puede estar dentro de de otra clase
    private val uno = 1
    private fun retornar():Int{
        return uno
    }
    class miClaseAnidada{
        fun suma(n1:Int,n2:Int):Int{

            return n1+n2
        }
    }

     inner class miClaseInterna{
        fun suma2(num:Int):Int{

            return num + uno + retornar()
        }
    }
}