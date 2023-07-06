/**
 * Realitzarem una funció que rebi com a primer paràmetre, el tipus d'operacio que vulguem realitzar ambe amb les seguents dades enters que li enviem
 */

// Declarem la funció amb dos valors possibles
enum class Operacio {
    SUMA,
    PROMIG
}

// A la  funció Operar li enviem com a parametre un tupis de dada Operació i com a segon parametre sera la llista de parametres a processar
fun operar(tipusOperacio: Operacio, vararg vector: Int): Int{
    when (tipusOperacio){
        Operacio.SUMA -> return vector.sum()
        Operacio.PROMIG -> return vector.average().toInt()
    }
}

fun main(args: Array<String>) {
    // Cuan crirem operar, com a primera dada el tipus d'operacio que volem fer seguit de la llista d'enters
    val resultat = operar(Operacio.SUMA, 10, 20, 30)
    println("La suma es $resultat")

    // Cuan crirem operar, com a primera dada el tipus d'operacio que volem fer seguit de la llista d'enters
    val resultat2 = operar(Operacio.PROMIG, 10, 20, 30)
    println("El promig es $resultat2")
}