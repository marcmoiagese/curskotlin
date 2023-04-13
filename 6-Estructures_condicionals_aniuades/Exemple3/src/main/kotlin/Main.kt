/**
 * Carregar per teclat tres numeros i mostrar per pantalla el mes gran
 *
 */

fun main(args: Array<String>) {
    println("Dona'm el primer numero: ")
    val num1 = readln().toInt()
    println("Dona'm el segon numero: ")
    val num2 = readln().toInt()
    println("Dona'm el tercer numero: ")
    val num3 = readln().toInt()

    val gran = if ( num1 > num2 && num1 > num3 ) num1 else if (num1 < num2 && num2 > num3) num2 else num3
    println("i el numero mes gran es (⌐■_■) $gran")

}