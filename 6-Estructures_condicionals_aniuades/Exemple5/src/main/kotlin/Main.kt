/**
 * Carregara un numero enter positiu d'un màxim de 3 xifres i imprimeix un missatge indican el numero de digits que te. Mostra un missatge d'error si te mes de 3 xifres
 */

fun main(args: Array<String>) {
    println("Donam un numero que maxim tingui 3 digits: ")
    val numero = readln().toInt()

    val resultat = if (numero < 10 ) "1 digit" else if (numero <= 99 ) "2 digits" else if (numero <= 999) "3 digits" else "passarell t'he dit maxim 3 digits"
    println("$resultat")

}