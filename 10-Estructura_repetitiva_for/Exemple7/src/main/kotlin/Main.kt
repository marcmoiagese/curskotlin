/**
 * Realitza un programa que demani 10 numeros i imprimeixi la suma dels ultims 5 valors ingressats
 */

fun main(args: Array<String>) {
    var suma = 0
    for(i in 1..10){
        println("Donam un valor: ")
        val numero = readln().toInt()

        if( i > 5 )
            suma += numero
    }
    println("La suma dels 5 ultims valors es $suma")
}