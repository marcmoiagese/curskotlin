/**
 * Crea una classe que representi un treballador. Defineix com a propietats el seu nom i el seu salari.
 * Defineix una llista mutable amb tres treballadors. Imprimeix les dades dels treballadors.
 * Calcula cuan gasta l'empresa en salaris. Afegeix un nou treballador a la llista i calcular novament els salaris.
 */

data class Treballador (val nom: String, var Salari: Int)

fun main(args: Array<String>) {
    var Treballadors: MutableList<Treballador> = mutableListOf( Treballador("Pep", 200),
                                                                Treballador("Claudi", 3500),
                                                                Treballador("Pau", 3600))

    Treballadors.forEach { println(it.nom + " - " + it.Salari ) }

    var total = 0
    Treballadors.forEach {total = total + it.Salari}
    println("L'empresa gasta en salaris $total")

    Treballadors.add( Treballador("Josepa", 8900))

    total = 0
    Treballadors.forEach {total = total + it.Salari}
    println("L'empresa ara gasta en salaris $total")

}