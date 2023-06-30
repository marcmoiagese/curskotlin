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

    /**
     * Per a sobrecarregar l'operador + hem d'implementar el metode plus que revi un unic parametre, en aquest cas de tipus vector i retorni un altre objecte de la classe vector
     * Hem d'antecedir la paraula clau fun a la paraula operator.
     */
    operator fun plus(vector2: Vector): Vector {
        var suma = Vector() // Creem un objecte de classe vector
        for(i in vector.indices)
            //inicialitzem la propietat de vector amb la suma component a component dels dos vectors de cada tipus
            suma.vector[i] = vector[i] + vector2.vector[i]
        return suma
    }

    operator fun minus(vector2: Vector): Vector {
        var resta = Vector() // Creem un objecte de classe vector
        for(i in vector.indices)
            //inicialitzem la propietat de vector amb la resta component a component dels dos vectors de cada tipus
            resta.vector[i] = vector[i] - vector2.vector[i]
        return resta
    }

    operator fun times(vector2: Vector): Vector {
        var producte = Vector() // Creem un objecte de classe vector
        for(i in vector.indices)
            //inicialitzem la propietat de vector amb la multiplicacio component a component dels dos vectors de cada tipus
            producte.vector[i] = vector[i] *  vector2.vector[i]
        return producte
    }

    operator fun div(vector2: Vector): Vector{
        var divisio = Vector() // Creem un objecte de classe vector
        for(i in vector.indices)
            //inicialitzem la propietat de vector amb la divisio component a component dels dos vectors de cada tipus
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

    // Aqui, cuan posem l'operador + estem fent la crida al mètode "operator fun plus(vector2: Vector): Vector" també la podriam  invocar "val vecSuma = vec1.plus(vec2)"
    val vecSuma = vec1 + vec2
    println("Suma component a component dels dos vectors")
    vecSuma.imprimir()

    // Aqui, cuan posem l'operador - estem fent la crida al mètode "operator fun minus(vector2: Vector): Vector {" també la podriam  invocar "val vecSuma = vec1.minus(vec2)"
    val vecResta = vec1 - vec2
    println("La resta component a component dels dos vectors")
    vecResta.imprimir()

    // Aqui, cuan posem l'operador * estem fent la crida al mètode "operator fun times(vector2: Vector): Vector {" també la podriam  invocar "val vecSuma = vec1.times(vec2)"
    val vecProducte = vec1 * vec2
    println("El producte component a component dels dos vectors")
    vecProducte.imprimir()

    // Aqui, cuan posem l'operador * estem fent la crida al mètode "operator fun div(vector2: Vector): Vector{" també la podriam  invocar "val vecSuma = vec1.div(vec2)"
    val vecDivisio = vec1 / vec2
    println("La divisio component a component dels dos vectors")
    vecDivisio.imprimir()
}