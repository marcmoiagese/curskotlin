/**
 * Crearem una llista mutable de 20 elements amb valors aleatoris compresos entre 1 i 6.
 * Comptarem cuants elements te guardats el valor 1. Eliminarem els elements que guarden un 6.
 */

fun main(args: Array<String>) {

    // Creem una llista mutable de 20 elements i l'omplim amb valors aleatoris entre 1 i 6
    val llista: MutableList<Int> = MutableList(20) { ((Math.random() * 6) + 1).toInt() }
    println("Llista sencera")
    println(llista)

    // Comptem la cantitat d'elements que guarden un 1 amb count i la funció lambda
    val cant = llista.count {it == 1}

    println("Cantitat d'elements amb el valor 1: $cant")
    // Eliminem tots els valors de la llista que tinguin un 6
    llista.removeAll { it == 6 }

    println("Llista despres d'eliminar els elements amb el valor 6")
    println(llista)
}