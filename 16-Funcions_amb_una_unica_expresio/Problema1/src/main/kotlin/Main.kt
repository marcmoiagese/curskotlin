/**
 * Escriu una funció que rebi tres enters i ens retorni el valor promig
 */

fun promig(valor1: Int, valor2: Int, valor3: Int) = (valor1+valor2+valor3)/3

fun main(args: Array<String>) {
    println("Donam el nummero 1: ")
    val var1 = readln().toInt()
    println("Donam el nummero 2: ")
    val var2 = readln().toInt()
    println("Donam el nummero 3: ")
    val var3 = readln().toInt()

    println("El promig dels tres valors es ${promig(var1,var2,var3)}")
}