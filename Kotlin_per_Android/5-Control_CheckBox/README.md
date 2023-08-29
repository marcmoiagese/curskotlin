# 5- Control CheckBox

L'objectiu, es continuar practican el que hem vist fins ara per la creació d'un projecte amb Android Studio i anar incorporan components. Ara veurem el CehckBox en un projecte nou.

## Problema:

Posa dos controls de tipus EditText ("Number"). La propietat "hint" de cada component mostrarà un missatge que soliciti la càrrega dels valors. També posarem dos controls de tipus CheckBox per tal de seleccionar si volem sumar o restar els valors mencionats. Finalment, mitjançant un control de tipus Button efectuarem l'operacio que hem indicat. Imprimirem el o els resultats dins un TextView.

El nou en aquest problema es l'inserció de dos objectes de la clase CheckBox que es troba a la pestanya "Buttons":

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/5-Control_CheckBox/img/1.PNG)

Hem d'iniciar les propietats "text" per ensenyar un text i la propietat "id" per poder fer referencia al CheckBox al programa Kotlin.

Al primer CheckBox li definirem el seu id amb el valor check1 i el segon amb el valor check2.

L'interficie gràfica final per aquest problema i els noms dels controls o components visuals els podem veure a la finestra "Component Tree":

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/5-Control_CheckBox/img/2.PNG)

Tingues en compte que sempre hem de premer l'icona "Infer Constraints" per enllaçar els objectes i situarlos.

Revisa que vas fixant els valors de les propietats "id" de cada un dels objectes: et1, et2, check1, check2, tv1 i button.

```Kotlin
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
```

Al metode onCreate cridem al mètode setOnClickListener i li enviem una expresió lambda que s'executarà cuan el botó sigui presionat.

```Kotlin
        button.setOnClickListener {
            var resultat=""
            if (check1.isChecked)
                resultat = "Suma = ${et1.text.toString().toInt() + et2.text.toString().toInt()} "
            if (check2.isChecked)
                resultat += "Resta = ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
            tv1.text = resultat
        }
```

Cuan presionem el botó verifiquem cada CheckBox i concatenem amb una cadena la suma si esta seleccionat el primer CheckBox i la resta, seguidament mostrarem el resultat dins un TextView.

```Kotlin
        var resultat=""
            if (check1.isChecked)
                resultat = "Suma = ${et1.text.toString().toInt() + et2.text.toString().toInt()} "
            if (check2.isChecked)
                resultat += "Resta = ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
            tv1.text = resultat
```

Al executar el programa, obtindrem un resultat similar a:

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/5-Control_CheckBox/img/3.PNG)