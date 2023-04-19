/**
 * Realitza un programa que imprimeixi 25 numeros comptan d'11 en 11
 */

fun main(args: Array<String>) {
    var x = 11
    var control = 1
    while (control <= 25){
        println(x)
        x += 11
        control++
    }
}