/**
 * Crea una estructura que es repeteixi 5 cops, i dins de la mateixa carregar 3 valors enters, acumularem  nomes el mes gran de cada llista
 */

fun main(args: Array<String>) {
    var suma = 0
    for(i in 1..5){
        println("donam el primer valor")
        val val1 = readln().toInt()
        println("donam el segon valor")
        val val2 = readln().toInt()
        println("donam el tercer valor")
        val val3 = readln().toInt()

        suma +=  when  {
            val1 > val2 && val1 > val3 -> val1
            val2 > val3 -> val2
            else -> val3
        }
    }
    println("El valor acumulat dels mes grans de cada llista de tres es: $suma")
}