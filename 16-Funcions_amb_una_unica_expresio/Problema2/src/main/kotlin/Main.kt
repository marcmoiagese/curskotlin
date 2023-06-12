/**
 * Fes una funció que ens retorni el perímetre d'un quadrat enviant-li el costat.
 */

fun calculPerimetre(costat: Int) = costat * 4

fun main(args: Array<String>) {
    println("Donam el costat: ")
    val costat = readln().toInt()

    println("El perimetre es: ${calculPerimetre(costat)}")
}