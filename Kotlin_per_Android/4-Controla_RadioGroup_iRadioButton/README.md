# 4 -  Controls RadioGroup i RadioButton

L'objectiu d'aquest tema es practicar la implementació d'un programa que requereixi controls de tipus RadioButton per seleccionar una activitat. Apendrem com agrupar un conjunt de RadioButton i validar quin esta seleccionat.

En aquest exemple carregarem dos numeros dins de controls de tipus EditText. Imprimirem missatges que solicitin la carrega dels valors dins dels mateixos EditText. També posarem dos controls de tipus RadioButton per seleccionar si volem sumar o restar els valors introduits. Posarem un botó que sera el l'encarregat d'executar l'operacio desitjada un cop es premi. El resultat l'imprimirem dins un TextView.

El problema es semblant a l'anterior. Posarem  dos  controls EditText (Number) i configurarem les seves propietats id i hint. Per posar els controls de tipus RadioButton, primer hem  de posar un control de tipus RadioGroup. El trobaras a la paleta de components de la pestanya Buttons

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/4-Controla_RadioGroup_iRadioButton/img/1.PNG)

Despres de posar el control RadioGroup  ajustarem el tamany amb el ratolí. Tambe definirem el seu id amb el valor grup1.

Ara arrossegarem dos controls de la classe RadioButton de la pestanya "Buttons" dins del RadioGroup

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/4-Controla_RadioGroup_iRadioButton/img/2.PNG)

Aquest problema requereix dos controls de tipus RadioButton.

torna a seleccionar el control RadioGroup i cambia  la  propietat layout_height amb el valor  wrap_parent. Això fara que el control RadioGroup nomes ocupi l'espai dels dos controls RadioButton.

Ara als dos controls de tipus RadioButton definirem els seus id. Els anomenarem r1 i r2 respectivament. Cambiarem les seves propietats text pels textos "sumar" i "restar".

Els controls EditText els i posarem els id et1 i et2 com vam fer al exemple anterior.

Finalment afegirem el botó i un TextView per mostrar el resultat. Inicialitzarem les propietats del botó amb els valors

```text
  id : button
  text : operar
```

I el TextView amb els valors:

```text
  id : tv1
  text : resultat
```

A la finestra "Component Tree" el id definit per cada control (et1, et2, grup1, r1, r2, tv1)

També podem observar de quina classe és cada control visual i el text de la propietat text per a aquells controls als quals té sentit la seva inicialització.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/4-Controla_RadioGroup_iRadioButton/img/3.PNG)

Hem de resoldre el problema dels Constraints, si algun dels components de la finestra no te la seva ubicacio, premen el  botó "Infer Constraints" del control respectiu, o l'enllacem amb el ratolí.

El codi fon de la clase  MainActivity.kt es:

```Kotlin
    package com.mdemarc.exemple1

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.RadioButton
    import android.widget.TextView

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val et1=findViewById<EditText>(R.id.et1)
            val et2=findViewById<EditText>(R.id.et2)
            val r1=findViewById<RadioButton>(R.id.r1)
            val r2=findViewById<RadioButton>(R.id.r2)
            val tv1=findViewById<TextView>(R.id.tv1)
            val button=findViewById<Button>(R.id.button)
            button.setOnClickListener {
                if (r1.isChecked)
                    tv1.text = "Resultat: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
                if (r2.isChecked)
                    tv1.text = "Resultat: ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
            }
        }
    }
```

El primer que fem es obtenir la referencia a tots els objectes visuals mitjançant la crida al mètode 'findViewById'

```txt
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val r1=findViewById<RadioButton>(R.id.r1)
        val r2=findViewById<RadioButton>(R.id.r2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
```

Li passem una lambda al mètode setOnClickListener del botó, on verificarem quin dels dos RadioButton esta seleccionat

```txt
        button.setOnClickListener {
            if (r1.isChecked)
                tv1.text = "Resultat: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
            if (r2.isChecked)
                tv1.text = "Resultat: ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
        }
```

El metode isChecked retorna true si esta seleccionat el RadioButton