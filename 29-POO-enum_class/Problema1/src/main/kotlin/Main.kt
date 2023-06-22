/**
 * Defineix una enum class que guardi com a constant els noms de diferents paisos europeus, i com a propietat per a cada pais, la cantitat d'habitans que tè.
 * Defineix una variable d'aquest tipus i imprimeix la constant i la cantitat d'habitans de d'aquesta variable.
 */

enum class Paisos(var poblacio: Int){
    ANDORRA(79034),
    MONACO(36686),
    SANMARINO(33745),
    LIECHTENSTEIN(39039),
    MALTA(518536),
    LUXEMBURG(640064)
}

fun main(args: Array<String>) {
    var pais = Paisos.ANDORRA
    println(pais)
    println(pais.poblacio)
}