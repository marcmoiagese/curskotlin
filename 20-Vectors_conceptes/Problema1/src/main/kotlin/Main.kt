/**
 * Desenvolupa un programa que permeti ingressar un vector de 8 elements enters, i informi:
 * El valor acumulat de tots els elements.
 * El valor acumulat dels elements que siguin mes grans a 36.
 * La cantitat de valors mes grans a 50.
 * Definir dos for, al primer realitzar la carrega i al segon procedir a analitzar cada element)
 */

fun main(args: Array<String>) {
    var valors = IntArray(8)

    for(i in valors.indices){
        print("Introdueix element: ")
        valors[i] = readln().toInt()
    }

    var suma = 0
    var sumaMesgran36 = 0
    var sumaMesGran50 = 0

    for(element in valors){
        suma += element
        if (element > 30)
            sumaMesgran36 += element
        if (element > 50)
            sumaMesGran50++
    }
    println("Valor acumulat del vector: $suma")
    println("Valor acumulat dels elements mes grans a 36 son: $sumaMesgran36")
    println("Cantitat d'elements mes grans a 50: $sumaMesGran50")

}