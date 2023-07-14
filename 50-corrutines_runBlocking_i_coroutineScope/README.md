# 50- Corrutines: runBlocking i coroutineScope

A més a més de l'abast de la corrutina proporcionat per diversos constructors, es possible declarar el seu propi abast utilitzan el constructor coroutineScope. Crea un enllaç de corrutina i no es completa fins que es completen tots els elements secundaris iniciats.

Els constructors de corrutines runBlocking i coroutineScope poden semblar iguals, perque els dos esperen que el seu codi i tots els seus elements secundaris s'acabin. La principal diferència es que el mètode runBlocking bloqueja el fil actual per esperar, mentre que coroutineScope simplement suspen, lliveran el fil deixan-lo disponible per altres usos. Per aquesta diferencia, runBlocking es una funció regular i coroutineScope es una funció de suspensio.

Es pot utilitzar un constructor coroutineScope dins de cualsevol funció de suspenció per realitzar multiples operacions simultanies.

```kotlin
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    Tasques(1)
    Tasques(2)
    println("Fi de totes les tasques")
}

suspend fun Tasques(num:Int) = coroutineScope {
    launch {
        delay(1000)
        println("Tasca $num part A")
    }
    launch {
        delay(2000)
        println("Tasca $num part B")
    }
    println("Esperan acabar les dues tasques $num")
}
```
