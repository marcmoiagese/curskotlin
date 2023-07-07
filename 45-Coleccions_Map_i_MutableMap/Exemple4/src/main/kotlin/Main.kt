/**
 * Farem un programa que permeti caregar un codi de producte com clau en un Map. Guardarem per aquesta clau un objecte de classe Producte que defineixi com a propietats el nom del producte, el seu preu i la cantitat en stock. Immplementa les seguents activitats.
 *
 *     Carrega de dades al Map.
 *     Llista completa de productes.
 *     Consulta d'un producte per la seva clau, imprimir el nom, preu i stock.
 *     Cantitat de productes que tinguin un stock amb un valor 0.
 *
 */

data class Producte (val nom: String, val preu: Float, val cantitat: Int)

fun carregar(productes: MutableMap<Int, Producte>){
    productes[1] = Producte("Patates", 13.15f, 200)
    productes[15] = Producte("Pomes", 20f, 0)
    productes[20] = Producte("Peres", 3.50f, 0)
}

fun llistaSencera(productes: MutableMap<Int, Producte>){
    println("Llista sencera de productes")
    for((codi, producte) in productes)
        println ("Codi: $codi Descripcio ${producte.nom} Preu: ${producte.preu}")
    println()
}

fun consultaProducte(productes: MutableMap<Int, Producte>){
    print("Donam el codi del producte: ")
    val codi = readln().toInt()
    if (codi in productes)
        println("Nom: ${productes[codi]?.nom} Preu: ${productes[codi]?.preu} Stock: ${productes[codi]?.cantitat}")
    else
        println("No existeis cap producte amb aquest codi")
}

fun senseStock(productes: MutableMap<Int, Producte>){
    val cant = productes.count { it.value.cantitat == 0 }
    println("Cantitat d'articles sense stock $cant")
}

fun main(args: Array<String>) {
    val productes: MutableMap<Int, Producte> = mutableMapOf()
    carregar(productes);
    llistaSencera(productes)
    consultaProducte(productes)
    senseStock(productes)
}