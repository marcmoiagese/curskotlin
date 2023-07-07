/**
 * Crea una classe que representi un treballador. Defineix com a propietats el seu nom i el seu salari.
 * Defineix una llista mutable amb tres treballadors. Imprimeix les dades dels treballadors.
 * Calcula cuan gasta l'empresa en salaris. Afegeix un nou treballador a la llista i calcular novament els salaris.
 */

class Treballador(var nom: String, var salari: Double) {
    fun imprimir() {
        println("$nom te un salari de $salari")
    }
}

fun calculaGastos(treballadors: MutableList<Treballador>){
    val suma = treballadors.sumOf { it.salari }
    println("Total de gastos de la empresa es: $suma")
}

fun main(args: Array<String>) {
    var Treballadors: MutableList<Treballador> = mutableListOf( Treballador("Pep", 200.0),
                                                                Treballador("Claudi", 3500.0),
                                                                Treballador("Pau", 3600.0))

    Treballadors.forEach { it.imprimir() }

    calculaGastos(Treballadors)
    Treballadors.add(Treballador("Firulais", 500000.0))
    println("Recalculant salaris")
    calculaGastos(Treballadors)
}