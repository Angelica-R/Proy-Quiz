package com.example.proy_quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_preguntas.*

class PreguntasActivity : AppCompatActivity() {
    private var Nombre: String?= null
    private var score:Int=0
    
    private var currentPosition:Int=1
    private var preguntasList:ArrayList<Data> ? =null
    private var selectOpc:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)
        Nombre=intent.getStringExtra(setData.nombre)
       // val usuario=intent.getStringExtra(setData.nombre)
       // f_nombre.text="${usuario}, marca la opción correcta"
        //setData.getPregunta()


        preguntasList=setData.getPregunta()
        setPregunta()


        op1.setOnClickListener {
            selectOpcionStyle(op1,1)
        }

        op2.setOnClickListener {
            selectOpcionStyle(op2,2)
        }

        op3.setOnClickListener {
            selectOpcionStyle(op3,3)
        }

        op4.setOnClickListener {
            selectOpcionStyle(op4,4)
        }
        submit.setOnClickListener {
            if (selectOpc!=0){
                val pregunta=preguntasList!![currentPosition-1]
                if (selectOpc!=pregunta.respuesta){
                    setColor(selectOpc,R.drawable.resp_incorrecta)
                }
                else{
                    score++;
                }
                setColor(pregunta.respuesta,R.drawable.resp_correcta)
                if(currentPosition==preguntasList!!.size){
                    submit.text="TERMINADO"
                }
                else{
                    submit.text="SIGUIENTE"
                }

            }
            else{
                currentPosition++
                when{
                    currentPosition<=preguntasList!!.size->{
                        setPregunta()
                    }
                    else->{
                        //Toast.makeText(this,"TERMINADO",Toast.LENGTH_SHORT).show()

                        val intent=Intent(this,Resultado::class.java)
                        intent.putExtra(setData.nombre,Nombre.toString())
                        intent.putExtra(setData.score,score.toString())
                        intent.putExtra("total_preg",preguntasList!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }
            }
            selectOpc=0
        }

        /*var preg=preguntasList!![0]
        preguntastxt.text=preg.pregunta
        op1.setOnClickListener{
            op1.background=ContextCompat.getDrawable(this,R.drawable.opciones)
        }
        op1.text=preg.opcion1
        op2.text=preg.opcion2
        op3.text=preg.opcion3
        op4.text=preg.opcion4

        progressbar.progress=1
        progressbar.max=preguntasList!!.size*/

       /* var p=setData.getPregunta()
        Log.e("my test","${p.size}")*/
    }
    fun setColor(opc: Int,color:Int){
        when(opc){
            1->{
                op1.background=ContextCompat.getDrawable(this,color)
            }
            2->{
                op2.background=ContextCompat.getDrawable(this,color)
            }
            3->{
                op3.background=ContextCompat.getDrawable(this,color)
            }
            4->{
                op4.background=ContextCompat.getDrawable(this,color)
            }
        }

    }

    fun setPregunta(){
        val pregunta = preguntasList!![currentPosition-1]
        setOpcionStyle()

        progressbar.progress=currentPosition
        progressbar.max=preguntasList!!.size
        progressbartxt.text="${currentPosition}"+"/"+"${preguntasList!!.size}"
        preguntastxt.text=pregunta.pregunta
        op1.text=pregunta.opcion1
        op2.text=pregunta.opcion2
        op3.text=pregunta.opcion3
        op4.text=pregunta.opcion4
    }



    fun setOpcionStyle(){
        var opcionList:ArrayList<TextView> = arrayListOf()
        opcionList.add(0,op1)
        opcionList.add(1,op2)
        opcionList.add(2,op3)
        opcionList.add(3,op4)
        for (opc in opcionList){
            opc.setTextColor(Color.parseColor("#555151"))
            opc.background=ContextCompat.getDrawable(this,R.drawable.preguntas_opciones)
            opc.typeface= Typeface.DEFAULT
        }
    }
    fun selectOpcionStyle(view:TextView,opc:Int){
        setOpcionStyle()
        selectOpc=opc
        view.background=ContextCompat.getDrawable(this,R.drawable.opciones)
        view.typeface=Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
}