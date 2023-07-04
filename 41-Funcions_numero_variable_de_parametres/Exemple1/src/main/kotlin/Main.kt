/**
 * Farem una funció que rebi una cantitat variable d'enters i ens retorni la seva suma
 */

// La funcio sumar rep un parametre amb un numero variable d'elements
fun sumar(vararg numeros: Int): Int{
    //Dins recorrem el vector i sumem els seus elements
    var suma = 0
    for (element in numeros)
        suma += element
    return suma
}

fun main(args: Array<String>) {

    // Cridem la funcio sumar enviant-li els X elements
    val total = sumar(10, 20, 30, 40, 50)
    println(total)
}