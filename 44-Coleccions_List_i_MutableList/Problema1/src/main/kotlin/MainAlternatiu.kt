/**
 * Crea una llista inmutable de 100 enters amb valors aleatoris compresos entre 0 i 20.
 * Conta cuants hi ha compresos entre 1 i 4, 5 i 8 i cuants entre 10 i 13 Imprimir si el valor 20 es troba dins la llista.
 */

fun MainAlternatiu(args: Array<String>) {
    val llista = List(100, { ((Math.random() * 21)).toInt() })
    println(llista)

    var cant1 = 0
    var cant2 = 0
    var cant3 = 0

    llista.forEach {when(it){
        in 1..4 -> cant1++
        in 5..8 -> cant2++
        in 10..13 -> cant3++
    } }

    println("Valors entre 1 i 4 $cant1")
    println("Valors entre 5 i 8 $cant2")
    println("Valors entre 10 i 13 $cant3")

    if (llista.contains(20))
        println("El 20 es dins la llista")
    else
        println("La llista no conte el 20")
}