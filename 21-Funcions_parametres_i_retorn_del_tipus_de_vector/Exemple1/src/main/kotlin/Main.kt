/**
 * Defineix a la funció main un vector d'enters de 5 elements. Declara dos funcions, a una efectua la càrrega dels elements i a l'altra imprimeix els elements.
 */

fun carregar(vector: IntArray){
    for(i in vector.indices){
        print("Introdueix l'element: ")
        vector[i] = readln().toInt()
    }
}

fun imprimir(vector: IntArray){
    for( element in vector )
        println(element)
}

fun main(parametre: Array<String>) {
    val vector = IntArray(5)
    carregar(vector)
    imprimir(vector)
}