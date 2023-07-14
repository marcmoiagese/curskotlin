/**
 * Refactorització de funcions
 */

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    launch {
        esperat()
    }
    println("Inician")
}

suspend fun esperat() {
    delay(1000)
    println("Ha passat un segon")
}