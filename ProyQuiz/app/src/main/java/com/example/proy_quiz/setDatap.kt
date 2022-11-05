package com.example.proy_quiz

object setDatap {
    const val nombre:String="nombre"
    const val score:String="score"
    fun getPreguntap():ArrayList<Data>{
        var preg:ArrayList<Data> = arrayListOf()
        var preg1=Data(

            id = 1,
            //python
            pregunta = "¿Qué es PYTHON",
            opcion1 = "Es un lenguaje de programación con el cual podemos crear juegos y interactuar con dibujos animados",
            opcion2 = "Es un conjunto de acciones relacionadas con interactuar con personajes echos por ti mismo",
            opcion3 = "Es un lenguaje de programación interpretado cuya filosofía hace hincapié en una sintaxis que favorezca un código legible",
            opcion4 = "Ninguna de las anteriores",
            respuesta = 3
        )

        var preg2=Data(
            id = 2,
            //python
            pregunta = "¿Cuál de estos tipos de datos es mutable?",
            opcion1 = "bool (Booleano)",
            opcion2 = "decimal",
            opcion3 = "float (Número de coma flotante)",
            opcion4 = "Ninguna de las anteriores",
            respuesta = 4

        )

        var preg3=Data(
            id = 3,
            //python
            pregunta = "¿Cuál de estas líneas no producirá un error?",
            opcion1 = "define funcion(){ continue }",
            opcion2 = "define funcion():",
            opcion3 = "include funcion():",
            opcion4 = "def funcion():",
            respuesta = 4
        )

        var preg4=Data(
            id = 4,
            //python
            pregunta = "¿Qué codificación utiliza Python 3 para los strings?",
            opcion1 = "UTF-8",
            opcion2 = "UNICODE",
            opcion3 = "ASCII",
            opcion4 = "LATIN-1",
            respuesta = 2
        )
        var preg5=Data(
            id = 5,
            //python
            pregunta = "¿Quién fue el creador de PYTHON?",
            opcion1 = "Guido Van Rossum",
            opcion2 = "Edsger Wybe Dijkstra",
            opcion3 = "Richard Stallman",
            opcion4 = "Ninguna de las anteriores",
            respuesta = 1
        )

        preg.add(preg1)
        preg.add(preg2)
        preg.add(preg3)
        preg.add(preg4)
        preg.add(preg5)
        return preg
    }
}