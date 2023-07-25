package com.example.mvpprueba.Model

class PassModel {

    private var password: String = ""

    fun setpassword(password: String){
        this.password=password

    }



    fun letraspassword(): String{

        if (password.length<5){
            return "Contraseña debil, debe tener 5 caracteres al menos"
        }
        if (password.all { it.isLowerCase() }){


            return "Contraseña seguridad media, solo tiene letras minúsculas"

        }
        if (password.any {it.isUpperCase()}){
            return "Contraseña fuerte, tiene 5 caracteres y al menos una mayúscula"

        }
        return "Contraseña de seguridad media, tiene 5 caracteres y no contiene mayusculas"

    }


    fun colorpassword(): String{
        if (password.length<5){
            return "#FF0000"//rojo debil
        }
        if (password.all { it.isLowerCase() }){


            return "#FFFF00"//amarillo medio

        }
        if (password.any {it.isUpperCase()}){
            return "#00FF00"//verde fuerte

        }
        return "#FFFF00"//amarillo medio

    }
}