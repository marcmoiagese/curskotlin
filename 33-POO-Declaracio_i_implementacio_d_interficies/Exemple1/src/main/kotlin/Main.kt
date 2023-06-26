/**
 * Definirem una interficie anomenada Punt que declarara un mètode anomenat imprimir. Despres declararem dues classes que la implementin.
 */

interface Punt {
    fun imprimir()
}

class PuntPla(val x: Int, val y: Int): Punt{
    override fun imprimir() {
        println("Punt sobre el plà: ($x,$y)")
    }
}

class PuntEspai(val x: Int, val y: Int, val z: Int): Punt{
    override fun imprimir(){
        println("El pun sobre l'espai: ($x,$y,$z)")
    }
}

fun main(args: Array<String>) {
    val puntPla1 = PuntPla(10,4)
    puntPla1.imprimir()

    val puntEspai1 = PuntEspai(20,50,60)
    puntEspai1.imprimir()
}