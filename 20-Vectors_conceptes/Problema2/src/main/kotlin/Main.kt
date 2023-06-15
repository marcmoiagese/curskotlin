/**
 * Fes un programa que demani la carrega de dos vectors numerics enters de 4 elements. Obtindrem la suma dels dos vectors element a element. El resultat el guardarem a un tercer vector del mateix tamany.
 */

fun main(args: Array<String>) {
    val vector1 = IntArray(4)
    val vector2 = IntArray(4)
    println("Procedim a carregar el primer vector: ")
    for(i in vector1.indices) {
        print("Donam un element: ")
        vector1[i] = readln().toInt()
    }
    println("Carrega el segon vector: ")
    for(i in vector2.indices) {
        print("Donam un element: ")
        vector2[i] = readln().toInt()
    }
    val vectorSuma = IntArray(4)
    for(i in vectorSuma.indices)
        vectorSuma[i] = vector1[i] + vector2[i]
    println("vector resultant")
    for(element in vectorSuma)
        println(element)
}