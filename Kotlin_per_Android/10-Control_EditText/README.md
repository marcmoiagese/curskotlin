# 10 - Control EditText

Des que hem comensat el curs, hem utilitzat el control que permet a Andorid, introduir  valors per teclat. La classe que administra la entrada de caracters per teclat es EditText.

Pero a la palette de components a la pestanya "Text" veiem que hi ha molts tipus de EditText:

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/10-Control_EditText/img/1.PNG)

Com podem veure a la pestanya "Text" es troben tots els tipus EditText que ens ofereix Android per utilitzar a les nostres aplicacions. Password,  E-mail, Number, etc.

Escollirem un o altre en funció del tipus d'entrada que nesecitem.

En aquest exemple, farem un programa que ens soliciti un usuari i la seva clau en dos controls de tipus EditText.

Al preme el botó validarem si s'ha introduit algun text al camp de la contrasenya, si no, informarem a través d'una notificació. Utilitzarem la propietat length de la classe String per veure cuants caracters s'han introduit. L'interficie visual ha de ser similar a la següent:

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/10-Control_EditText/img/2.PNG)

el formulari EditText per introduir el nom es del tipus "Plain Text", iniciarem la propietet "hint" amb el valor "introdueix el nom". El segon EditText es de tipus "Password" i inicialitzarem la propietat "hint" amb el valor "Introdueix la contrasenya".

Definirem el ID dels dos controls de tipus EditText amb els valors "et1" i "et2". Iniciarem la propietat id del Button amb el balor "boto1"

Recordem d'enllaçar els objectes premen el botó "Infer constraints".

Codi font:

```Kotlin
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
```

Com pots veure cuan es prem el botó "verificr" es procedeix a extreure el contingut del EditText de la clau i amb la propietat length controlem si te 0 caracters, en cas afirmatiu mostrem la notificació per pantalla.

```Kotlin
        boto1.setOnClickListener {
            if (et2.text.toString().length == 0)
                Toast.makeText(this, "La contrasenya no pot estar buida", Toast.LENGTH_LONG).show()
        }
```

A la pantalla obtindrem un resultat similar al seguent:

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/10-Control_EditText/img/3.PNG)

