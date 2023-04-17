/**
 * Sol·licita tres números per teclat. Si tots els valors són més petits que 10, imprimeix el missatge "són més petits que 10".
 */

fun main(args: Array<String>) {
    println("Donam un numero: ")
    val num1 = readln().toInt()
    println("Donam un numero: ")
    val num2 = readln().toInt()
    println("Donam un numero: ")
    val num3 = readln().toInt()

    if(num1<10 && num2<10 && num3<10)
        print("són mes petits que 10")
}