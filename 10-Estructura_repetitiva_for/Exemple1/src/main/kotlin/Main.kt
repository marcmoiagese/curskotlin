/**
 * Realitza un programa que imprimeixi per pantalla els numeros del 1 al 100
 */

fun main(args: Array<String>) {
    for (i in 1..100)
        println(i)
}

/**
 * La variable 'i' es defineix de tipus 'Int' per inferència, ja que el rang és de 1..100.
 * A la primera execució del bucle, la variable 'i' obté el valor 1, a la segona el 2 i així successivament.
 */