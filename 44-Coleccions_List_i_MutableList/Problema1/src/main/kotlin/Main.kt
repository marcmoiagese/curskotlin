/**
 * Crea una llista inmutable de 100 enters amb valors aleatoris compresos entre 0 i 20.
 * Conta cuants hi ha compresos entre 1 i 4, 5 i 8 i cuants entre 10 i 13 Imprimir si el valor 20 es troba dins la llista.
 */

fun main(args: Array<String>) {
    val llista = List(100, { ((Math.random() * 21)).toInt() })
    println(llista)

    println("entre  1 i 4")
    val cant1i4 = llista.count {it >= 1 && it <= 4}
    println(cant1i4)

    println("entre  5 i 8")
    val cant5i8 = llista.count {it >= 5 && it <= 8}
    println(cant5i8)

    println("entre  10 i 13")
    val cant10i13 = llista.count {it >= 10 && it <= 13}
    println(cant10i13)

    println("Miro si esta el valor 20")
    if(llista.any{it == 20})
        println("El 20 esta!!")
    else
        println("El 20 no esta :(")
}