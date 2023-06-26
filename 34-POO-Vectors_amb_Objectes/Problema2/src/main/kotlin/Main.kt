/**
 * Declarar una classe Dau que tingui com a propietat el seu valor i dos mètodes que permetin tirar el dau i imprimir el seu valor.
 * A la main definir un vector amb 5 objectes de tipus Dau. Tirar els 5 daus i imprimir els valors de cada un.
 */

class Dau (var num: Int = 1){

    fun tirar(){
        num = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir(){
        println(num)
    }
}

fun main(args: Array<String>) {
    val dau1: Array<Dau> = arrayOf(Dau(), Dau(), Dau(), Dau(), Dau() )

    for (i in dau1)
        i.tirar()

    for (i in dau1)
        i.imprimir()
}