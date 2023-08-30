# 6 - Control Spinner

Com hem fet fins ara, partirem del que ja hem vist, i li afegirem el control visual Spinner.

El control Spinner ens ensenya una llista de cadenes i ens permet escollir una d'elles. Cuan es selecciona s'obre i ensenya  tots els seus elements per permetre seleccionar un d'ells.

Farem la càrrega de dos numeros en controls de tipus EditText ("Number"). Imprimirem un missatge que soliciti la carrega de dos valors inician la propietat "hint" de cada control. Posarem un control de tipus Spinner que ens permeti seleccionar si volem  sumar, restar, multiplicar o dividir els valors donats. Finalment, mitjançant un control de tipus Button, realitzarem l'operació indicada. El resultat l'imprimirem dins un TextView.

Com pots veure, el que introduim nou en aquest control, es el formulari tipus Spinner que el pots veure a la pestanya "Containers".

![IMG]()

Deixem la propietat id amb el valor spinner que es el valor per defecte que crea Android Studio al afegir l'objecte de la classe Spinner.

A la seguent imatge, a la finestra "Component Tree" d'Android Studio, podem observar els objectes posats al formulari, els seus id i els seus textos. I de quina classe son.

![IMG]()

Codi font:

```Kotlin
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
```

Al metode onCreate definim un vector amb la llista de cadena que ensenyara el Spinner:

```Kotlin
        val lista = arrayOf("sumar", "restar", "multiplicar", "dividir")
```

Definim i creem un objecte de la classe ArrayAdapter:

```Kotlin
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, llista)
```

Al constructor li enviem com a primer paràmetre la referencia del nostre MainActivity (this), el segon paràmetre indica el tipus de Spinner, poden ser les constants:

```Kotlin
    android.R.layout.simple_spinner_item
    android.R.layout.simple_spinner_dropdown_item
```

El tercer paràmetre es la referencia del valor que mostrarà.

Despres li assignem a la propietat adapter del Spinner l'objecte de la classe ArrayAdapter que acabem de crear:

```Kotlin
        spinner.adapter = adaptador1
```

A la lambda registrada pel botó verifiquem quin item esta seleccionat al Spinner, i procedim a efectuar l'operació:

```Kotlin
        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "sumar" -> tv1.text = "Resultat: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
                "restar" -> tv1.text = "Resultat: ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
                "multiplicar" -> tv1.text = "Resultat: ${et1.text.toString().toInt() * et2.text.toString().toInt()}"
                "dividir" -> tv1.text = "Resultat: ${et1.text.toString().toInt() / et2.text.toString().toInt()}"
            }
        }
```

Al emulador obtindrem el següent resultat al executar el programa:

![IMG]()

Si volem que el Spinner no ocupi tot l'ample, cambiarem la propietat layout_width amb el valor wrap_content.