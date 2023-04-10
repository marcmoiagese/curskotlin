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