/**
 * Sol·licita tres números per teclat. Si un d'ells es menor a 10 indicar per pantalla que hi ha un menor a 10
 */

fun main(args: Array<String>) {
    println("Donam un numero: ")
    val num1 = readln().toInt()
    println("Donam un numero: ")
    val num2 = readln().toInt()
    println("Donam un numero: ")
    val num3 = readln().toInt()

    if(num1<10 || num2<10 || num3<10)
        print("Hi ha al menys un numero inferior a 10")
}