/**
 * Farem una data class anomenada Alumne que guardi el seu numero de document i el seu nom Despres a una classe curs, definirem un vector amb 3 objectes de la classe Alumne.
 * Sobrecarregarem l'operador in per validar si un numero de document es troba inscrit al curs.
 */

data class Alumne (val document: Int, val nom: String)

class Curs {
    val alumnes = arrayOf(Alumne(123456, "Marc"),
                          Alumne(666666, "Anna"),
                          Alumne(777777, "Lluis"))

    operator fun contains (document: Int): Boolean {
        return alumnes.any {document == it.document}
    }
}

fun main(args: Array<String>) {
    val curs1 = Curs()
    if (123456 in curs1)
        println("L'alumne Marc esta inscrit al curs")
    else
        println("L'alumne Marc no esta inscrit al curs")
}