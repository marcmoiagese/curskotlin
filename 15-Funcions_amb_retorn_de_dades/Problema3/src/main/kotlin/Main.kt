/**
 * Fes una funcio que calculi la superficie d'un rectangle i la retorni. La funcio rebra com a parametre els valors dels seus costats.
 * Des de la funció main del programa carregar els costats de 2 rectangles, i despres mostrar quin dels dos te una superficie mes gran
 */

fun areaRect(v1: Int, v2: Int): Int{
    val area = v1  * v2
    return area
}

fun main(args: Array<String>) {
    println("Primer rectangle: ")
    println("Donam el costat 1: ")
    val costat1 = readln().toInt()

    println("Donam el costat 2: ")
    val costat2 = readln().toInt()

    println("Segon rectangle: ")
    println("Donam el costat 1: ")
    val costat3 = readln().toInt()

    println("Donam el costat 2: ")
    val costat4 = readln().toInt()

    if( areaRect(costat1, costat2) == areaRect(costat3, costat4) )
        print("Els dos rectangles tenen la mateixa superficie")
    else
        if ( areaRect(costat1, costat2) > areaRect(costat3, costat4) )
            print("El primer rectangle te una superficie mes gran")
        else
            print("El segon rectangle te una superficie mes gran")

}