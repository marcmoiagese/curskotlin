package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val check1=findViewById<CheckBox>(R.id.check1)
        val check2=findViewById<CheckBox>(R.id.check2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var resultat=""
            if (check1.isChecked)
                resultat = "Suma = ${et1.text.toString().toInt() + et2.text.toString().toInt()} "
            if (check2.isChecked)
                resultat += "Resta = ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
            tv1.text = resultat
        }
    }
}