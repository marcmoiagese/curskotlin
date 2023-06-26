/**
 * Declararem una classe anomenada Calculadora que rebi al constructor dos valors de tipo Double.
 * Fes que la classe sigui oberta per que sigui heredable. Definire, les responsabilitats de sumar, restar, multiplicar, dividir i imprimir.
 *
 * Després declararem una classe anomenada CalculadoraCientifica que heredara Calculadora i li afegira les responsabilitats de calcular el cuadrat del primer numero i l'arrel cuadrada.
 */

open class Calculadora(val valor1: Double, val valor2: Double){
    var resultat: Double = 0.0
    fun sumar(){
        resultat = valor1 + valor2
    }

    fun restar(){
        resultat = valor1 - valor2
    }

    fun multiplicar(){
        resultat = valor1 * valor2
    }

    fun dividir(){
        resultat = valor1 / valor2
    }

    fun imprimir(){
        println("El resultat es: $resultat")
    }
}

class CalculadoraCientifica(valor1: Double, valor2: Double): Calculadora(valor1, valor2){
    fun cuadrat(){
        resultat = valor1 * valor2
    }

    fun arrel(){
        resultat = Math.sqrt(valor1)
    }
}

fun main(args: Array<String>) {
    println ("Test de la classe Calculadora ")
    val calculadora1 = Calculadora(10.0, 2.0)
    calculadora1.sumar()
    calculadora1.imprimir()

    println ("Test de la classe CalculadoraCientifica ")
    val calculadoracientifica1 = CalculadoraCientifica(10.0, 2.0)
    calculadoracientifica1.sumar()
    calculadoracientifica1.imprimir()

    calculadoracientifica1.cuadrat()
    calculadoracientifica1.imprimir()

    calculadoracientifica1.arrel()
    calculadoracientifica1.imprimir()
}