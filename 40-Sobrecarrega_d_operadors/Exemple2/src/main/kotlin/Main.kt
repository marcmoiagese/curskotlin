/**
 * Declararem una classe anomenada Vector que administrara un vector de 5 elements de tipus enter, tambe carregara valors aleatoris entre 1 i 10.
 * Sobrecarregarem l'operador * per a que permeti multiplicar un vector amb un numero enter. Es te que multiplicar cada component del vector pel enter.
 */

class Vector{
    val  vector = IntArray(5)

    fun  carregar(){
        for (i in vector.indices)
            vector[i] = (Math.random() * 11 + 1).toInt()
    }

    fun imprimir(){
        for(element in vector)
            print("$element")
        println()
    }

    // En aquest problema, per sobrecarregar l'operador * d'un vector per un tipus enter, al metode li te d'arribar una dada de tipus int
    operator fun times(valor: Int): Vector{
        var suma = Vector()
        for (i in vector.indices)
            suma.vector[i] = vector[i] * valor
        return suma
    }
}

fun main(args: Array<String>) {
    val vec1 = Vector()
    vec1.carregar()
    vec1.imprimir()

    println("El producte de un vector amb el numero 10 es")
    val vecProducteEnt = vec1 * 10 // Cuan volem multiplicar un objecte de la classe Vector per un tipus de dada Int ho tenim que fer en aquest ordre
    /**
     * Si vulguessim invertir l'ordre, es a dir multiplicar el int pel vector, tindriam que modificar el metode times a la classe Int
     * operator fun times(vec: Vector): Vector{
     */
    vecProducteEnt.imprimir()
}