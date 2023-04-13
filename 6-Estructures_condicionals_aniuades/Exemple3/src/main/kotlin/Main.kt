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

    if (num1 > num2)
        if (num1 > num3)
            print(num1)
        else
            print(num3)
    else
        if (num2 > num3)
            print(num2)
        else
            print(num3)
}