/**
 * Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter i carregui valors aleatoris entre 1 i 10.
 * Sobrecarregarem els operadors +, -, * i / A la main definirem una serie d'objectes de la classe Vector i operarem amb ells.
 */

class Vector {
    val vector = IntArray(5)

    fun carregar(){
        for (i in vector.indices)
            vector[i] = (Math.random() * 11 + 1 ).toInt()
    }

    fun imprimir(){
        for (element in vector)
            print("$element")
        println()
    }

    operator fun plus(vector2: Vector): Vector {
        var suma = Vector()
        for(i in vector.indices)
            suma.vector[i] = vector[i] + vector2.vector[i]
        return suma
    }

    operator fun minus(vector2: Vector): Vector {
        var resta = Vector()
        for(i in vector.indices)
            resta.vector[i] = vector[i] - vector2.vector[i]
        return resta
    }

    operator fun times(vector2: Vector): Vector {
        var producte = Vector()
        for(i in vector.indices)
            producte.vector[i] = vector[i] *  vector2.vector[i]
        return producte
    }

    operator fun div(vector2: Vector): Vector{
        var divisio = Vector()
        for(i in vector.indices)
            divisio.vector[i] = vector[i] / vector2.vector[i]
        return divisio
    }
}

fun main(args: Array<String>) {
    val vec1 = Vector()
    vec1.carregar()

    val vec2 = Vector()
    vec2.carregar()

    vec1.imprimir()
    vec2.imprimir()

    val vecSuma = vec1 + vec2
    println("Suma component a component dels dos vectors")
    vecSuma.imprimir()

    val vecResta = vec1 - vec2
    println("La resta component a component dels dos vectors")
    vecResta.imprimir()

    val vecProducte = vec1 * vec2
    println("El producte component a component dels dos vectors")
    vecProducte.imprimir()

    val vecDivisio = vec1 / vec2
    println("La divisio component a component dels dos vectors")
    vecDivisio.imprimir()
}