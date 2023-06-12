/**
 * Fes una funció que rebi un enter comprès entre 1 i 5 i ens indiqui el nom del número en català, o doni error si és superior.
 */

fun convertirCatala(valor: Int) = when (valor) {
    1 -> "un"
    2 -> "dos"
    3 -> "tres"
    4 -> "quatre"
    5 -> "Cinc"
    else -> "error"
}

fun main(args: Array<String>) {
    for (i in 1..6)
        println(convertirCatala(i))
}