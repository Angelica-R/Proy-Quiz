package com.example.proy_quiz

object setDatah {
    const val nombre:String="nombre"
    const val score:String="score"
    fun getPreguntah():ArrayList<Data>{
        var preg:ArrayList<Data> = arrayListOf()
        var preg1=Data(

            id = 1,
            //html
            pregunta = "¿Qué formato tienen las páginas HTML?",
            opcion1 = "Son ficheros de texto. Podemos leer su contenido con cualquier procesador de texto",
            opcion2 = "Son ficheros binarios compilados. No se pueden leer, solo ejecutar en un navegador",
            opcion3 = "Son ficheros de texto especiales. Solo pueden leerlos los navegadores, un editor de texto normal no podría abrirlo",
            opcion4 = "Ninguna de las anteriores",
            respuesta = 1
        )

        var preg2=Data(
            id = 2,
            //html
            pregunta = "¿Cuál es la versión actualmente vigente del estándar HTML?",
            opcion1 = "HTML 6",
            opcion2 = "HTML 3",
            opcion3 = "HTML 4",
            opcion4 = "HTML 5",
            respuesta = 4
        )

        var preg3=Data(
            id = 3,
            //html
            pregunta = "¿Cuál es la estructura de una página Web? Elige de las siguientes cuál es el que muestra las secciones correctas",
            opcion1 = "<!DOCTYPE html> <html> <head>.....</head> <body>.....</body> </html>",
            opcion2 = "<!DOCTYPE html> <head>.....</head> <body>....</body> <footer>.....</footer>",
            opcion3 = "<!DOCTYPE html> <html> <head>.....</head> <body>.....</body> <footer>....</footer> </html>",
            opcion4 = "<!DOCTYPE html> <body> <head>.....</head> <html>.....</html> </body>",
            respuesta = 1
        )

        var preg4=Data(
            id = 4,
            //html
            pregunta = "¿Cómo se etiqueta un párrafo en HTML?",
            opcion1 = "</p>Esto es un párrafo.</p>",
            opcion2 = "<p=Esto es un párrafo/>",
            opcion3 = "<p>Esto es un párrafo.<p>",
            opcion4 = "<p>Esto es un párrafo.</p>",
            respuesta = 4
        )
        var preg5=Data(
            id = 5,
            //html
            pregunta = "¿Para que se usa el atributo ‘src’ en algunos elementos de HTML?",
            opcion1 = "El atributo 'src' no existe en HTML",
            opcion2 = "Para indicar la ubicación de un recurso, como una página, una imagen o un video",
            opcion3 = "Se usa en etiquetas de texto para indicar el color con que se presentará el mismo",
            opcion4 = "Se usa en etiquetas de texto para indicar la tipografía (fuente) que se usa",
            respuesta = 2
        )

        preg.add(preg1)
        preg.add(preg2)
        preg.add(preg3)
        preg.add(preg4)
        preg.add(preg5)
        return preg
    }
}