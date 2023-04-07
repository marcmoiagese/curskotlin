/**
 * Definiu una variable immutable amb el valor 50 que representa el costat d'un quadrat. A continuació, creeu dues variables immutables per emmagatzemar la superfície i el
 * perímetre del quadrat. Mostreu la superfície i el perímetre per la Consola.
 *
 */

fun main() {
    val costat = 50
    val area = costat * costat
    val perimetre = costat * 4

    println("l'area del cuadrat es $area i el perimetre es $perimetre")
}