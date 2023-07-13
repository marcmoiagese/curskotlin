# 48-Corrutines

La programació asincrona o sense bloqueig a kotlin es possible mitjançant una tecnologia anomenada Corrutines que ve implementada una part dins el porpi llenguatge Kotlin i una altra gran part mitjançant biblioteques de  funcions.

Aquesta metodologia es molt útil cuan tenim que treballar amb algoritmes que requereixen molts recursos, consultes a servidors d'internet, consultes a bases de dades, descarrega d'arxius grans, etc. Amb l'objectiu de no bloquejar el fil principal de la nostra aplicació  i que l'usuari es vegi impedit de interactuar amb el programa fins que acabi d'executar l'algoritme.

A més a més d'impedir que l'aplicació es bloquegi fins que s'acabi el procés també son indispensables per implementar aplicacions escalables. Podem tenir programes molt mes escalables executan diferents rutines de manera simultanea a diferents processadors.

Cuan volem treballar amb corutines a Kotlin hem d'importar la biblioteca kotlinx.corutines, podem visitar el lloc web on es publiquen les [ultimes actualitzacions](https://github.com/Kotlin/kotlinx.coroutines).

## [Exemple 1]()

Importarem la biblioteca per treballar amb corutines amb un projecte Kotlin. Implementarem una aplicació minima que ens mostri numeros del 1 al 10 ensenyan d'un a un cada 1 segon. I ho farem a través d'una corrutina.

Des de l'entorn IntelliJ IDEA crearem un nou projecte, i un cop dins a dal a la dreta prem sobre l'icona del engranatge

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/1.PNG)

Despres prem dins de "Project Structure"

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/2.PNG)

A la nova finestra que s'obrirà, prem sobre "Modules"

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/3.PNG)

I afegirem un nou premen sobre el botó amb el signe +

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/4.PNG)

Escollirem "Library > From Maven.."

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/5.PNG)

A la finestra que sen's obrirà li posem la versió mes recent per importar la pots consultar aqui, ara utilitzarem aquesta:

```kotlin
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
```

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/6.PNG)

Ens mostrarà una llista amb el contingut que importarà, simplement li donem a OK i després Apply i ok novament.

Ara ja podem comensar a escriure el codi dins el Main.kt

```kotlin
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    GlobalScope.launch {
        for(x in 1..10) {
            print("$x -")
            delay(1000)
        }
    }
    println("Bloquegem el fil principal del programa al executar readline")
    readline()
}
```

 
