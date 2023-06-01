/**
 * Fes un programa que demani per teclat tres notes d'un alumne, calcula el promig i imprimeix algun dels següents missatges
 * si el promig es >=7 imprimmir promocionat
 * si el promig es >=4 i <7 imprimir regular
 * si el promig es <4 imprimir reaprobat
 */
fun main(args: Array<String>) {
    print("Donam la primera nota: ")
    val nota1 = readln().toInt()

    print("Donam la segona nota: ")
    val nota2 = readln().toInt()

    print("Donam la tercera nota: ")
    val nota3 = readln().toInt()

    val promig = (nota1+nota2+nota3) / 3
    when {
        promig >= 7 ->  print("Promocionat")
        promig >= 4 -> print("Regulin")
        else -> print("Lliure")
    }
}