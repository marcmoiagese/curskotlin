package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        val spinner=findViewById<Spinner>(R.id.spinner)
        val llista = arrayOf("sumar", "restar", "multiplicar", "dividir")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, llista)
        spinner.adapter = adaptador1
        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "sumar" -> tv1.text = "Resultat: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
                "restar" -> tv1.text = "Resultat: ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
                "multiplicar" -> tv1.text = "Resultat: ${et1.text.toString().toInt() * et2.text.toString().toInt()}"
                "dividir" -> tv1.text = "Resultat: ${et1.text.toString().toInt() / et2.text.toString().toInt()}"
            }
        }
    }
}