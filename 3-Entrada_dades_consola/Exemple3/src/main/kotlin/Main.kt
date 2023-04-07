/**
 * En aquest exemple, S'ha de desenvolupar un programa que demani la introducció del preu d'un article i la quantitat que porta el client. Mostrar el que ha d'abonar el comprador.
 */

fun main(parametre: Array<String>) {
    print("Introdueixi el preu del producte: ")
    val preu = readln().toDouble()
    print("Introdueixi la quantitat de productes: ")
    val quantitat = readln().toInt()
    val total = preu * quantitat
    println("El total a pagar és $total")
}