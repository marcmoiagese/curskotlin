/**
 * Carregam la cantitat de fills que tenen 10 families. Compta quants tenen 0, 1, 2 o mes fills. Imprimeix els resultats
 */


fun main(args: Array<String>) {
    var tenen0 = 0
    var tenen1 = 0
    var tenen2 = 0
    var tenenmes = 0

    for (i in 1..10){
        print("Quants fills tenen la familia $i: ")
        val valor = readln().toInt()
        when (valor){
            0 -> tenen0++
            1 -> tenen1++
            2 -> tenen2++
            else -> tenenmes++
        }

    }
    println("Hi ha $tenen0 families amb 0 fills")
    println("Hi ha $tenen1 families amb 1 fills")
    println("Hi ha $tenen2 families amb 2 fills")
    println("Hi ha $tenenmes families amb mes fills")
}