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