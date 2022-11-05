package com.example.proy_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val usuario=intent.getStringExtra(setData.nombre)
        val score=intent.getStringExtra(setData.score)
        val total=intent.getStringExtra("total_preg")

      //  Nombre.text="¡Felicitaciones ${usuario}!"
        Nombre.text="¡Felicitaciones!"
        Score.text="${score}/${total}"
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}