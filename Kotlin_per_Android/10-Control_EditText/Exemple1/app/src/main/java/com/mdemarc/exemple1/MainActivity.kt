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
        val et2=findViewById<EditText>(R.id.et2)
        val boto1=findViewById<Button>(R.id.boto1)
        boto1.setOnClickListener {
            if (et2.text.toString().length == 0)
                Toast.makeText(this, "La contrasenya no pot estar buida", Toast.LENGTH_LONG).show()
        }
    }
}