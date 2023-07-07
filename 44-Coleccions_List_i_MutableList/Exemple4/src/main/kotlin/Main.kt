/**
 * Crearem una llista mutable de 20 elements amb valors aleatoris compresos entre 1 i 6.
 * Comptarem cuants elements te guardats el valor 1. Eliminarem els elements que guarden un 6.
 */

fun main(args: Array<String>) {
    val llista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }
    println("Llista sencera")
    println(llista)

    val cant = llista.count {it == 1}

    println("Cantitat d'elements amb el valor 1: $cant")
    llista.removeAll { it == 6 }

    println("Llista despres d'eliminar els elements amb el valor 6")
    println(llista)
}