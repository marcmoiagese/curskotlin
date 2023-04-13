/**
 * Introduit un valor enter per teclat, mostrar una llegenda que indigui si el número es positiu, nul o negatiu
 */

fun main(args: Array<String>) {
    println("Donam un numero: ")
    val num = readln().toInt()

    val quesoc = if( num == 0 ) "nul" else if ( num > 0 ) "positiu" else "negatiu"
    println("el numero es $quesoc")

}