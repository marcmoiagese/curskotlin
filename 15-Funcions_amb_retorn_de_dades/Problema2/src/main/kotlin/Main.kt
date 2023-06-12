/**
 * Fes una funció que ens doni el perímetre d'un quadrat enviant-li com a paràmetre el valor del costat.
 */

fun perimetre(v1: Int): Int{
    var perim = v1 * v1
    return perim
}

fun main(args: Array<String>) {
    println("Donam el costat del cuadrat per calcular l'area: ")
    var perm = readln().toInt()

    println("El perimetre es ${perimetre(perm)}")
}