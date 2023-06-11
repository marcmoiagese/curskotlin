/**
 * Desenvolupa una funcio que demani la carrega de tres valors i imprimeixi el menor. Desde la funcio main cridarem la funcio creada 2 vegades sense utilitzar una estructura repetitiva.
 */

fun carregam(){
    println("Donam el primer valor")
    val valor1 = readln().toInt()

    println("Donam el segon valor")
    val valor2 = readln().toInt()

    println("Donam el tercer valor")
    val valor3 = readln().toInt()

    if(valor1 < valor2 && valor1 < valor3){
        println("El valor petit es $valor1")
    }else if(valor1 > valor2 && valor1 > valor3){
        println("El valor petit es $valor2")
    } else  {
        println("El valor petit es $valor3")
    }
}

fun main(args: Array<String>) {
    carregam()
}