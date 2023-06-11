/**
 * Fes una aplicació que demani 2 enters i mostri la seva suma
 * Repeteix la carrega i impresio de la suma 5 vegades
 * Imprimeix una linea separadora despres de cada cop que carreguem dos valors i la seva suma.
 */


fun suma(){
    print("Donam el valor: ")
    val valor1 = readln().toInt()

    print("Donam el segon valor: ")
    val valor2 = readln().toInt()

    val suma = valor1 + valor2
    println("La suma dels valors es: $suma")
}

fun separador(){
    println("********************************************************")
}

fun main(args: Array<String>) {
    for (i in 1..5){
        suma()
        separador()
    }
}