package com.example.proy_quiz

object setDatac {
    const val nombre:String="nombre"
    const val score:String="score"
    fun getPreguntac():ArrayList<Data>{
        var preg:ArrayList<Data> = arrayListOf()
        var preg1=Data(
            id = 1,
            //C#
            pregunta = "¿ Cuál de ellos no es una estructura de control?",
            opcion1 = "if",
            opcion2 = "try",
            opcion3 = "switch",
            opcion4 = "while",
            respuesta = 2
        )

        var preg2=Data(
            id = 2,
            //C#
            pregunta = "La aplicación Windows forms me permite",
            opcion1 = "Ninguna de las anteriores",
            opcion2 = "Crear una forma con varios objetos",
            opcion3 = "Crear un contenedor de objetos",
            opcion4 = "Crear un formulario en blanco para agregar objetos",
            respuesta = 4
        )

        var preg3=Data(
            id = 3,
            //C#
            pregunta = "Para receptar un dato detro de un formulario",
            opcion1 = "Button",
            opcion2 = "Textbox",
            opcion3 = "Label",
            opcion4 = "Radiobutton",
            respuesta = 2

        )

        var preg4=Data(
            id = 4,
            //C#
            pregunta = "Un Objeto es:",
            opcion1 = "Una entidad con características similares a otro objeto",
            opcion2 = "Una entidad con características diferentes a otro objeto",
            opcion3 = "Una entidad con características propias",
            opcion4 = "Ninguna de las anteriores",
            respuesta = 3
        )
        var preg5=Data(
            id = 5,
            //C#
            pregunta = "¿Cuales son las propiedades de la orientación a objetos?",
            opcion1 = "Encapsulacion",
            opcion2 = "Herencia",
            opcion3 = "Polimorfismo",
            opcion4 = "Todas son ciertas",
            respuesta = 4
        )

        preg.add(preg1)
        preg.add(preg2)
        preg.add(preg3)
        preg.add(preg4)
        preg.add(preg5)
        return preg
    }
}