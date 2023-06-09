/**
 * Introdueix un valor enter entre 1 i 5, mostra el nom d'aquest escrit en català
 */

fun main(args: Array<String>) {
    println("Donam un valor enter entre 1 i 5")
    val valor = readln().toInt()

    when(valor) {
        1 -> print("un")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("quatre")
        5 -> print("cinc")
        else -> print("El valor esta fora de rang")
    }

}