/**
 * En aquest cas optimitzarem el mateix exemple del Main per que sigui mes concís
 * Farem una funció que rebi una cantitat variable d'enters i ens retorni la seva suma
 */

// La funcio sumar rep un parametre amb un numero variable d'elements i els suma entre ells
fun sumar(vararg numeros: Int) = numeros.sum()

fun main(args: Array<String>) {

    // Cridem la funcio sumar enviant-li els X elements
    val total = sumar(10, 20, 30, 40, 50)
    println(total)
}