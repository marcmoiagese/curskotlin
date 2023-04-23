/**
 *  El Seguent exemple crearem un programa que defineixi dues variables immutables de tipus Int. Després definir una tercera variable mutable que emmagatzemi la suma de les dues primeres variables i la mostri. Seguidament, emmagatzemar en la variable el producte de les dues primeres variables i mostrar el resultat.
 */

fun main(parametre: Array<String>) {
    val val1: Int // Declaro variable inmutable
    val val2: Int // Declaro variable inmutable
    val1 = 100 // Inicialitzo variable inmutable
    val2 = 400 // Inicialitzo variable inmutable
    var resultat: Int // Declaro un valor mutable
    resultat = val1 + val2
    println("El sumatori de $val1 + $val2 dona $resultat")
    resultat = val1 * val2
    println("El producte de $val1 * $val2 dona $resultat")
}

