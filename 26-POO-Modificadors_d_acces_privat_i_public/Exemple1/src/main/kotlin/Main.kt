/**
 * En aquest cas, crearem una classe anomenada Operacions, que en un mètode soliciti la carrega de 2 entorns i posteriorment, cridi desde el mateix mètode a dos mètodes mes que siguin privats i que calculin el seu producte.
 */

class Operacions{
    private var val1: Int = 0
    private var val2: Int = 0

    fun cargar(){
        print("Introdueix el primer valor: ")
        val1 = readln().toInt()

        print("Introdueix el segon valor: ")
        val2 = readln().toInt()

        sumar()
        restar()
    }

    private fun sumar(){
        val suma = val1 + val2
        println("La suma de $val1 i de $val2 es $suma")
    }

    private fun restar(){
        val resta = val1 - val2
        println("La resta de $val1 i de $val2 es $resta")
    }

}

fun main(args: Array<String>) {
    val operacions1 = Operacions()
    operacions1.cargar()
}