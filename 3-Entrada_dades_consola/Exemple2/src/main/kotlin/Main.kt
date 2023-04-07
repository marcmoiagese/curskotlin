/**
 * En aquest cas, farem un exemple en el que se'ns demanarà la longitud del costat d'un quadrat i es mostrarà el seu perímetre.
 */

fun main(parametre: Array<String>) {
    print("Donam la mida d'un costat del cuadrat: ")
    val costat = readln().toInt()
    val perimetre = costat * 4
    println("El perímetre del cuadradt es $perimetre")
}