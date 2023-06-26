/**
 * Declarar una classe Dau que tingui com a propietat el seu valor i dos mètodes que permetin tirar el dau i imprimir el seu valor.
 * A la main definir un vector amb 5 objectes de tipus Dau. Tirar els 5 daus i imprimir els valors de cada un.
 */

class Dau (val num: Int){

    fun tirar(){
        return imprimir()
    }

    fun imprimir(){
        println(num)
    }
}

fun main(args: Array<String>) {
    val dau1: Array<Dau> = arrayOf(
        Dau(5),
        Dau(3),
        Dau(2),
        Dau(6),
        Dau(1),
    )

    for (i in dau1)
        i.tirar()
}