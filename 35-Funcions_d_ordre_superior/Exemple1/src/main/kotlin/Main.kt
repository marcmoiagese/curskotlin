/**
 * Definirem una funció d'ordre superior anomenada operar. Li arribaran com a parametre dos enters i una funció. Al bloc de la funció cridar a la funcio que arribi com a parametre i enviar els altres dos parametres.
 *
 * La funció retornara un enter
 */

fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int{
    return fn(v1, v2)
}

fun sumar(x1: Int, x2: Int) = x1 + x2

fun restar(x1: Int, x2: Int) = x1 - x2

fun multiplicar (x1: Int, x2: Int) = x1 * x2

fun dividir (x1: Int, x2: Int) = x1 / x2

fun main(args: Array<String>) {
    val resul = operar(10, 5, ::sumar)
    println("La suma de 10 i 5 es $resul")

    val resu2 = operar(5, 2, ::sumar)
    println("La suma de 5 i 2 es $resu2")
    println("La resta de 100 i 40 es ${operar(100, 40, ::restar)}")
    println("El producte entre 5 i 20 es ${operar(5, 20, ::multiplicar)}")
    println("La divisió entre 10 i 5 es ${operar(10, 5, ::dividir)}")
}