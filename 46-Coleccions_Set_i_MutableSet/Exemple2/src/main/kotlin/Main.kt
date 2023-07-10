/**
 * Crearem un conjunt inmutable que guardi els festius d'enguany. Després, introduirem per teclat una data i verificarem si es festiu o no.
 */

data class Jorn(val dia: Int, val mes: Int, val any: Int)

fun main(args: Array<String>) {
    var festius: Set<Jorn> = setOf(Jorn(23,6,2023),
                                   Jorn(24, 6, 2023),
                                   Jorn(11, 12, 2023))

    println("Donam una data")
    print("Donam el dia: ")
    val dia = readln().toInt()

    print("De quin mes?: ")
    val mes = readln().toInt()

    print("De quin any?: ")
    val any = readln().toInt()

    if(Jorn(dia, mes, any) in festius)
        println("La data introduida es un festiu")
    else
        println("La data introduida no es un festiu")
}