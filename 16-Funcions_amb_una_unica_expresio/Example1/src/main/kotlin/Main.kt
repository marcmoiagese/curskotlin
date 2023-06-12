/**
 * Fes una funció que li enviem com a parametre el valor del costat d'un cuadrat i ens retorni la superficie
 */

fun retornSuperficie(costat: Int) =  costat * costat

fun main(args: Array<String>) {
    print("Donam el valor del costat del cuadrat: ")
    val costat = readln().toInt()
    println("La superficie del cuadrat es ${retornSuperficie(costat)}")
}