/**
 * Planteja una Data class que es digui Dau amb una unica propietat anomenada valor.
 * Sobreescriu el mètode toString per que ensenyi tants asteriscs com indigui la propietat valor.
 */

data class Dau (var valor: Int){
    override fun toString(): String {
        var compto = ""
        for (i in 0..valor-1)
            compto += "*"

        return "$compto"
    }
}

fun main(args: Array<String>) {
   var tiro = Dau(5)
    println(tiro)
}