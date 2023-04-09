/**
 * Quan ens trobem davant de la presa de decisions, disposem de les estructures condicionals per ajudar-nos a triar.
 * Haig d'optar per uns estudis o per uns altres? Prefereixo menjar pollastre o sopa? He de decidir entre seguir el camí A o el camí B, entre altres opcions.
 *
 * Estructura condicional simple
 * Una estructura condicional simple és quan, enfrontats a una decisió, prenem una única opció en funció d'una condició específica.
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