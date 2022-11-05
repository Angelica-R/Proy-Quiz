package com.example.proy_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_categorias.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preguntas.*


class Categorias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
       // Nombre=intent.getStringExtra(setData.nombre)
        //val user=intent.getStringExtra(setData.nombre)
       // c_nombre.text="${user}, elija una categoría"




        button_html.setOnClickListener{
            var intent = Intent(this,PreguntashActivity::class.java)
            startActivity(intent)
            finish()

        }
        button_kotlin.setOnClickListener{
            var intent = Intent(this,PreguntasActivity::class.java)
            startActivity(intent)
            finish()
        }

        button_c.setOnClickListener{
            var intent = Intent(this,PreguntascActivity::class.java)
            startActivity(intent)
            finish()
        }

        button_py.setOnClickListener{
            var intent = Intent(this,PreguntaspActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}