/**
 * Es realitza la carrega de 10 valors enters per teclat. es vol coneixer
 * - La cantitat de valors introduits negatius.
 * - La cantitat de valors introduits positius.
 * - La cantitat de multiples de 15.
 * - El valor acumulat dels numeros introduits que siguin parells.
 */

fun main(args: Array<String>) {
    var negatius = 0
    var positius = 0
    var multiple15 = 0
    var sumaparells = 0

    for (i in  1..10){
        println("Donam un valor: ")
        val valor = readln().toInt()
        if(valor<0)
            negatius++
        else
            if(valor > 0)
                positius++
        if(valor % 15 == 0)
            multiple15++
        if(valor % 2 == 0)
            sumaparells+=valor
    }

    println("La cantitat de valors negatius: $negatius")
    println("La cantitat de valors positius: $positius")
    println("La cantitat de valors multiples de 15: $multiple15")
    println("La suma dels valors parells es: $sumaparells")
}