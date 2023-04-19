/**
 * Fes un programa que permeti carregar N numeros enters i despres ens informi quans valors son parells i quants imparells.
 * per aixo pots utilitzar l'operador "%" a la condicio de l'estructura if
 */

fun main(args: Array<String>) {
    println("Quants números em donaràs?")
    val x = readln().toInt()
    var cnt = 1
    var parell = 0
    var imparell = 0
    while(x >= cnt){
        println("Donam un numero")
        val numero = readln().toInt()

        if ( numero % 2 == 0)
            parell++
        else
            imparell++
        cnt++
    }
    println("Hi ha $parell parells i $imparell imparells")

}