/**
 * Crearem una llista mutable amb les edats de diverses persones. Probarem les propietats i mètodes principals per administrar la llista mutable.
 */

fun main(args: Array<String>) {
    val edats: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12)

    println("Llista d'edats")
    println(edats)

    edats[0] = 60

    println("Llista complerta despres de modificar la primera edat")
    println(edats)

    println("Primera edat guardada a la llista")
    println(edats[0])

    println("Promig d'edats")
    println(edats.average())

    println("Afegim  una edat al final de la llista: ")
    edats.add(50)

    println("Llista d'edats")
    println(edats)

    println("Afegim una edat al inici de la llista: ")
    edats.add(0, 17)

    println("Llista d'edats")
    println(edats)

    println("Eliminem la primera edat de la llista: ")
    edats.removeAt(0)

    println("Llista d'edats")
    println(edats)

    print("Cantitat de persones majors d'edat: ")
    val cant = edats.count {it >= 18}
    println(cant)

    edats.removeAll {it == 12}
    println("Llista d'edats despres de borrar les que tenen 12 anys")
    println(edats)
    edats.clear()

    println("Llista d'edats despres de borrar la llista completa")
    println(edats)

    if (edats.isEmpty())
        println("No hi ha edats guardades a la llista")


}