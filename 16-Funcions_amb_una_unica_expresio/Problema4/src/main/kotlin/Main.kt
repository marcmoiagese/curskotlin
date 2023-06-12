/**
 * Fes una funció que li passem com a parametre un String i ens retorni la cantitat de caracters que te. A la funció main demanarem la carrega dels noms per teclat i cridar la funció dues vegades. Imprimir al main quin de les dos paraules te mes caractersFes una funció que prengui com a paràmetre un String i retorni la quantitat de caràcters que té.
 * A la funció main demanarem l'entrada dels noms per teclat i cridarem la funció dues vegades.
 */

fun llargaria(variable: String) = variable.length

fun main(args: Array<String>) {
    println("Donam el primer nom: ")
    val nom1 = readln().toString()
    println("Donam el segon nom: ")
    val nom2 = readln().toString()

    if ( llargaria(nom1) == llargaria(nom2) )
        println("Els dos noms son iguals")
    else
        if (llargaria(nom1) > llargaria(nom2))
            println("nom1 es el mes gran")
        else
            println("nom2 es el mes gran")

}