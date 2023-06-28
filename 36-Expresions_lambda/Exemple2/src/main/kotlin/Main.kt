/**
 * Definirem una funció d'ordre superior anomenada operar, li arribarà com a paràmetre dons enters i una funció.
 * al bloc de la funció cridarem a la funció que arriba com a parametre i enviarem els dos primers parametres.
 *
 * Des de la funció main cridarem a operar i enviar diferents expresions lambdas que permetran sumar, restar i elevar el primer valor al segon.
 *
 * ## [Exemple 2]()
 *
 * Fes una funció d'ordre superior que rebi un vector d'enters i una funció amb un paràmetre del tipus Int i que retorni un Boolean.
 *
 * La funcio te d'analitzar cada element del vector cridan a la funció que rebra com a parametre, si retorna un true procedira a ensenyar l'element.
 *
 * A la funció main, definir un vector d'enters de 10 elements i guardar valors aleatoris compresos entre 0 i 99.
 *
 * Imprimir del vector:
 * - Els valors multiples de 2
 * - Els valors multiples de 3 o 5
 * - Els valors mes grans o iguals a 50
 * - Els valors compresos entre 1 i 10, 20, 30, 90 i 95.
 */

fun imprimirSi ( vector: IntArray, fn: (Int) -> Boolean){
    for(element in vector)
        if(fn(element))
            print("$element - ")
    println()
}

fun main(args: Array<String>) {
    val vector1 = IntArray(10)
    for(i in vector1.indices)
        vector1[i] = ((Math.random() * 100)).toInt()

    println("Imprimir els valors multiples de 2")
    imprimirSi(vector1) {x -> x % 2 == 0}

    println("Imprimir els valors multiples de 3 o de 5")
    imprimirSi(vector1) {x -> x % 3 == 0 || x % 5 == 0}

    println("Imprimir els valors mes grans o iguals a 50")
    imprimirSi(vector1) {x -> x >= 50}

    println("Imprimir els valors compresos entre 1 i 10, 20 i 30, 90 i 95")
    imprimirSi(vector1) {x -> when(x) {
        in 1..10 -> true
        in 20..30 -> true
        in 90..95 -> true
        else -> false
    }}

    println("Imprimir tots els valors")
    imprimirSi(vector1) {x -> true}
}