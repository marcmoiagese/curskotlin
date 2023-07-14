/**
 * Exemple de la creació de 100.000 corrutines
 */

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