/**
 * Podem simplificar encara més l'exemple anterior utilitzant 'if' com a expressió.
 */

fun main(args: Array<String>) {
    println("Nota 1: ")
    val nota1 = readln().toInt()
    println("Nota 2: ")
    val nota2 = readln().toInt()
    println("Nota 3: ")
    val nota3 = readln().toInt()
    val promig = (nota1+nota2+nota3) / 3

    val estat = if (promig >= 7) "Promocionat" else if (promig >=4) "meh" else "cap a casa passarell"
    print(estat)
}