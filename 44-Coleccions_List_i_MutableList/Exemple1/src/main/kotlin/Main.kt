/**
 * Crearem una llista inmutable amb els dies de la setmana. Probarem les propietats i metodes principals per administrar la llista.
 */

fun main(args: Array<String>) {

    // Per crear una llista inmutable podem cridaar a la funció listOf i passar com a parametre les dades a guardar, hem d'indicar el tipus de dades a guardar dins la llista
    var llista1: List<String> = listOf("Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge")
    println("Imprimirem la llista complerta")
    println(llista1)

    println("Imprimirem el primer element de la llista")
    println(llista1[0])

    println("Imprimirem  el primer element de la llista d'una altra manera")
    println(llista1.first())

    println("Imprimirem l'ultim element de la llista")
    println(llista1.last())

    println("Imprimir l'ultim element de la llista d'una altra manera")
    println(llista1[llista1.size-1])

    println("Imprimirem la cantitat d'elements de la llista")
    println(llista1.size)

    println("Recorrerem la llista completa amb un for")
    for (element in llista1)
        print("$element")
    println()

    println("Imprimir l'element i la seva posició")
    for (posicio in llista1.indices)
        print("[$posicio]${llista1[posicio]}")
}