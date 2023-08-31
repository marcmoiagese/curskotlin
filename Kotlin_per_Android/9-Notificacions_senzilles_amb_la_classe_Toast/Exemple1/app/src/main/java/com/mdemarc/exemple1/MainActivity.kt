package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val numero = (Math.random() * 100_001).toInt()
        Toast.makeText(this, "Numero per a a recordar: ${numero}", Toast.LENGTH_LONG).show()
        val boto1=findViewById<Button>(R.id.button)
        boto1.setOnClickListener {
            if (numero == et1.text.toString().toInt())
                Toast.makeText(this, "Molt bé, has recordat el numero!.", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Oh no, no es el numero que t'ha sortit.", Toast.LENGTH_LONG).show()
        }
    }
}