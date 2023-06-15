/**
 * Enmagatzemarem els salaris d'operaris. Cuan s'executi el programa es te que demanar la cantitat de salaris a introduir, despres crearem un vector amb el tamany. Defineix una funció de carrega i una altra d'impresió
 */

fun carregar(): IntArray {
    print("Cuants salaris vols carregar: ")
    val cantitat = readln().toInt()

    val salaris = IntArray(cantitat)
    for(i in salaris.indices){
        print("Introdueix un valor: ")
        salaris[i] = readln().toInt()
    }
    return salaris
}

fun imprimir(salaris: IntArray){
    println("Llista tots els salaris")
    for(salari in salaris)
        println(salari)
}

fun main(args: Array<String>) {
    val salaris = carregar()
    imprimir(salaris)
}