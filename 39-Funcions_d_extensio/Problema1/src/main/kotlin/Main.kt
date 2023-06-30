/**
 * Afegir a la classe String un mètode imprimir que ensenyi tots els caracters que te guardats una línea.
 */

fun String.imprimir(){
    println(this)
}

fun main(args: Array<String>) {
    val hola = "soc una linea"
    hola.imprimir()
}