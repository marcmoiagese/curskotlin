# Control ImageButton

Fins ara hem vist la creacio d'objectes de la classe Button, ara veurem una altra classe molt semblant a l'anterior, anomenada ImageButton que te la mateixa filosofia de gestió amb la diferència que  pot ensenyar una imatge damunt seu.

Posarem un objecte de la classe ImageButton que ensenya una imatge de un telefon. cuan es prem ensenyara dins un control TextView el missatge "Trucan..". La imatge la pots descarregar [d'aqui](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/8-Control_ImageButton/img/pngegg.png) es importan que el nom no contingui caracters especials ni contingui majuscules, després veurem que es genera un nom de variable utilitzan aquest nom. Ara copiem l'arxiu a la carpeta de recursos del nostre projecte "Projecte/app/src/main/res/mipmap-mdpi

Cuan hem copiat la imatge ho hem fet dins de mipmap-mdpi pero com has pogut veure hi ha carpetes amb noms semblants:

```text
mipmap-mdpi
mipmap-hdpi
mipmap-xhdpi
mipmap-xxhdpi
mipmap-xxxhdpi
mipmap-anydpi-v26
```

L'objectiu d'aquestes es guardar imatges també, pero en resolucions mes grans. Això es fa si volem que la nostra aplicació sigui mes flexible si s'executa en un telèfon, tauleta o televisor.

Hem de tenir en compte aquests tamanys
 - A la carpeta "res/mipmap-mdpi/" guardariam la imatge amb el tamany original
 - A la carpeta "res/mipmap-hdpi/" guardariam la imatge amb el tamaby del 150% respecte a la de la carpeta mipmap-mdpi
 - A la carpeta "res/mipmap-xhdpi/" guardariam la imatge amb el tamaby del 200% respecte a la de la carpeta mipmap-mdpi
 - A la carpeta "res/mipmap-xxhdpi/" guardariam la imatge amb el tamaby del 300% respecte a la de la carpeta mipmap-mdpi
 - A la carpeta "res/mipmap-xxxhdpi/" guardariam la imatge amb el tamaby del 400% respecte a la de la carpeta mipmap-mdpi

A la finestra "Project" cambiem a la vista "Project Files" i naveguem fins la carpeta on copiarem l'arxiu, tindries de poder verue la foto.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/8-Control_ImageButton/img/1.PNG)

Ara afegirem l'objecte de la classe ImageButton a la finestra de la nostra aplicació La classe ImageButton es troba a la pestanya "Buttons"

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/8-Control_ImageButton/img/2.PNG)

Despres de posar l'objecte s'obrirà un dialeg on hem de seleccionar l'imatge a mostrar

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/8-Control_ImageButton/img/3.PNG)

Al tancar el dialeg es carregara la propietat "srcCompact" la referencia a la imatge. Es pot cambiar la imatge modifican aquesta propietat.

Inicialitzem la propietat Id amb el nom boto1:

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/Kotlin_per_Android/8-Control_ImageButton/img/4.PNG)

Afegim un TextView a la nostra aplicació i configurem les seves propietats Id = tv1 i text L'interficie visual quedara semblant a:

```Kotlin
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
```

Definirem l'expresió lambda que s'executara al premer el botó

```Kotlin
    boto1.setOnClickListener {
        tv1.text="Trucan..."
    }
```
