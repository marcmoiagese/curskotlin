/**
 * Fes un programa que permeti ingressar el costat d'un quadrat. Després, pregunta si vol calcular i imprimir el seu perímetre o la seva superfície.
 */

fun ImprimeixPerimetre(costat: Int){
    val perimetre = costat * 4
    println("El perimetre es: $perimetre")
}

fun EnsenyarSuperficie(costat: Int){
    val superficie = costat * costat
    println("La superfície es: $superficie")
}

fun main(args: Array<String>) {
    print("Donam el costat del cuadrat: ")
    val costat = readln().toInt()

    print("Vols Calcular el perimetre o la superficie? [Escriu text: perimetre/superficie: ")
    var resposta = readln()
    when(resposta){
        "perimetre" -> ImprimeixPerimetre(costat)
        "superficie" -> EnsenyarSuperficie(costat)
    }
}