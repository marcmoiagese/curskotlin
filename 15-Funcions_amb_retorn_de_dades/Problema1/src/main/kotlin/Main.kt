/**
 * Fes una funció que rebi tres enters i ens retorni la mitjana.
 */

fun mitjana(v1: Int, v2: Int, v3: Int ): Int {
    val mitjana = (v1+v2+v3)/3
    return mitjana
}

fun main(args: Array<String>) {
    println("donam el valor numero 1: ")
    var val1 = readln().toInt()

    println("donam el valor numero 2: ")
    var val2 = readln().toInt()

    println("donam el valor numero 2: ")
    var val3 = readln().toInt()

    println("La mitjana dels tres valors es: ${mitjana(val1, val2, val3)}")
}