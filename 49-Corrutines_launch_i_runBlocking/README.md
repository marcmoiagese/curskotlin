# 49- Corrutines: launch i runBlocking

Una corrutina es conceptualment similar a un fil (thread) que s'implementen en altres llenguatges, tambe podem incloure-hi Kotlin ja que podem accedir a la classe thread de Java. Les corrutines es poden considerar com a subprovessos lleugers.

Als exemples anteriors hem vist que si el fil principal del nostre programa finalitza després totes les corrutines en execusió també finalitzaran. ara veurem que mitjançant la crida a la funció runBlocking podem bloquejar el nostre fil principal de l'aplicació fins que totes les corrutines finalitzin.

## [Exemple 1]()

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
