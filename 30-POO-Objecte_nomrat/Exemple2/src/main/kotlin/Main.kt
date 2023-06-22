/**
 * Crearem un objecte local dins de la funció main que permeti tirar 5 daus i guardi aquets valors dins un vector. Definirem una propietat que guardi 2 enters i tres mètodes
 * Un que carregui els 5 elements del vector amb valors aleatoris compresos entre 1 i 6.
 * Un altre que imprimeixi el vector i finalment un altre que retorni el valor mes gran del vector.
 */

fun main(args: Array<String>) {

    val daus = object {
        val vector = IntArray(5)
        fun generar() {
            for (i in vector.indices)
                vector[i] = ( (Math.random() * 6) + 1 ).toInt()
        }

        fun imprimir() {
            for (element in vector)
                print("$element - ")
            println();
        }

        fun mesGran(): Int {
            var gran = vector[0]
            for(i in vector.indices)
                if(vector[i] > gran)
                    gran = vector[i]
            return gran
        }
    }

    daus.generar()
    daus.imprimir()
    print("El mes gran: ")
    println(daus.mesGran())
}