/**
 * Crearem un conjunt mutable (MutableSet) amb una serie de valors Int. Probarem les propietats i metodes principals per administrar un conjunt.
 */


fun main(args: Array<String>) {
    val conjunt1: MutableSet<Int> = mutableSetOf(2, 7, 20, 150, 3)

    println("Llista completa del conjunt")
    for(element in conjunt1)
        print("$element ")
    println()

    println("Cantitat d'elements del conjunt: ${conjunt1.size}")
    conjunt1.add(500)

    println("Llista completa del conjunt despres d'afegir el 500")
    for(element in conjunt1)
        print("$element ")
    println()

    conjunt1.add(500)
    println("Llista sencera despres de tornar a afegir el 500")
    for (element in conjunt1)
        print("$element ")
    println()
    if (500 in conjunt1)
        println("El 500 esta guardat dins el conjunt")
    else
        println("El 500 no esta guardat dins el conjunt")

    println("Eliminem el 500 del conjunt")
    conjunt1.remove(500)
    if (500 in conjunt1)
        println("El 500 esta guardat dins el conjunt")
    else
        println("El 500 no esta guardat dins el conjunt")

    val cant = conjunt1.count { it >= 10 }
    println("Cantitat d'elements amb valors superiors o iguals a 10: $cant")
}