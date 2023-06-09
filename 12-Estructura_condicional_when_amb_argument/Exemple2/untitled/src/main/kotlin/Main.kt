/**
 * Introdueix un valor enter positiu compres entre 1 i 10000. Imprimeix un missatge indican quants digits te.
 */

fun main(args: Array<String>) {
    print("Donam un valor enter positiu compres entre 1 i 99999: ")
    val valor = readln().toInt()

    when (valor){
        in 1..9 -> print("Te un digit")
        in 10..99 -> print("Te dos digits")
        in 100..999 -> print("Te tres digits")
        in 1000..9999 -> print("Te quatre digits")
        in 10000..99999 -> print("Te cinc digits")
        else -> print("T'has passat de rang")
    }
}