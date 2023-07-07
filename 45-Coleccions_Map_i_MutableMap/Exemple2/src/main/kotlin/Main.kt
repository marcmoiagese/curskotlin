/**
 * Crea un mapa que permeti guardar 5 articles, utilitza com a clau el nom del producte i com valor el preu del mateix. A més a més fes les seguents funcions:
 *
 *     Imprimeix el dicconari sencer
 *     Mostra la cantitat d'articles amb preu superior a 20
 *
 */

fun imprimir(productes: Map<String, Float>){
    for((clau, valor) in productes)
        println("$clau te un preu $valor")
    println();
}

fun cantitatPreuMesGran20(productes: Map<String, Float>){
    val cant = productes.count {it.value > 20}
    println("Cantitat de productes amb un preu superior a 20: $cant")
}

fun main(args: Array<String>) {
    val productes: Map<String, Float> = mapOf("patates" to 12.5f,
                                              "poma" to 26f,
                                              "pera" to 31f,
                                              "mandarines" to 15f,
                                              "Melo" to 28f)
    imprimir(productes)
    cantitatPreuMesGran20(product)
}