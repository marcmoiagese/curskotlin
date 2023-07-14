import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    GlobalScope.launch {
        for(x in 1..10) {
            print("$x ")
            delay(1000)
        }
    }
    GlobalScope.launch {
        for(x in 11..20) {
            print("$x ")
            delay(1000)
        }
    }
    readLine()
}