/**
 * Fes una funció que calculi la superficie d'un rectangle i la retorni. La funció rep com a parametre els valors de dos dels seus costats.
 *
 * fun retornaSuperficie(costat1: Int, costat2: Int): Int
 *
 * A la funció main del programa cargar els costats dels dos rectangles i despres ensenyar quin dels dos te una superficie mes gran
 *
 */

fun superficie(c1: Int,c2: Int) = c1 * c2

fun main(args: Array<String>) {
    println("***************************************")
    println("Donam el primer: ")
    val costat = readln().toInt()

    println("Donam el segon: ")
    val costat2 = readln().toInt()

    println("***************************************")
    println("Donam el primer: ")
    val costat3 = readln().toInt()

    println("Donam el segon: ")
    val costat4 = readln().toInt()

    if( superficie(costat, costat2 ) == superficie(costat3,costat4) )
        println("Els dos son iguals")
    else
        if ( superficie(costat, costat2 ) > superficie(costat3,costat4) )
            println("El rectangle 1 es el gran")
        else
            println("El rectangle 2 es el gran")
}