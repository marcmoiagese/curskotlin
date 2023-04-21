/**
 * Escriu un programa que soliciti la carrega de numeros per teclat, agafa el promig, finalitza la carrega de valors cuan es dongi el numero 0.
 */

fun main(args: Array<String>) {
    var cant  = 0
    var suma = 0

    do {
        println("Donam un numero: ")
        val control = readln().toInt()
        if(control != 0){
            suma += control
            cant++
        }
    }while(control != 0)
    if (cant != 0){
        val promig = suma / cant
        println("El promig dels valors que m'has passat es: $promig")
    }else
        println("no m'has passsat valors")

}