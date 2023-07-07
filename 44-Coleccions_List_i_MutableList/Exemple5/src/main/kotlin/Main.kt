/**
 * Crearem una classe anomenada Persona que tindra com a propietats el seu nom i edat.
 * A més a més, definirem dos metodes, un que imprimeixi les propietats i un altre que ensenyi si es major d'edat.
 * Definir una llista mutable d'objectes de la classe Persona. Imprimir les dades de totes les persones. Imprimir cuantes persones son majors d'edat.
 */

class Persona (var nom: String, var edat: Int){
    fun imprimir(){
        println("Nom: $nom i te una edat de $edat")
    }

    fun esMajorDedat(){
        if (edat >= 18)
            println("Es major d'edat $nom")
        else
            println("no es major d'edat $nom")
    }
}

fun main(args: Array<String>) {
    val persones: MutableList<Persona>
    persones = mutableListOf(Persona("Joan", 22), Persona("Anna", 19), Persona("Marc", 12))

    println("Llista de persones")
    persones.forEach { it.imprimir() }

    val cant = persones.count { it.edat >= 18 }
    println("La cantitat de persones mes grans d'edat es $cant")
}