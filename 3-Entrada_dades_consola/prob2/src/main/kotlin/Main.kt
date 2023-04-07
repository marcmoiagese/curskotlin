/**
 * Realitza un programa que llegeixi per teclat quatre valors numèrics enters i informi de la seva suma i promig.
 */

fun main(args: Array<String>) {
    println("Doni el primer valor: ")
    val num1 = readln().toInt()

    println("Doni el segon valor: ")
    val num2 = readln().toInt()

    println("Doni el tercer valor: ")
    val num3 = readln().toInt()

    println("Doni el quart valor: ")
    val num4 = readln().toInt()

    val suma = num1 + num2 +  num3 + num4
    println("La suma es: $suma")
    val promig = suma / 4
    println("El promig es: $promig")
}