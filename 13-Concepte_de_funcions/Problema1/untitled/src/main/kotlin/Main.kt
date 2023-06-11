/**
 * Fes un programa amb dos funcions. La primera que demani l'introducció d'un enter i retorni el cuadrat d'aquest valor. La segona, demanara la carga de dos valors i ensenyi el producte dels mateixos.
 */

fun cuadrat (){
    println("Donam un valor enter: ")
    val enter = readln().toInt()

    val solucio = enter * enter
    println("el cuadrat es: $solucio")
}

fun producte(){
    println("Donam un valor enter: ")
    val valor1 = readln().toInt()

    println("Donam el segon valor enter: ")
    val valor2 = readln().toInt()

    val solucio = valor1 * valor2
    println("El producte es: $solucio")
}

fun main(args: Array<String>) {
    cuadrat()
    producte()
}