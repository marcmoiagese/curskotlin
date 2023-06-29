/**
 * Agregarem una funció a la classe IntArray que permeti imprimir tots els seus components a una línea.
 */

fun IntArray.imprimir(){
    print("[")
    for(element in this){
        print("$element - ")
    }
    println("]");
}

fun main(args: Array<String>) {
    val vector1 = IntArray(10, {it})
    vector1.imprimir()
}