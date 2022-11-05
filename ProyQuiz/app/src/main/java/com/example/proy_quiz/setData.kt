package com.example.proy_quiz

object setData {
    const val nombre:String="nombre"
    const val score:String="score"
    fun getPregunta():ArrayList<Data>{
        var preg:ArrayList<Data> = arrayListOf()
        var preg1=Data(
            id = 1,
            //kotlin
            pregunta =  "¿Qué formato de representación es ampliamente utilizado en un proyecto Android?",
            opcion1 = "Bases de datos SQLite",
            opcion2 = "XML",
            opcion3 = "JSON",
            opcion4 = "JAR",
            respuesta = 2
        )

        var preg2=Data(
            id = 2,
            //kotlin
            pregunta =  "¿En qué carpetas se almacenan los recursos de una aplicación?",
            opcion1 = "res y assets",
            opcion2 = "res/raw y res/xml",
            opcion3 = "src y gen",
            opcion4 = "xml",
            respuesta = 1
        )

        var preg3=Data(
            id = 3,
            //kotlin
            pregunta =  "Las actividades tienen que ser declaradas en:",
            opcion1 = "AndroidManifest.xml",
            opcion2 = "El fichero xml que tienen asignadas como vista",
            opcion3 = "No hace falta delararlas",
            opcion4 = "main.xml",
            respuesta = 1
        )

        var preg4=Data(
            id = 4,
           /* pregunta =  "¿Cuál es la diferencia fundamental de almacenar un recurso en assets y en res?",
            opcion1 = "Para todo fichero incluido en res se creará una referencia en la clase R que facilitará acceder al fichero",
            opcion2 = "Se puede acceder a los ficheros almacenados en assets como se haría en un sistema de ficheros.",
            opcion3 = "Todas las respuestas son correctas.",
            opcion4 = "Los recursos en assets nunca son modificados",
            respuesta = 3,*/
            //kotlin
            pregunta =  "¿Qué significa SDK?",
            opcion1 = "Sand Dog King.",
            opcion2 = "Security Date Key.",
            opcion3 = "Software Development Kit.",
            opcion4 = "Ninguna es correcta.",
            respuesta = 3
        )
        var preg5=Data(
            id = 5,
            //kotlin
            pregunta =  "¿Cuál de los siguientes pasos es imprescindible para poder utilizar una actividad? ",
            opcion1 = "Declararla en AndroidManifest.xml",
            opcion2 = "Asignarle una vista",
            opcion3 = "Definir una clase que la implemente",
            opcion4 = "Todas las anteriores son ciertas",
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