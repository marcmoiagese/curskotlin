/**
 * Escriu un programa en el qual s'ingressin quatre números enters, calcula i informa la suma dels dos primers i el producte del tercer i quart.
 */

fun main(args: Array<String>) {
    println("Introdueix el primer número: ")
    val num1 = readln().toInt()

    println("Introdueix el segon número: ")
    val num2 = readln().toInt()

    println("Introdueix el tercer número: ")
    val num3 = readln().toInt()

    println("Introdueix el quart número: ")
    val num4 = readln().toInt()

    val suma = num1 + num2
    println("La suma es $suma")

    val producte = num3 * num4
    println("El producte es $producte")

}