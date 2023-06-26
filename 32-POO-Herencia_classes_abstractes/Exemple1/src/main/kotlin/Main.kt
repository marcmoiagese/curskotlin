/**
 * Declararem una classe abstracta que representi una operació. Definirem a la mateixa tres propietats. valor1, valor2 i resultat, i dos mètodes, calcular i imprimir.
 * Plantejarem dues classes anomenades suma i resta que heredin de la classe operació.
 */

abstract class Operacio( val valor1: Int, val valor2: Int){
    protected var resultat: Int = 0

    abstract fun operar()

    fun imprimir() {
        println("Resultat: $resultat")
    }
}

class Suma(valor1: Int, valor2: Int): Operacio (valor1, valor2){
    override fun operar() {
        resultat = valor1 + valor2
    }
}

class Resta (valor1: Int, valor2: Int): Operacio(valor1,valor2){
    override fun operar(){
        resultat = valor1 - valor2
    }
}

fun main(args: Array<String>) {
    val suma1 = Suma(10, 4)
    suma1.operar()
    suma1.imprimir()

    val resta1 = Resta(20, 5)
    resta1.operar()
    resta1.imprimir()
}