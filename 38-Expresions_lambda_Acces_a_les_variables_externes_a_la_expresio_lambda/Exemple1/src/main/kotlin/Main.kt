/**
 * Crearem una funció d'ordre suoperior que rebi un vector d'enters i una funcio amb un parametre de tipus init, que no retorni res.
 *
 * La funcio ha d'enviar cada element del vector a l'expresio lambda definida.
 *
 * A la funcio main, definirem un vector d'enters de 10 elements i enmagatzemar valors aleatoris compresos entre 0 i 99.
 *
 * Imprimir del vector:
 * - La cantitat de multiples de 3
 * - La suma de tots els components que siguin superiors a 50
 */

fun exploraVector(vector: IntArray, fn:(Int) -> Unit){
    for(element in vector)
        (fn(element))
}

fun main(args: Array<String>) {
    val vector1 = IntArray(10)
    for (i in vector1.indices)
        vector1[i] = ((Math.random() * 100)).toInt()

    println("Impresio de tot el vector")
    for(element in vector1)
        print("$element - ")
    println()

    var cantitat = 0
    exploraVector(vector1){
        if(it % 3 == 0)
            cantitat++
    }

    println("La cantitat d'elements multiples de 3 son $cantitat")
    var suma = 0
    exploraVector(vector1){
        if(it > 50)
            suma += it
    }
    println("La suma de tots els elements mes grans de 50 es $suma")
}