/**
 * Crea un vector de tipo FloatArray de 10 elements, carregar els seus elements per teclat
 * Imprimir la cantitat de valors introduits que siguin inferiors a 50
 * Imprimir un missatge si tots els valors son inferiors a 50
 */

fun main(args: Array<String>) {
    var vector = FloatArray(10) { readln().toFloat()}

    val cant = vector.count { it < 50 }
    println("La cantitat de valors introduits menors a 50: $cant")

    if(vector.all {it > 50})
        println("No tots els valors son menors a 50")
}