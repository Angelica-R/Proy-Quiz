package com.example.proy_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        button.setOnClickListener{
            if (input.text.toString().isEmpty()){
                Toast.makeText(this,"",Toast.LENGTH_SHORT).show()
            }
            else{
                /*var intent = Intent(this,PreguntasActivity::class.java)
                intent.putExtra("${setData.nombre}",input.text.toString())
                startActivity(intent)
                finish()*/

                var intent = Intent(this,Categorias::class.java)
                intent.putExtra("${setData.nombre}",input.text.toString())
                startActivity(intent)
                finish()

            }

        }

    }

}