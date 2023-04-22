/**
 * Escriu un programa que llegeixi N numeros enters i calculi la cantitat de valors parells ingresats
 *
 * En aquets casos tambe podem disposar del bucle for, ja que quan expresem el rang, podem utilitzar una variable
 */
fun main(args: Array<String>) {
    var cant = 0

    print("Cuants valors em donaras? ")
    val cantitat = readln().toInt()

    for (i in 1..cantitat){
        println("Donam un valor: ")
        val valor = readln().toInt()
        if(valor % 2 ==0)
            cant++
    }
    println("Cantitat parells: $cant")
}