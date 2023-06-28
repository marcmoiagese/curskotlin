import java.lang.StringBuilder

/**
 * Farem una funcio d'ordre superior que rebi un String i una funció amb un paràmetre de tipo Char que retorni un Boolean. La funció te d'analitzar cada element del String cridan a la funció que rep com a paràmetre, si retorna un true s'afegira el caracter esmentat al String que retornara.
 *
 * A la funció main definirem un String amb una cadena cualsevol.
 *
 * Cridar a la funció d'ordre superior i pasar expresions lambdas per filtrar i generar un altre Stringa amb les seguents restriccions:
 *
 *     Un String nomes amb les vocals
 *     Un String nomes amb els caracters en minúscules
 *     Un String amb tots els caracters no alfabetics.
 *
 */

fun filtrar(cadena: String, fn: (Char) -> Boolean): String {
    val cad = StringBuilder()
    for(ele in cadena)
        if (fn(ele))
            cad.append(ele)
    return cad.toString()
}

fun main(args: Array<String>) {
    val cadena= "Aoxò es la proba 1 o la proba 2?"
    println("String original")

    println(cadena)
    val resultat1 = filtrar(cadena){
        if (it ==  'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U' )
            true
        else
            false
    }
    println("Nomes les vocals")
    println(resultat1)

    var resultat2 = filtrar(cadena) {
        if(it in 'a'..'z')
            true
        else
            false
    }
    println("Nomes els caracters en minuscules")
    println(resultat2)

    var resultat3 = filtrar(cadena) {
        if(it !in 'a'..'z' && it !in 'A'..'Z')
            true
        else
            false
    }
    println("Nomes els caracters que no son alfabètics")
    println(resultat3)
}