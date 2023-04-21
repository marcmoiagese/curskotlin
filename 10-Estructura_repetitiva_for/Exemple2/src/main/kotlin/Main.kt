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