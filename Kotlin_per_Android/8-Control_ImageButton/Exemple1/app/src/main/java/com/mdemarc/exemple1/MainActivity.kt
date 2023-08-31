package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv1=findViewById<TextView>(R.id.tv1)
        val boto1=findViewById<ImageButton>(R.id.boto1)
        boto1.setOnClickListener {
            tv1.text="Trucan..."
        }
    }
}