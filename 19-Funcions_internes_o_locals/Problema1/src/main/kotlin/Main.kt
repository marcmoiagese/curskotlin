/**
 * Crea una funció que permeti carregar dos enters i ens imprimeixi el mes gran d'ells, Realiitza aquesta activitats amb 5 parells de valors. fes una funció interna que retorni el mes gran de dos enters
 */

fun ensenyamElGran(){
    fun gran(x1: Int, x2: Int) = if (x1 > x2) x1 else x2

    for( i in 1..5){
        print("Donam el primer valor: ")
        val valor1 = readln().toInt()

        print(" Donam el segon valor: ")
        val valor2 = readln().toInt()

        print(" El mes gran entre $valor1 i $valor2 es ${gran(valor1, valor2)} ")
    }
}

fun main(args: Array<String>) {
    ensenyamElGran()
}