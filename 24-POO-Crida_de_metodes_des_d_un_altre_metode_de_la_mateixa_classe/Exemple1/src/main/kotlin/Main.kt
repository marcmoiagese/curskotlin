/**
 * Crearem la classe Operacions que en un mètode demani la càrrega de 2 enters i posteriorment cridi a uns altres 2 mètodes que calculin la seva suma i producte.
 */

class Operacions{
    var valor1: Int = 0
    var valor2: Int = 0

    fun carregar() {
        print("Donam el primer valor: ")
        valor1 = readln().toInt()

        print("Donam el segon valor: ")
        valor2 = readln().toInt()
        sumar()
        restar()
    }

    fun sumar(){
        val suma = valor1 + valor2
        println("La suma de $valor1 i $valor2 es $suma")
    }

    fun restar(){
        val resta = valor1 - valor2
        println("La resta de $valor1 i $valor2 es $resta")
    }
}

fun main(args: Array<String>) {
    val operacions1 = Operacions()
    operacions1.carregar()
}