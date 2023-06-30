/**
 * Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter, i carregarem valors aleatoris entre 1 i 10.
 * Sobrecarregarem els operadors ++ i -- que tenen que incrementar o disminuit una unitat a cada element del vector.
 */

class Vector{
    val  vector = IntArray(5)

    fun carregar(){
        for ( i in vector.indices)
            vector[i] = (Math.random() * 11 + 1).toInt()
    }

    fun imprimir(){
        for(element in vector)
            print("$element ")
        println()
    }

    operator fun inc(): Vector{
        var suma1 = Vector()
        for(i in vector.indices)
            suma1.vector[i] = vector[i] +1
        return suma1
    }

    operator fun dec(): Vector {
        var resta1 = Vector()
        for(i in vector.indices)
            resta1.vector[i] = vector[i] - 1
        return resta1
    }
}

fun main(args: Array<String>) {
    var vec1 = Vector()
    vec1.carregar()

    println("Vector original")
    vec1.imprimir()
    vec1++

    println("Despres de cridar a l'operador ++")
    vec1.imprimir()
    vec1--

    println("Despres de cridar a l'operador  --")
    vec1.imprimir()
}