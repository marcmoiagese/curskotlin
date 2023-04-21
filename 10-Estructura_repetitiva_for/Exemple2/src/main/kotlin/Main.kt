/**
 * Fes un programa que permeti la introducció de 10 valors per teclat i mostri posteriorment la suma dels valors introduïts i la seva mitjana.
 * Aquest problema ja l'hem resolt anteriorment quan explicàvem l'estructura "while", però en aquest cas el resoldrem utilitzant l'estructura 'for'.
 */


fun main(args: Array<String>) {
    var suma = 0
    for(i in 1..10){
       println("Donam un numero: ")
       val numero = readln().toInt()
       suma  += numero
    }
    val mitjana = suma /10
    println("La suma es $suma i la mitjana es $mitjana")
}

/**
 * Com pots veure, la variable "i", dins el bucle for no s'utilitza dins el bloc, nomes ens serveix per que el bloc d'instruccions contingut dins el for es repeteixi  10 cops.
 * Quan sabem quantes vegades ha de repetir-se un bloc d'instruccions, és més convenient utilitzar el bucle "for" que el "while", ja que en el primer només cal definir, inicialitzar i incrementar un comptador.
 */