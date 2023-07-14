# 49- Corrutines: launch i runBlocking

Una corrutina es conceptualment similar a un fil (thread) que s'implementen en altres llenguatges, tambe podem incloure-hi Kotlin ja que podem accedir a la classe thread de Java. Les corrutines es poden considerar com a subprovessos lleugers.

Als exemples anteriors hem vist que si el fil principal del nostre programa finalitza després totes les corrutines en execusió també finalitzaran. ara veurem que mitjançant la crida a la funció runBlocking podem bloquejar el nostre fil principal de l'aplicació fins que totes les corrutines finalitzin.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/49-Corrutines_launch_i_runBlocking/Exemple1/src/main/kotlin/Main.kt)

Crearem un projecte i afegirem les dependencies de la biblioteca de corrutines. i implementarem el següent codi:

```kotlin
mport kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    launch {
        delay(1000)
        println("Ha passat un segon")
    }
    println("Inician")
}
```

Cuan executem el codi, obtenim el següent resultat:


![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/49-Corrutines_launch_i_runBlocking/img/ex1.gif)

**runBlocking** també es un constructor de corrutines que uneix el mon que no es de corrutines d'una funcio regular fun main() i el codi amb corrutines dins de runBlocking.

Fins que no finalitzen totalment totes les corrutines que tenen dins de runBlocking ( una en aquest exemple que hem posat ), no finalitza la funció main.

**launch** es un constructor de corrutines. Executa una corrutina nova al mateix temps que la resta de codi, que continua funcionan de manera independent. Per això apareix primer "inician" i despres de un segon ensenya "Ha passat un segon".

El nom de runBlocking significa que el fil que l'executa (en aquest cas, el fil principal del nostre programa) es bloqueja durant la duració de la crida, fins que totes les corrutines internes de runBlocking { ... } completin la seva execusió.

## Refactorització de funcions

Cuan volem moure un algoritme que conté una corrutina a una altra funció, a la mateixa se li te d'afegir el modificador "suspend". Vegem els cambis que es tindria que fer al exemple anterior

```kotlin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    launch {
        espera()
    }
    println("Inician")
}

suspend fun espera() {
    delay(1000)
    println("Ha passat un segon")
}
```

Les funcions de suspencio es poden utilitzar dins de les corrutines al igual que les funcions normals, pero a més a més poden utilitzar altres funcions de suspencio a la vegada, per a superar l'execusió d'una corrutina.

## Les corrutines son livianes

A diferència dels fils (threads), les corrutines requereixen molt pocs recursos per a la seva creació i manteniment durant la seva execusió. podem probar de crear 100.000 corrutines amb el següent codi.

```kotlin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    for(x in 1..100000)
        launch {
            delay(1000)
            print(".")
        }
}
```
Si executem el codi, veurem que no hi ha problemes de rendiment a la maquina, si en canvi intentem la mateixa operació utilitzan threads l'aplicació generara un error.

## Gestor que retorna launch

```kotlin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val corrutina1=launch {
        delay(1000)
        println("Ha passat un segon")
    }
    corrutina1.join()
    val corrutina2=launch {
        delay(1000)
        println("Ha passat un altre segon")
    }
    corrutina2.join()
    println("S'ha acabat")
}
```
La funció launch retorna un objecte de tipus Job que es un identificador de la corrutina iniciada i es pot fer servir per esperar explícitament a que s'acabi. Aquesta acció se la coneix com cridar al metode join.

