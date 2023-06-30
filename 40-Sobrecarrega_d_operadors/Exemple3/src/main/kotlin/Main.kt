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

    // Cuan volem sobrecarregar ++ hem d'implementar el metode inc, aquest metode no rep cap parametre i retornen objectes de la classe vector incrementan en un cada component del vector
    operator fun inc(): Vector{
        var suma1 = Vector()
        for(i in vector.indices)
            suma1.vector[i] = vector[i] +1
        return suma1
    }

    // Cuan volem sobrecarregar -- hem d'implementar el metode dec, aquest metode no rep cap parametre i retornen objectes de la classe vector disminuin en un cada component del vector
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
    vec1++ // cuan cridem l'operador ++ l'objecte que retorna s'asigna a la variable per la que el cridem, això fa necessari definir la clase del objecte Vector com a var enlloc de val ja que variarà

    println("Despres de cridar a l'operador ++")
    vec1.imprimir()
    vec1-- // cuan cridem l'operador -- l'objecte que retorna s'asigna a la variable per la que el cridem, això fa necessari definir la clase del objecte Vector com a var enlloc de val ja que variarà

    println("Despres de cridar a l'operador  --")
    vec1.imprimir()
}