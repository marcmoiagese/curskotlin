/**
 * Estructura condicional composta
 * Son les que quan tenim que pendre la desició podem realitzar mes d'una acció
 */

fun main(args: Array<String>) {
    print("Dona'm el primer valor: ")
    val val1 = readln().toInt()
    print("Dona'm el segon valor: ")
    val val2 = readln().toInt()
    if (val1 > val2)
        print("El valor mes gran es $val1")
    else
        print("El valor mes gran es $val2")
}

/**
 * Només es pot passar variables, valors constants i operadors relacionals com a paràmetres a una condició.
 *
 * Com a operadors relacionals tenim:
 * >  (Mes gran que)
 * <  (Mes petit que)
 * >= (Mes gran o igual que)
 * <= (Mes petit o igual que)
 * == (Igual)
 * != (Diferent)
 * + (mes)
 * - (menys)
 * * (producte)
 * / (divisió)
 * % (resta d'una divisió)
 *
 */