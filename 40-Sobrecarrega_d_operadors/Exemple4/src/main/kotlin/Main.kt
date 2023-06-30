/**
 * Implementarem una classe anomenada Persona que tindra com a propietats el seu nom i edat. Sobrecarregarem els operadors >>= i <<=.
 */

class Persona (val nom: String, val edat: Int){
    fun imprimir(){
        println("Nom: $nom i te una edat de $edat")
    }

    // El mètode compareTo retorna un Intm indican un 0 cuan les dues persones tenen la mateixa edat o 1 si la persona que es a l'esquerra es major d'edat o -1 si es la de la dreta
    operator fun compareTo(per2: Persona): Int {
        return when {
            edat < per2.edat -> -1
            edat > per2.edat -> 1
            else -> 0
        }
    }
}

fun main(args: Array<String>) {
    val persona1 = Persona("Joan", 30)
    persona1.imprimir()

    val persona2 = Persona("Anna", 30)
    persona2.imprimir()

    println("Persona gran")
    // Despres amb el que hem obtingut amb compareTo, podem preguntar quin es el major.
    when {
        persona1 > persona2 -> persona1.imprimir()
        persona1 < persona2 -> persona2.imprimir()
        else -> println("Tenen la mateixa edat")
    }
}