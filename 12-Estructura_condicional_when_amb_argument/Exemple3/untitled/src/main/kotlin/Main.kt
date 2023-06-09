/**
 * Donam 10 valors enters per teclat, comptar quants d'aquets valors han estat 0, quants 1, 5 o 10
 */

fun main(args: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    for (i in 1..10){
        print("Donam un enter: ")
        val valor = readln().toInt()
        when(valor){
            0 -> cant1++
            1, 5, 10 -> cant2++
        }
    }

    println("La cuantitat de 0 ingressats ha estat: $cant1")
    println("La cuantitat de numeros 1, 5 o 10 donats ha estat: $cant2")


}