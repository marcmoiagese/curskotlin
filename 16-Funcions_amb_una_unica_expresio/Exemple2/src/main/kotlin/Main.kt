/**
 * Fes una funció a la que li enviarem com a parametre dos enters i ens retorni el mes gran
 */

fun tornaElGran(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main(args: Array<String>) {
    print("Donam el primer valor: ")
    val valor1 = readln().toInt()

    print("Donam el segon valor: ")
    val valor2 = readln().toInt()

    println("El mes gran entre $valor1 i $valor2 es ${tornaElGran(valor1, valor2)}")
}