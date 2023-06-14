/**
 * Carrega un vector de 10 elements de tipus enter i verifica posteriorment si el mateix esta ordenat de menor a major
 */

fun main(args: Array<String>) {
    val vector = IntArray(10)
    for(i in 0..vector.size-1){
        print("donam un numero: ")
        vector[i] = readln().toInt()
    }

    var ordenat = true
    for (i in 0..vector.size-2)
        if(vector[i+1]<vector[i]) {
            ordenat = false
            break
        }

    if(ordenat)
        print("Els elements estan ordenats de mes petit a mes gran")
    else
        print("Els elements no estan ordenats de mes petit a mes gran")
}