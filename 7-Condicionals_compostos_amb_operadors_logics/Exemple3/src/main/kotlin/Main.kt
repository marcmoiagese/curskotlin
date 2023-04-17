/**
 * Realitza un programa que sol·liciti una data i comprovi si és el dia de Nadal.
 */

fun main(args: Array<String>) {
    println("Donam un dia")
    val dia = readln().toInt()
    println("Donam un mes")
    val mes = readln().toInt()
    println("Donam un any")
    val any = readln().toInt()

    if(dia==25 && mes==12)
        print("Bon Nadal!")
}