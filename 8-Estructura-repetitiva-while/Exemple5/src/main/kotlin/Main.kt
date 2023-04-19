/**
 * Escriu un programa que sol·liciti 10 notes d'alumnes i ens informi de quantes tenen notes més grans o iguals a 7 i quantes en tenen de menors a 7.
 */

fun main(args: Array<String>) {
    var grans = 0
    var petites = 0
    var x = 1
    while (x <= 10){
        println("Dona'm notes: ")
        val nota = readln().toDouble()
        if(nota >= 7 )
            grans++
        else
            petites++
        x++
    }
    println("Hi Ha $grans alumnes amb una nota superior a 7 i $petites amb una nota mes petita")
}