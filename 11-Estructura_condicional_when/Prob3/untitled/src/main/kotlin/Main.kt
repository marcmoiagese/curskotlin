/**
 * Fes un programa que llegeixi els costats de n triangles i informi:
 * a) De cada un d'ells, quin tipus de triangle és: equilàter (que té tres costats iguals), isòsceles (que té dos costats iguals) o escalè (cap costat és igual).
 * b) Quantitat de triangles de cada tipus.
 */

fun main(args: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    print("Quants triangles vols posar?: ")
    val n = readln().toInt()
    for(i in 1..n) {
        print("Donam el costat 1:")
        val costat1 = readln().toInt()
        print("Donam el costat 2:")
        val costat2 = readln().toInt()
        print("Donam el costat 3:")
        val costat3 = readln().toInt()
        when {
            costat1 == costat2 && costat1 == costat3 -> {
                println("Es un triangule equilater.")
                cant1++
            }
            costat1 == costat2 || costat1 == costat3 || costat2 == costat3 -> {
                println("Es un triángule isòsceles.")
                cant2++
            }
            else -> {
                println("Es un triangule escalè.")
                cant3++
            }
        }
    }
    println("Cuantitat de triangles equilaters: $cant1")
    println("Cuantitat de triangles isòsceles: $cant2")
    println("Cuantitat de triangles escalè: $cant3")
}