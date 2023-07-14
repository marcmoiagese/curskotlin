# 51- Corrutines: funcions de suspenció (suspend fun)

Una funcio de suspencio nomes pot ser cridada des d'una corrutina o des d'una altra funció de suspenció.

Les funcions de suspenció cridades des d'una corrutina s'executen de forma secuencial per defecte, per exemple probel el següent codi que crida a dos funcions de suspenció:

```kotlin
import kotlinx.coroutines.*

fun main(args: Array<String>)  = runBlocking {
    val d1=dada1()
    println("Fi de la primera funcio de suspencio")

    val d2=dada2()
    println("Fi de la segona funcio de suspencio")

    print(d1+d2)
}

suspend fun dada1():Int{
    delay(3000)
    return 3
}

suspend fun dada2():Int{
    delay(3000)
    return 3
}
```

Cuan executem l'aplicació, despres de 4 segons de la seva execusió podem veure que ha acabat la funcio de suspensio "dada1" i es troba executan la funcio de suspenció "dada2".

![IMG]()

En moltes situacions les crides secuencials de les funcions de suspencio son la solucio correcta, per exemple solicitem a un servidor  una dada i a partir d'aquesta dada fem la peticio a un altre servidor a partir de la dada recuperada del primer servidor.


