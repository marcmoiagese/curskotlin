/**
 * Farem una funció que rebi una cantitat variable d'enters i ens retorni la seva suma
 */

fun sumar(vararg numeros: Int): Int{
    var suma = 0
    for (element in numeros)
        suma += element
    return suma
}

fun main(args: Array<String>) {
    val total = sumar(10, 20, 30, 40, 50)
    println(total)
}