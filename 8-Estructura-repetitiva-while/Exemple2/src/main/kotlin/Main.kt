/**
 * Escriu un programa que sol·liciti la introducció d'un valor positiu i que, a continuació, imprimeixi tots els números del 1 fins al valor introduït, un per un.
 */

fun main(args: Array<String>) {
    println("donam un numero positiu: ")
    val x = readln().toInt()
    var y = 1
    while( y <= x ){
        println(y)
        y++
    }
}