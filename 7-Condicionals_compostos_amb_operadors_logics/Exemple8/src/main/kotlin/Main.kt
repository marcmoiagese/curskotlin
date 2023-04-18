/**
 * Escriu un programa que, donada una llista de tres valors enters introduïts per teclat, guardi en unes altres 2 variables el valor més petit i el més gran d'aquesta llista.
 * Utilitza com a expressió per obtenir el més gran i el més petit.
 */

fun main(args: Array<String>) {
    println("donam un numero: ")
    val num1 = readln().toInt()
    println("donam un numero: ")
    val num2 = readln().toInt()
    println("donam un numero: ")
    val num3 = readln().toInt()

    val petit = if (num1 < num2 && num1 < num3 ) num1 else if ( num2 < num3 && num2 < num1 ) num2 else num3
    val gran = if (num1 > num2 && num1 > num3 ) num1 else if ( num2 > num3 && num2 > num1 ) num2 else num3
}