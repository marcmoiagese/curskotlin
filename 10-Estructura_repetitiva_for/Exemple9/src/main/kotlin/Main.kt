/**
 * Fes un programa que permeti introduir un valor del 1 al 10 i ens ensenyi la taula de multiplicar del mateix numero
 */

fun main(args: Array<String>) {
    println("Quina taula vols? ")
    val taula = readln().toInt()

    for(i in taula..taula*12 step taula)
        println("$i")
}