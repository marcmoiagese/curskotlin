/**
 * Es demanen tres notes d'un alumne, si la seva mitjana és igual o superior a 7, es mostrarà un missatge indicant que ha aprovat.
 */

fun main(args: Array<String>) {
    println("Donam la nota 1: ")
    val nota1 = readln().toDouble()
    println("Donam la segona nota: ")
    val nota2 = readln().toDouble()
    println("Donam la tercera nota: ")
    val nota3 = readln().toDouble()

    val mitja = (nota1 + nota2 + nota3) / 3

    if (mitja > 7)
        println("Aprovat!")

}