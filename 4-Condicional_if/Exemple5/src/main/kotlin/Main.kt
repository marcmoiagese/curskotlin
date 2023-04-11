/**
 * Es dona per teclat un enter compres entre 1 i 99, mostrar un missatge si el numero te un o dos numeros
 */

fun main(args: Array<String>) {
    println("Donam un numero entre 1 i 99")
    val numero = readln().toInt()

    if (numero < 100 ) {
        if (numero < 10){
            println("te 1 numero")
        }else {
            println("te dos numeros")
        }
    }else{
        println("t'he dit que te que ser entre 1 i 99")
    }
}