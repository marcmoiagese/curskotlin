/**
 * Fes un programa que llegeixi  els costats de N triangles i informar:
 * a) De cada un d'ells, quin tipus de triangle es: equilater, isóceles o escalè
 * b) La cantitat de cada triangle
 */

fun main(args: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    print("Donam la cuantitat de triangles: ")
    val n = readln().toInt()

    for(i in 1..n){
        print("Donam el primer costat: ")
        val costat1 = readln().toInt()

        print("Donam el costat 2:")
        val costat2 =  readln().toInt()

        print("Donam el costat 3:")
        val costat3 =  readln().toInt()

        if(costat1==costat2 && costat1==costat3){
            println("Es triangle equilater")
            cant1++
        }else
            if(costat1==costat2 || costat1==costat3 || costat2==costat3){
                println("Es un triangle isóceles.")
                cant2++
            }else{
                println("Es un triangle escaler")
                cant3++
            }
    }
    println("Cantitat de triangles equilaters: $cant1")
    println("Cantitat de triangles Isoceles: $cant2")
    println("Cantitat de triangles escalers: $cant3")
}