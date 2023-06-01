/**
 * Introdueix  per teclat un valor enter, mostra la llegenda  per pantalla que indigui si el numero es positiu, nul o negatiu
 */

fun main(args: Array<String>) {
    println("Donam un numero: ")
    val num = readln().toInt()

    when{
        num == 0 -> print("Nul")
        num > 0 -> print("Positiu")
        num < 0 -> print("Negatiu")
    }
}