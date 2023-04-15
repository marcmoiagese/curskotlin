/**
 * Fins ara hem vist els seguents operadors:
 * realcionals (>, <, >=, <=, ==, !=)
 * Matematics (+, -, *, /, %)
 *
 * Pero encara ens falten els logics && i || que principalment utilitzarem dins les estructures condicionals logiques per agrupar condicions
 * L'operador && el podem llegir com a "I" ( "Si la condicio 1" I "La condicio 2" ) es compleixen entraria
 * Això ens permet escurssar molt codi, ja que ens estalviem linies posant-ho tot dins un mateix if
 *
 * Al seguent exemple realitzarem un programa que llegeixi per teclat tres numeros i ens mostri el mes gran
 *
 */

fun main(args: Array<String>) {
    println("Donam el primer numero")
    val num1 = readln().toInt()
    println("Donam el segon numero")
    val num2 = readln().toInt()
    println("Donam el tercer numero")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3)
        print(num1)
    else
        if(num2>num3)
            print(num2)
        else
            print(num3)

}