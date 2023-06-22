/**
 * Declararem una enum class que representi les cuatre operacions bàsiques, asociarem a cada constant un String amb el signe de l'operació.
 * També definirem una classe Operacio que definirà tre propietats, les dos primeres tenen que ser els numeros i la tercera el tipus d'operació
 */

enum class TipusOperacio ( val tipu: String){
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACIO("*"),
    DIVISIO("/")

}

class Operacio (val v1: Int, val v2: Int, val tipusOperacio: TipusOperacio){

    fun operar(){
        var resultat: Int = 0
        when (tipusOperacio) {
            TipusOperacio.SUMA -> resultat = v1 + v2
            TipusOperacio.RESTA -> resultat = v1 - v2
            TipusOperacio.MULTIPLICACIO -> resultat = v1 * v2
            TipusOperacio.DIVISIO -> resultat = v1 / v2
        }
        println("$v1 ${tipusOperacio.tipu} $v2 es igual a $resultat")
    }
}

fun main(args: Array<String>) {
    val operacio = Operacio(10, 4, TipusOperacio.SUMA)
    operacio.operar()
}