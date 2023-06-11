/**
 * Fes una aplicació que primer expliqui que fara el programa, després que soliciti la carrega de dos valors i ens mostri la suma. Finalment imprimeix un missatge de despedida del programa.
 * Fes-ho en tres funcions.
 */

fun presentacio(){
    println("Aquest programa realitza la suma de dos valors a que s'han introduit per teclat.")
    println("********************************************************************************")
}

fun cargaisuma(){
    println("Donam el primer numero")
    val valor1 = readln().toInt()

    println("Donam el segon valor")
    val valor2 = readln().toInt()

    val suma = valor1 + valor2
    println("La suma dels dos valors es: $suma")
}

fun finalitzacio(){
    println("****************************")
    println("Gràcies per utilitzar el programa")
}

fun main(args: Array<String>) {
    presentacio()
    cargaisuma()
    finalitzacio()
}