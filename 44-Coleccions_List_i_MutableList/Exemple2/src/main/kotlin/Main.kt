/**
 * Ara veurem com crear una llista inmutable pero utilitzarem la funció List a la cual li enviarem el tamany de la llista i una funció lambda indican quins valors guardar.
 */

fun  carregar(): Int {
    print("Donam un numero: ")
    val valor = readln().toInt()
    return valor
}

fun main(args: Array<String>) {
    var llista: List<Int> = List(5, {carregar()})
    println(llista)
}