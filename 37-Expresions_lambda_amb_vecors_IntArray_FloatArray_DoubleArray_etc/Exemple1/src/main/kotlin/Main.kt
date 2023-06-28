/**
 * Crearem un objecte de la classe IntArray de 20 elements amb valors aleatoris compresos entre 0 i 10. del vector imprimirem les següents causistiques:
 * - tots els elements
 * - Cantitat d'elements menors o iguals a 5
 * - Imprimirem un missatge si tots els elements son meonors o iguals a 9
 * - Imprimirem un missatge si al menys un dels elements del vector guarda un 10
 */

fun main(args: Array<String>) {
    var vector = IntArray(20) { (Math.random() * 11).toInt()}
    println("Llista completa del vector")
    for  (element in vector)
        print("$element - ")
    println()
    val cant1 = vector.count {it <= 5}
    println("Cantitat d'elements menors o iguals a 5: $cant1")
    if(vector.all {it <= 9})
        println("Tots els elements son menors o iguals a 9")
    else
        println("No tots els elements son menors o iguals a 9")
    if (vector.any {it == 10})
        println("Al menys un dels elements es un 10")
    else
        println("Tots els elements son diferents a 10")
}