/**
 * Realitza un programa que llegeixi N parells de dades, cada parell de dades correspon a la mitja de la base i l'altura d'un triangle. El programa tindra d'ingormar:
 *
 * a) De cada triangle la mitja de la seva base, la seva altura i superficie
 * b) La cantitat de triangles en que la superficie sigui mes gran a 12
 */
fun main(args: Array<String>) {
    println("Quants triangles em donaras? ")
    val triangles = readln().toInt()
    var cantitat = 0

    for(i in  1..triangles){
        println("Donam la base: ")
        val base = readln().toDouble()
        println("Donam l'altura: ")
        val altura = readln().toDouble()

        val superficie = base * altura / 2
        println("La superficie es de $superficie")
        if(superficie > 12)
            cantitat++
    }
    print("La cantitat de triangules amb superficie superior a 12 son: $cantitat")

}