# 3- Capturar el click d'un botó

Com a exemple farem un programa que permeti la carrega de dos numeros enters en controls de tipus EditText (Number). Dins dels controls EditText posarem un missatge que soliciti la càrrega dels valors. Posarem un botó per sumar els dos vaors introduits. Imprimirem el resultat dins un control de tipus TextView.

L'interficie visual, quedara semblan a la seguent captura:

![IMG]()

Crea un projecte nou i pas a pas explicaré com arribar al  resultat final. primer, elimina el TextView que apareix per defecte cuan es crea un projecte amb Android Studio. Un cop eliminat, des de la finestra "Palette" seleccionem la pestanya "Text" el control "Number" (es de la classe EditText) i l'arrosseguem a la finestra de diseny de la nostra interficie a la part superior esquerra.

![IMG]()

Ara el seleccionem i a la finestra de propietats (Properties) especifiquem la propietat hint, posarem el text "Fot el primer valor"

![IMG]()

També especificarem la propietat "id" i li assignarem el valor et1 que es el nom des del cual accedirem despres des de Kotlin. Ens apareixerà un dialeg on escollirem "Refactor", i també premerem l'icona de "Infer Constraints" per situar el control respecte als costats.

![IMG]()

Repetim les passes anteriors per crear el segon EditText de tipus "Number", l'indicarem el id amb el nom et2 i la propietat hint amb el missatge "Fot el segon valor", el resultat visual ha de ser algo semblant a aixo:

![IMG]()

De la pestanya "Buttons" arrosseguem un control de tipus "Button"

![IMG]()

Per acabar l'interficie  visual, arrosseguem  un component de tipus "TextView" de la pestanya "Text". Definirem la propietat id amb el valor "tv1" i la propietat text amb el text "Resultat".

![IMG]()

Si a la finestra "Component Tree" veiem que hi ha algun objecte que mostra una icona de color vermell, el seleccionarem i pitjarem el boto de "Infer Constraints".

Això passa per que no hem especificat les "constraints" o relacions d'ubicació entre els controls visuals. La forma mes facil d'especificar els "constraints" es prement la icona de "Infer Constraints"

Despres veurem que els constraints afegeixen una serie de fletxes entre els controls visuals que indiquen les posicions relatives dels controls respecte a altres controls i els marges de la finestra.

Els "constraints" tambe els podem posar un a un nosaltres amb el ratolí, premen els cercles que apareixen a cada objecte.

Si executem l'aplicació ara, veuras que apareix l'interficie visual correctament, pero cuan premem el botó no mostrara la suma.

Fins ara hem treballat nomes amb l'arxiu xml (activity_main.xml) on es defineixen els controls visuals de la finestra que estem crean.

Obre el fitxer MainActivity.kt

![IMG]()

La classe MainActivity hereda de la classe AppCompatActivity. La classe AppCompatActivity representa una finestra d'Android i conté tots els metodes necesaris per crear i mostrar els objectes que hem posat al fitxer xml.

El codi font de la classe MainActivity.tk es:

```Kotlin
package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```

Com a minim hem de sobrescriure el metode onCreate heredat de la classe AppCompatActivity on procedim a cridar al metode setContentView passan com a referencia un valor enmagatzemat a una constant activity_main continguda dins la classe layout que a la seva vegada conté una classe anomenada R. Mes endavant veurem que android studio s'encarrega de crear la classe R automaticament i serveix com a pont entre l'arxiu xml i la nostra classe MainActivity

## Captura d'events i acces als objectes visuals

Per poder accedir als objectes visuals definits a l'arxiu activity_main.xml (  els dos EditText, el Button i el TextView ) hi ha diferents maneres, primer utilitzarem un metode molt senzill mitjançant un metode heredat de la classe AppCompatActivity anomenat FindViewById. El programa complet per poder carregar dos valors enters i mostrar la seva suma es:

```Kotlin
package com.mdemarc.exemple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<TextView>(R.id.button)
        button.setOnClickListener{
            val et1=findViewById<EditText>(R.id.et1)
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val suma = nro1 + nro2
            tv1.text = "Resultat: ${suma.toString()}"
        }
        
    }
}
```

El primer que fem, es obtenir la referencia als 4 objectes visuals que hem posat a la vista diseny mitjançant el metode 'findViewById' indicant de quin tipus de classe son cada un

```Kotlin
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<TextView>(R.id.button)
```

Per poder capturar l'event clik d'un objecte de la classe Button hem de cridar al metode setOnClickListener i passar una Lambda que s'executarà cuan es premi el botó

```Kotlin
        button.setOnClickListener{
            val et1=findViewById<EditText>(R.id.et1)
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val suma = nro1 + nro2
            tv1.text = "Resultat: ${suma.toString()}"
        }
```

Per sumar els dos valors introduits accedirem a la propietat text de cada EditText, convertint aquestes dades a String i finalment cridan al metode toInt per convertirlo a enter.

```Kotlin
    val nro1 = et1.text.toString().toInt()
    val nro2 = et2.text.toString().toInt()
```

Despres sumarem aquests valors i els mostrarem al text TextView

```Kotlin
            val suma = nro1 + nro2
            tv1.text = "Resultat: ${suma.toString()}"
```

Ara, quan introduim les dades, al presionar el botó, pareixera el resultat al TextView:

![IMG]()

Per tal de simplificar mes el codi i que sigui mes concís, podem simplificar la part del clik del botó de la següent manera

```Kotlin
        button.setOnClickListener {
            tv1.text = "Resultat: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
        }
```