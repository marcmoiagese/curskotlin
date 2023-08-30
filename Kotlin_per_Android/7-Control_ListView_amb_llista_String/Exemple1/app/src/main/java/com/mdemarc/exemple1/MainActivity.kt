package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv1=findViewById<TextView>(R.id.tv1)
        val list1=findViewById<ListView>(R.id.list1)
        val paisos = arrayOf( "Àland" , "Albània" , "Alemanya" , "Andorra" , "Armènia" , "Àustria" , "Bèlgica" , "Bielorússia" , "Bòsnia i Hercegovina" , "Bulgària" , "Ciutat del Vaticà" , "Croàcia" , "Dinamarca" , "Eslovàquia" , "Eslovènia" , "Espanya" , "Estònia" , "Finlàndia" , "França" , "Geòrgia" , "Gibraltar" , "Grècia" , "Guernsey" , "Holanda" , "Hongria" , "Illes Fèroe" , "Irlanda" , "Islàndia" , "Itàlia" , "Jersey" , "Kosovo" , "Letònia" , "Lituània" , "Luxemburg" , "Macedònia del Nord" , "Malta" , "Moldàvia" , "Mònaco" , "Montenegro" , "Noruega" , "Polònia" , "Portugal" , "Regne Unit" , "Romania" , "Rússia" , "Sant Marí" , "Sèrbia" , "Suècia" , "Suïssa" , "Svalbard i Jan Mayen" , "Turquia" , "Txèquia" , "Ucraïna" )
        var habitans = arrayOf("29.000" , "2.800.000" , "83.200.000" , "77.000" , "2.900.000" , "9.000.000" , "11.500.000" , "9.400.000" , "3.300.000" , "6.900.000" , "800" , "4.000.000" , "5.800.000" , "5.500.000" , "2.100.000" , "47.400.000" , "1.300.000" , "5.500.000" , "67.100.000" , "3.700.000" , "34.000" , "10.400.000" , "63.000" , "17.400.000" , "9.700.000" , "49.000" , "4.900.000" , "366.000" , "60.400.000" , "108.000" , "1.800.000" , "1.900_000" , "2.800.000" , "634.000" , "2.100.000" , "514.000" , "4.000.000" , "39.000" , "600.000" , "5.400.000" , "38.000.000" , "10.300.000" , "66.000.000" , "19.300.000" , "146.600.000" , "33.000" , "6.900.000" , "10.400.000" , "8.600.000" , "2.500" , "84.300.000" , "44.800.000" , "10.700.000")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paisos)
        list1.adapter = adaptador1
        list1.setOnItemClickListener { adapterView, view, i, l ->
            tv1.text = "Població: ${habitans[i]}"
        }
    }
}