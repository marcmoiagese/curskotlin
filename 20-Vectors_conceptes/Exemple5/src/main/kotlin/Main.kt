/**
 * Carrega un vector de 5 elements de tipus enter. imprimeix despres tot
 */

fun main(args: Array<String>) {
    val vector = IntArray(10)
    for ( i in vector.indices){
        print("Donam un valor: ")
        vector[i] = readln().toInt()
    }

    for(element in vector)
        println(vector)
}