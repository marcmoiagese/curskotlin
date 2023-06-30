/**
 * Implementarem una classe anomenada Persona que tindra com a propietats el seu nom i edat. Sobrecarregarem els operadors >>= i <<=.
 */

class Persona (val nom: String, val edat: Int){
    fun imprimir(){
        println("Nom: $nom i te una edat de $edat")
    }

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
    when {
        persona1 > persona2 -> persona1.imprimir()
        persona1 < persona2 -> persona2.imprimir()
        else -> println("Tenen la mateixa edat")
    }
}