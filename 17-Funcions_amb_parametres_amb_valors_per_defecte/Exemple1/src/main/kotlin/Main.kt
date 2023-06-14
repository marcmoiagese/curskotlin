/**
 * Fes una funció que rebi un string com a paràmetre i, opcionalment, un segon string amb un caràcter. La funció ha d'imprimir el string subratllat amb el caràcter indicat pel segon paràmetre.
 */

fun titolSubrallat(titol: String, caracter: String = "*"){
    println(titol)
    for(i in 1..titol.length)
        print(caracter)
    println()
}

fun main(args: Array<String>) {
    titolSubrallat("Aqui posarem un text llarg")
    titolSubrallat("Aqui posarem un altre exemple", "-")
}