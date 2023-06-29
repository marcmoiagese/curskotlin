/**
 * Afegirem dues funcions a la classe String que ens permetin recuperar la meitat i la segona mitat
 */

fun String.primeraMitat(): String{
    return this.substring(0..this.length/2-1)
}

fun String.segonaMeitat(): String{
    return this.substring(this.length/2..this.length-1)
}

fun main(args: Array<String>) {
    val cadena1 =  "Vent"
    println(cadena1.primeraMitat())
    println(cadena1.segonaMeitat())
}