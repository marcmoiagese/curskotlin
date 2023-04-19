/**
 * Escriu un programa que permeti carregar 10 valors a través del teclat i que ens imprimeixi la suma i el promig dels valors introduïts.
 */

fun main(args: Array<String>) {
    var x = 1
    var suma = 0

    while(x<=10){
        println("Donam el numero $x : ")
        val numnum = readln().toInt()
        suma = suma + numnum
        x++
    }
    val promig = suma/10
    println("La suma dels numeros es $suma i el seu promig es $promig")
}

