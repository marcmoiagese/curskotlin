/**
 * Fes una funció que rebi tres enters i els imprimeixi ordenats de menor a major. A la funció main, sol·licita la càrrega de 3 enters per teclat i crida la primera funció.
 */

fun enterOrd (e1: Int, e2: Int, e3: Int){
    if (e1 < e2 && e1 < e3){
        if (e2 < e3)
            println ("$e1 , $e2 , $e3")
        else
            println ("$e1 , $e3 , $e2")
    }else if (e1 > e2 && e2 < e3){
        if (e1 < e3)
            println ("$e2 , $e1 , $e3")
        else
            println ("$e2 , $e3 , $e1")
    }else if (e3 < e1 && e3 < e2)
        if(e1 < e2)
            println ("$e3 , $e1 , $e2")
        else
            println ("$e3 , $e2 , $e1")
}

fun main(args: Array<String>) {
    println("Donam el valor 1")
    val valor1 = readln().toInt()

    println("Donam el valor 2")
    val valor2 = readln().toInt()

    println("Donam el valor 3")
    val valor3 = readln().toInt()

    enterOrd(valor1, valor2, valor3)
}