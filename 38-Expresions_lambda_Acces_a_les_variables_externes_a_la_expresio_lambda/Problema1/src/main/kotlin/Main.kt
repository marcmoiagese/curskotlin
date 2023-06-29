/**
 * Decada una classe Dau que tingui com a propietat el seu valor i dos mètodes que permetran tirar el dau i imprimir el seu valor.
 * A la main definirem un vector de 5 objectes de tipus Dau, tirar els 5 daus i imprimir cuants 1,2,3,4,5 i 6 han sortit.
 */

class Dau(var num: Int = 1){

    fun tirar (){
        num = ((Math.random() * 6 )).toInt()
    }

    fun imprimir(){
        println(num)
    }

}

fun main(args: Array<String>) {
    val dau1 = arrayOf(
        Dau(),
        Dau(),
        Dau(),
        Dau(),
        Dau()
    )

    for (dauN in dau1){
        dauN.tirar()
    }

    /** dau1.forEach {
        it.tirar()
    } */

    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    var cant5 = 0
    var cant6 = 0

    dau1.forEach {
        when (it.num) {
            1 -> cant1++
            2 -> cant2++
            3 -> cant3++
            4 -> cant4++
            5 -> cant5++
            6 -> cant6++
        }
    }

    println("la cantitat per 1 es: $cant1")
    println("la cantitat per 2 es: $cant2")
    println("la cantitat per 3 es: $cant3")
    println("la cantitat per 4 es: $cant4")
    println("la cantitat per 5 es: $cant5")
    println("la cantitat per 6 es: $cant6")

}