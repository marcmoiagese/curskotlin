/**
 * A la funció main demanar que s'introdueixi una clau dues vegades per teclat.
 * Fes una funció que rebi dos string com a parametres i imprimeixi un missatge si les dos claus donades son iguals o diferents
 */

fun revisaLaClau (c1: String, c2: String){
    when{
        c1 == c2 -> println("Les claus coincideixen")
        else -> println("Les claus no coincideixen")
    }
}


fun main(args: Array<String>) {
    println("Introdueix la clau: ")
    val clau1 = readln().toString()

    println("Torna a introduir la clau: ")
    val clau2 = readln().toString()

    revisaLaClau(clau1, clau2)
}