/**
 * Fes una funció que enviarem com a parametre el valor del costat d'un cuadrat i ens retorni la seva superficie.
 */

fun retornamLaSuperficie(costat: Int): Int{
    val sup = costat * costat
    return sup
}

fun main(args: Array<String>) {
    print("Donam el costat del cuadrat: ")
    val costat = readln().toInt()

    val superficie = retornamLaSuperficie(costat)
    println("La superficie del cuadrat es: $superficie")
}