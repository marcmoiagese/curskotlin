/**
 *
 * A Kotlin, existeix la possibilitat que l'estructura condicional "if" retorni un valor, aquesta característica no és gens comuna en altres llenguatges de programació.
 *
 * Carrega dos valors enters, emmagatzema el més gran d'ells en una nova variable i imprimeix-lo per pantalla.
 *
 */

fun main(args: Array<String>) {
    println("donam el primer valor: ")
    val val1 = readln().toInt()
    println("Donam el segon valor: ")
    val val2 = readln().toInt()

    val massagran = if (val1 > val2) val1 else val2
    println("El nes gran entre $val1 i $val2 es $massagran")
}

/**
 * Com pots veure, assignem a una variable anomenada "massagran" el valor que retorna l'expressió "if".
 * Si la condició del "if" és vera, es retorna el valor de "var1", si no ho és, es retorna el valor de "var2".
 * El compilador interpretarà que "massagran" és una variable de tipus int perquè "var1" i "var2" també ho són.
 * Les claus no cal posar-les, ja que només posem una operació, tant per quan és cert com per quan és fals.
 */