/**
 * Introdueix els salaris de 10 treballadors per teclat. Mostrarem per pantalla un missatge en funció del valor del sou
 * - "Salari alt" si es > 5000
 * - "Salari mitja" si es <= 5000 i > 2000
 * - "Salari baix" si es <= 2000
 * a més a més mostrar el total acumulat de gastos en salaris alts
 */

fun main(args: Array<String>) {
    var total = 0

    for (i in 1..10){
        print("Donam el salari del treballador  $i: ")
        val salari = readln().toInt()

        total += when {
            salari > 5000 -> {
                println("Salari alt")
                salari
            }
            salari > 2000 -> {
                println("Salari mig")
                0
            }
            else -> {
                println("Salari baix")
                0
            }
        }
        println("El cost de salari alt es: $total")
    }
}