package com.example.ladm_u1_practica1_layoutsymasloyouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class Formulario : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)


        siguiente.setOnClickListener(){
            val formulary: Intent = Intent(applicationContext,TerceraPantalla::class.java)
            startActivity(formulary)
        }


        }









}