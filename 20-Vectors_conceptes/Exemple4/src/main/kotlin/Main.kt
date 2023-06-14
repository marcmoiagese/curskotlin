/**
 * Carrega un vector de 10 elements de tipus enter. Imprimeix despres el primer i l'ultim element.
 */

fun main(args: Array<String>) {
    val vector = IntArray(10)
    for (i in vector.indices){
        print("Introdueix un numero: ")
        vector[i] = readln().toInt()
    }
    println("El primer element del vector es: ${vector[0]}")
    println("L'ultim element del vector es: ${vector[vector.lastIndex]}")
}