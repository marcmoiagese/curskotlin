/**
 * Crearem un objecte de la classe IntArray de 20 elements amb valors aleatoris compresos entre 0 i 10. del vector imprimirem les següents causistiques:
 * - tots els elements
 * - Cantitat d'elements menors o iguals a 5
 * - Imprimirem un missatge si tots els elements son meonors o iguals a 9
 * - Imprimirem un missatge si al menys un dels elements del vector guarda un 10
 */

// PEr resoldre aquest problema utilitzem un seguit d'algoritmes que ens proveeix la classe IntArray
fun main(args: Array<String>) {
    // Definim un objecte de classe IntArray de 20 elements i li passem una expresió lambda per generar valors aleatoris comresos entre 0 i 10
    var vector = IntArray(20) { (Math.random() * 11).toInt()}

    println("Llista completa del vector")

    // Aqui a través d'un for imprimim tot el vector
    for  (element in vector)
        print("$element - ")

    println() // Res importan nomes posem un salt de linea

    // Per comptar la cantitat d'elements iguals a 5 la classe IntArray, te un mètode anomenat count que te un unic paràmetre de tipus funció
    val cant1 = vector.count {it <= 5}


    println("Cantitat d'elements menors o iguals a 5: $cant1")

    // La condició "all" ens ajuda a validar si tots els valors dins el vector son mes petits o iguals que 9
    if(vector.all {it <= 9})
        println("Tots els elements son menors o iguals a 9")
    else
        println("No tots els elements son menors o iguals a 9")

    // D'altra banda la condicio "any" ens 
    if (vector.any {it == 10})
        println("Al menys un dels elements es un 10")
    else
        println("Tots els elements son diferents a 10")
}