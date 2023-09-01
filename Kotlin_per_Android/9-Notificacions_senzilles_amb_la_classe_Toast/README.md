# 9 - Notificacions senzilles amb la classe Toast

Android ens permet mostrar una finestra emergent temporal que informa a l'usuari a través d'un missatge que apareix a la pantalla per un petit lapse de temps, despres d'un temps, la pantalla, desapareix.

Aquesta finestra que es superposa a l'interficie que s'esta ensenyan en aquell moment s'administra a través d'una classe anomenada Toast.

Generarem un numero aleatori entre 1 i 100000. Ensenyarem en una finestra emergent el numero per un valor de temps. Després, a través d'un control EditText ("Number") demanara al operador que introdueixi el numero que ha vist per pantalla. Cuan es premi un boto controlarem el numero generarat aleatoriament amb el que introdueix l'usuari, i, a través d'un altre Toast informar si ha encertat o no. El primer que farem, es crear l'interficie seguent:

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/9-Notificacions_senzilles_amb_la_classe_Toast/img/1.PNG)

Hem posat un TextView, un EditText("Number") i un botó. amb els ID tv1, et1 i boto1 respectivament. Recorda que a la finestra "Component Tree" tenim la referencia  de tots els objectes que conte la nostra interficie.

Si volem que a la vista "blueprint" es mostrin tots els enllasos dels controls, hem de seleccionar l'opcio "Show all Constraints" ja que per defecte no ve activa.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/9-Notificacions_senzilles_amb_la_classe_Toast/img/2.PNG)

codi fon:

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
        val numero = (Math.random() * 100_001).toInt()
        Toast.makeText(this, "Numero per a a recordar: ${numero}", Toast.LENGTH_LONG).show()
        val boton1=findViewById<Button>(R.id.button)
        boton1.setOnClickListener {
            if (numero == et1.text.toString().toInt())
                Toast.makeText(this, "Molt bé, has recordat el numero!.", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Oh no, no es el numero que t'ha sortit.", Toast.LENGTH_LONG).show()
        }
    }
}
```

Analitzem el codi de l'aplicació, el primer que fem es generar un valor aleatori compres entre 0 i 100000:

```Kotlin
        val numero = (Math.random() * 100_001).toInt()
```

Imprimim a través de la classe Toast un missatge amb el numero aleatori generat.

```Kotlin
        Toast.makeText(this, "Numero per a recordar: ${numero}", Toast.LENGTH_LONG).show()
```

posem l'expresio lambda que captura el clic del botó on verifiquem si el valor aleatori generat coincideix amb el valor que carrega l'operador al EditText:

```Kotlin
        boton1.setOnClickListener {
            if (numero == et1.text.toString().toInt())
                Toast.makeText(this, "Molt bé, has recordat el numero!.", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Oh no, no es el numero que t'ha sortit.", Toast.LENGTH_LONG).show()
        }
```
creem un objecte de la classe Toast, per aixo cridem el mètode estatic makeText de la classe Toast. A partir del objecte retornat cridem al metode show.

El metode makeText te tres parametres, el primer fa referencia a la finestra o Activity on apareix (this), el segon es un String que ensenyara per pantalla i finalment es una constatn que indica que la notificació es mostrara per un temps curt o llarg.

```Kotlin
        Toast.makeText(this, "Numero per a recordar: ${numero}", Toast.LENGTH_LONG).show()
```

Això fa que inmediatament quan executem l'aplicació es mostrara la notificacio amb el numero que l'usuari tindra que memoritzar.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/9-Notificacions_senzilles_amb_la_classe_Toast/img/3.PNG)

Despres d'uns segons desapareix la notificació de la pantalla que conté el numero aleatori.

Cuan l'operador acaba de posar el numero i prem el botó "revisar" s'executa el codi que hem posat a la lambda

```Kotlin
        boton1.setOnClickListener {
            if (numero == et1.text.toString().toInt())
                Toast.makeText(this, "Molt bé, has recordat el numero!.", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Oh no, no es el numero que t'ha sortit.", Toast.LENGTH_LONG).show()
        }
```

En aquest metode extraiem del control EditText el numero que l'usuari ha introduit

```Kotlin
        if (numero == et1.text.toString().toInt())
```

Amb un if validarem si coincideix amb el numero aleatori introduit per l'operador, si coincideix inmediatament crearem una nova notificació i procedirem a dir que ha encertat.

```Kotlin
        if (numero == et1.text.toString().toInt())
                Toast.makeText(this, "Molt bé, has recordat el numero!.", Toast.LENGTH_LONG).show()
```

Pero si no es cumpleix imprimirem una altra notificació

```Kotlin
         else
             Toast.makeText(this, "Oh no, no es el numero que t'ha sortit.", Toast.LENGTH_LONG).show()
```

Si volem que ens aparegui un nou numero aleatori, hem d'apagar el programa i tornarlo a executar.