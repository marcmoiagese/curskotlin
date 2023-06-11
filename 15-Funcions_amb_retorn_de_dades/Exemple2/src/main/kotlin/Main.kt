/**
 * Fes una funció que li enviem com a parametre dos enters i ens retorni el mes gran
 */

fun tornamElGran (v1: Int, v2: Int): Int {
    if (v1 > v2)
        return  v1
    else
        return v2
}

fun main(args: Array<String>) {
    print("Donam el primer valor: ")
    val valor1 = readln().toInt()

    print("Donam el segon valor: ")
    val valor2 = readln().toInt()

    println("El mes gran entre $valor1 i $valor2 es ${tornamElGran(valor1, valor2)}")
}