/**
 * Demana 3 valors per teclat, si tots son iguals, calcula el cub del numero i imprimirlo
 */
fun main(args: Array<String>) {
    println("Donam un numero")
    val num1 = readln().toInt()
    println("Donam un numero")
    val num2 = readln().toInt()
    println("Donam un numero")
    val num3 = readln().toInt()

    if(num1==num2 &&  num1==num3) {
        val cub = num1 * num2 * num3
        print("el vub es: $cub")
    }


}