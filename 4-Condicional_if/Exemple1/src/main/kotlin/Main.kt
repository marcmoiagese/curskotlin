/**
 *
 * Per exemple, donat el salari d'una persona i aquest supera els 1500€, mostrarem un missatge per pantalla indicant que ha de pagar impostos.
 *
 */

fun main(args: Array<String>) {
    println("Quan cobres? ")
    val salari = readln().toDouble()
    if(salari > 1500){
        println("Pagui i contribueixi al progrés del país.")
    }
}

/**
 * La paraula "if" indica que ens trobem davant d'una estructura condicional. Després, disposem de la condició entre parèntesis i,
 * finalment, entre claus d'ator, les instruccions a seguir en cas que es compleixi.
 *
 * Tingueu en compte que les claus d'ator són una forma d'indicar l'inici i el final de la condicional, però, Si la situació on es compleix només conté una línia, podem ometre les claus.
 *
 */
