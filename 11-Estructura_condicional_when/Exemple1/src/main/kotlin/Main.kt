/**
 * Escriu un programa que demani les coordenades d'un punt en un pla, es a dir dos valors enters X e Y
 * Despres imprimirem per pantalla a quin cuadran es troba el punt.
 * El primer cuadrant seria si X > 0 i Y > 0
 * El segon cuadrant seria si > < 0 i Y > 0
 * El tercer cuadrant seria si X < 0  i Y < 0
 * El cuart cuadrant seria si x > 0 i Y < 0
 * Si algun dels dos valors es zero es per que el punt es troba al centre de l'eix
 */

fun main(args: Array<String>) {
    print("Donam la coordenada X del punt: ")
    val x = readln().toInt()

    print("Donam la coordenada Y del punt: ")
    val y = readln().toInt()

    when{
        x > 0 && y > 0 -> println("Primer cuadrant")
        x < 0 && y > 0 -> println("Segon cuadrant")
        x < 0 && y < 0 -> println("Tercer cuadrant")
        x > 0 && y < 0 -> println("Cuart cuadrant")
        else -> println("el punt esta en un eix")
    }
}