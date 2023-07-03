/**
 * Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter.
 * Sobrecarregarem l'operador += A la main, definirem una serie d'objectes de la classe i utilitzarem l'operador +=
 */

class Vector{
    val vector = IntArray(5, {it})

    fun imprimir() {
        for (element in vector)
            print("$element ")
    }

    operator fun plusAssign(vec2: Vector) {
        for(i in vector.indices)
            vector[i] += vec2.vector[i]
    }
}

fun main(args: Array<String>) {
    val vec1 = Vector()
    vec1.imprimir()

    val vec2 = Vector()
    vec2.imprimir()

    vec1 += vec2

    vec1.imprimir()
}