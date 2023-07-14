# 48-Corrutines

La programació asincrona o sense bloqueig a kotlin es possible mitjançant una tecnologia anomenada Corrutines que ve implementada una part dins el porpi llenguatge Kotlin i una altra gran part mitjançant biblioteques de  funcions.

Aquesta metodologia es molt útil cuan tenim que treballar amb algoritmes que requereixen molts recursos, consultes a servidors d'internet, consultes a bases de dades, descarrega d'arxius grans, etc. Amb l'objectiu de no bloquejar el fil principal de la nostra aplicació  i que l'usuari es vegi impedit de interactuar amb el programa fins que acabi d'executar l'algoritme.

A més a més d'impedir que l'aplicació es bloquegi fins que s'acabi el procés també son indispensables per implementar aplicacions escalables. Podem tenir programes molt mes escalables executan diferents rutines de manera simultanea a diferents processadors.

Cuan volem treballar amb corutines a Kotlin hem d'importar la biblioteca kotlinx.corutines, podem visitar el lloc web on es publiquen les [ultimes actualitzacions](https://github.com/Kotlin/kotlinx.coroutines).

Per poder treballar amb corrutines, amb Kotlin nesecitem importar la llibreria que ens permet treballar amb elles, Amb IntelliJ IDEA tenim diverses maneres. Cuan creem un projecte nou una de les opcions que podem escollir es el "Build system" tenim tres opcions, anem a veure com fer-ho amb les tres.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/buildsystem.PNG)

## Build System: IntelliJ

Importarem la biblioteca per treballar amb corutines amb un projecte Kotlin.

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

A la finestra que sen's obrirà li posem la versió mes recent per importar la pots consultar [aqui](https://github.com/Kotlin/kotlinx.coroutines), ara utilitzarem aquesta:

```kotlin
org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2
```

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/6.PNG)

Ens mostrarà una llista amb el contingut que importarà, simplement li donem a OK i després Apply i ok novament.

Això ens descarregara el que nesecita, i ja podem comensar a treballar amb corrutines.

## Build System: Maven

Des de l'entorn IntelliJ IDEA crearem un nou projecte escollint Maven com a build system. un cop carregat obrirem el fitxer pom.xml

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/mav1.PNG)

I anirem a la part de les dependecies afegint dins del bloc <dependencies></dependencies> la crida a la llibreria

```xml
<dependency>
   <groupId>org.jetbrains.kotlinx</groupId>
   <artifactId>kotlinx-coroutines-core</artifactId>
   <version>1.7.2</version>
</dependency>
```

Un cop introduit això ens apareixera (normalment a la part superior dreta) aquesta finestreta, si li donem al botó es descarregara les dependencies

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/mav2.PNG)

Si no surt, a la barra lateral dreta prem sobre Maven, i despres sobre el boto sincronitzar.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/mav3.PNG)![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/mav4.PNG)

Això ens descarregara el que nesecita, i ja podem comensar a treballar amb corrutines.

## Build System: Gradle ( No funciona amb Java 20 )

Crearem un nou projecte escollin gradle com a build system i obrirem el fitxer build.gradle.kts i dins de dependencies afegirem la seguent linea

```kotlin
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
```

I, de la mateixa manera que hem fet amb Maven, premem al boto on posa Gradle de la barra dreta i despres al boto sincronitzar.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/gradle1.PNG)![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/gradle2.PNG)

Això ens descarregara el que nesecita, i ja podem comensar a treballar amb corrutines.


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/Exemple1/src/main/kotlin/Main.kt)

Implementarem una aplicació minima que ens mostri numeros del 1 al 10 ensenyan d'un a un cada 1 segon. I ho farem a través d'una corrutina.

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
Si executem aquest codi, podem observar per pantalla el següent resultat

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/48-Corrutines/img/7.gif)

El primer que veiem per pantalla es el missatge que crida a println:

```kotlin
println("Bloquegem el fil principal del programa al executar readline")
```

A continuació bloquegem el fil principal del nostre programa cridan la funció readLine, si el programa finalitza, totes les corrutines que s'han iniciat finalitzaran de manera automatica.

```kotlin
readLine()
```
Després podém comprobar que per pantalla comencen a apareixer els numeros del 1 al 10 d'un en un, lentament degut a la crida de la funció delay.

La creació de la corrutina s'aconcegueix cridan la funció "launch" envian-li una funció lambda amb l'algoritme que volem executar de forma paralela al fil principal del nostre programa.

```kotlin
    GlobalScope.launch {
        for(x in 1..10) {
            print("$x -")
            delay(1000)
        }
    }
```

## [Exemple 2]()

En aquest exemple, veurem com executem 2 corrutines, a la primera ensenyarem els numeros del 1 al 10 i a la segona els numeros del 11 al 20. Crearem un nou projecte i afegirem la biblioteca que ens permet treballar amb corrutines tal i com hem vist abans.
