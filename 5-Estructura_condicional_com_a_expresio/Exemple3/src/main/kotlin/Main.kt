/**
 * Carrega un enter per teclat compres entre 1 i 99. Enmagatzema a una altra variable la cantitat de digits que te el valor introduit per teclat. Ensenya per pantalla el numero
 * de digits del numero introduit.
 */

fun main(args: Array<String>) {
    println("Donam un numero: ")
    val numero = readln().toInt()

    val digits = if( numero < 10) 1 else 2
    println("El numero introduit te $digits digits")

}