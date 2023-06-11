/**
 * Fes una funció que rebi tres enters i ens mostri el més gran d'ells. La càrrega dels valors es farà per teclat des de la funció main.
 */

fun ensenyamElGran(v1: Int, v2: Int, v3: Int ){
    print("Mes gran es: ")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
        else
            print(v3)
}

fun main(args: Array<String>) {
    println("Donam el primer numero: ")
    val valor1 = readln().toInt()

    println("Donam el segon numero: ")
    val valor2 = readln().toInt()

    println("Donam el tercer valor: ")
    val valor3 = readln().toInt()

    ensenyamElGran(valor1, valor2, valor3)
}