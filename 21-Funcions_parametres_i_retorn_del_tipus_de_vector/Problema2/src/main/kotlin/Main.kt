/**
 * Carrega un vector de n elements, imprimir el menor i un missatge si es repeteix dins el vector
 */


fun carrego(): IntArray {
    print("Cuants elements tindra el vector: ")
    val cantitat = readln().toInt()
    val vector = IntArray(cantitat)

    for (i in vector.indices){
        print("Introdueix un valor: ")
        vector[i] = readln().toInt()
    }
    return vector
}

fun petit(vector: IntArray): Int {
    var petit = vector[0]
    for (element in vector)
        petit = element
    return petit
}

fun repeticions(vector: IntArray, buscar: Int): Boolean {
    var cant = 0
    for (element in vector)
        if(element == buscar)
            cant++
    if (cant > 1)
        return true
    else
        return false
}

fun main(args: Array<String>) {
    var vector = carrego()
    println("El mes petit es: ${petit(vector)}")

    if(repeticions(vector,petit(vector)))
        println("Es repeteix")
    else
        println("No es repeteix")
}