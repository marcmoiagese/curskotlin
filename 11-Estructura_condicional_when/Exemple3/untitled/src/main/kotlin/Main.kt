/**
 * Fes un programa que permeti ingresar el pes en kg de peces. El proces acabara quan donem el valor 0. Es te que informar:
 * a) Cuantes peces tenen un pes entre 9,8Kg i 10,2 KG, Cuantes amb mes de 10,2KG i cuantes amb ,enys de 9,8Kg
 * b) La cantitat total de peces processades.
 */

fun main(args: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0

    do{
        println("Donam el pes de la pesa, prem 0 per finalitzar")
        val pes = readln().toDouble()
        when {
            pes > 10.2 -> cant1++
            pes >= 9.8 -> cant2++
            pes > 0 -> cant3++
        }
    } while (pes != 0.0)

    println ("peces aptes: $cant2")
    println ("peces amb un pes superior a 10.2 : $cant1")
    println ("peces amb un pes inferior a 9.8 : $cant3")
    val suma = cant1+cant2+cant3
    println("La cantitat total de peces processades es: $suma")
}