/**
 * Realitzarem una funció que rebi com a primer paràmetre, el tipus d'operacio que vulguem realitzar ambe amb les seguents dades enters que li enviem
 */

enum class Operacio {
    SUMA,
    PROMIG
}

fun operar(tipusOperacio: Operacio, vararg vector: Int): Int{
    when (tipusOperacio){
        Operacio.SUMA -> return vector.sum()
        Operacio.PROMIG -> return vector.average().toInt()
    }
}

fun main(args: Array<String>) {
    val resultat = operar(Operacio.SUMA, 10, 20, 30)
    println("La suma es $resultat")

    val resultat2 = operar(Operacio.PROMIG, 10, 20, 30)
    println("El promig es $resultat2")
}