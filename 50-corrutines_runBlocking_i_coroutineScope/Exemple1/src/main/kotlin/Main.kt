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