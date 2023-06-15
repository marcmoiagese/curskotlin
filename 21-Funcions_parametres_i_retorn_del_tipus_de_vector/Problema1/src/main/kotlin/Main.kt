/**
 * Fes un programa que permeti introduir un vector de n elements, introduir n elements per teclat.
 * Fes dues funcions, una on es creo i la carregui el vector i l'altra que sumi tots els elements i retorni el valor a la funcio main on s'imprimira
 */

fun carregar(): IntArray{
    print("Cuants elements tindra el vector? ")
    val llarg = readln().toInt()
    val vector = IntArray(llarg)

    for (i in vector.indices){
        print("Introdueix un element: ")
        vector[i] = readln().toInt()
    }
    return vector
}

fun imprimir(vector: IntArray){
    println("Llistat sencer del vector")
    for(element in vector)
        println(element)
}

fun sumar (vector: IntArray): Int {
    var suma = 0
    for(element in vector)
        suma += element
    return suma;
}

fun main(args: Array<String>) {
    var vector = carregar()
    imprimir(vector)
    println("La suma de tots els seus elements es ${sumar(vector)}")
}