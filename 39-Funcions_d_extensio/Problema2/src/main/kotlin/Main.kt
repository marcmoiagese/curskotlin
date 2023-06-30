/**
 * Fes una funció d'extensió anomenada "Fins" que te d'extreure la classe Int i te per objectiu
 * ensenyar els valors desde el valor enter que li enviem a l'objecte, fins al valor que li arriba com a parametre.
 */

fun Int.fins(fin: Int){
    for(valor in this..fin)
        print("$valor-")
    println()
}

fun main(args: Array<String>) {
   val v = 10
    v.fins(100)
    5.fins(10)
}