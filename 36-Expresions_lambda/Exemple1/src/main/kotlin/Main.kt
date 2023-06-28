/**
 * Definirem una funció d'ordre superior anomenada operar, li arribarà com a paràmetre dons enters i una funció.
 * al bloc de la funció cridarem a la funció que arriba com a parametre i enviarem els dos primers parametres.
 *
 * Des de la funció main cridarem a operar i enviar diferents expresions lambdas que permetran sumar, restar i elevar el primer valor al segon.
 */

fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int{
    return fn(v1, v2)
}

fun main(args: Array<String>) {
    val suma = operar(2, 3, {x, y -> x +y})
    println(suma)

    val resta = operar(12, 2, {x, y -> x - y})
    println(resta)

    var elevarCuarta = operar(2, 4, {x, y ->
        var valor = 1
        for(i in 1..y)
            valor = valor * x
        valor
    })

    println(elevarCuarta)

}