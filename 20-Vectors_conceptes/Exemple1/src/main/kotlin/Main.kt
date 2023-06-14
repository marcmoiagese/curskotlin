/**
 * Es vol guardar els salaris de 5 operaris.
 */

fun main(args: Array<String>) {
    val salaris: IntArray
    salaris = IntArray(5)

    // Carreguem els elements per teclat
    for(i in 0..4){
        print("Donam un salari: ")
        salaris[i] = readln().toInt()
    }

    // Imprimim els seus elements
    for(i in 0..4){
        println(salaris[i])
    }
}