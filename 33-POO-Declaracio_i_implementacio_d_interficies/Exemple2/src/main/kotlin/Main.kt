/**
 * Donada la seguent interficie, Definirem dues classes que representin un cuadrat i un rectangle. Implementarem la interficie figura a ambdues classes
 */

interface Figura {
    fun calculaSuperficie(): Int
    fun calcularPerimetre(): Int
    fun titolResultat() {
        println("Dades de la figura")
    }
}

class Cuadrat ( val costat: Int): Figura {
    override fun calculaSuperficie():Int {
        return costat * costat
    }

    override fun calcularPerimetre():Int {
        return costat * 4
    }
}

class RectAngle (val costatGran: Int, val menor: Int ): Figura {
    override fun calculaSuperficie(): Int {
        return costatGran * menor
    }

    override fun calcularPerimetre():Int {
        return (costatGran * 2) + (menor * 2)
    }
}

fun main(args: Array<String>) {
    val  cuadrat1 = Cuadrat(10)
    cuadrat1.titolResultat()
    println("Perimetre del cuadrat: ${cuadrat1.calcularPerimetre()}")
    println("Superficie del cuadrat : ${cuadrat1.calculaSuperficie()}")

    val rectangle1 = RectAngle(10,5)
    rectangle1.titolResultat()
    println("Perimetre del rectangle: ${rectangle1.calcularPerimetre()}")
    println("Superficie del rectangle : ${rectangle1.calculaSuperficie()}")

}