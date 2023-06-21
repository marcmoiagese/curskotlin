/**
 * Declararem una enum class amb els noms de cartes del model ingles. Definirem una classe carta que tingui una propietat de la classe enum class.
 */

enum class TipusCarta{
    DIAMANT,
    TREBOL,
    COR,
    PICA
}

class Carta (val tipu: TipusCarta, val valor: Int){
    fun  imprimir(){
        println("Carta: $tipu i el seu valor es $valor")
    }
}

fun main(args: Array<String>) {
    val carta1 = Carta(TipusCarta.TREBOL,4)
    carta1.imprimir()
}