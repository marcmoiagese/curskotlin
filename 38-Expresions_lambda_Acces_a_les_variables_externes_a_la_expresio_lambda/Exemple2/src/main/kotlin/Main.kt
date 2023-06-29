/**
 * Resoldrem el mateix problema pero en aquest cas utilitzarem el mètode forEach que disposa la classe IntArray per analitzar tots els components del vector.
 *
 * A la funcio main definirem un vector d'enters de 10 elements i guardarem valors aleatoris compresos entre 0 i 99.
 *
 * Imprimirem del vector:
 *
 *     La cantitat de multiples de 3
 *     La suma de tots els components superiors a 50
 */



fun main(args: Array<String>) {
    val vector1 = IntArray(10)
    for (i in vector1.indices)
        vector1[i] = ((Math.random() * 100)).toInt()

    println("Impresió de tot el vector")
    for(element in vector1)
        print("$element - ")

    println()

    var cantitat = 0
    vector1.forEach {
        if(it % 3 == 0)
            cantitat++
    }

    println("La cantitat d'elements multiples de 3 son $cantitat")
    var suma = 0
    vector1.forEach {
        if(it > 50)
            suma += it
    }

    println("La suma de tots els elements mes grans de 50 es $suma")
}