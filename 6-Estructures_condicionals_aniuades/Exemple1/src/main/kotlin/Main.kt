/**
 * Diguem que una estructura és acollida quan, tant per la branca de veritat com per la de fals d'una estructura condicional, apareix una altra estructura condicional.
 * L'exemple següent ens mostrarà un programa que sol·licita tres números per teclat i calcula la seva mitjana. Posteriorment, imprimeix un dels missatges següents:
 * Si el promig es >=7 imprimiras "Promocionat"
 * Si el promig es >=4 i < 7 imprimiras "meh"
 * Si el promig es <4 imprimiras "cap a casa passarell"
 */

fun main(args: Array<String>) {
    println("Nota 1: ")
    val nota1 = readln().toInt()
    println("Nota 2: ")
    val nota2 = readln().toInt()
    println("Nota 3: ")
    val nota3 = readln().toInt()
    val promig = (nota1+nota2+nota3) / 3
    if( promig >= 7 ){
        println("Promocionat")
    }else{
        if(promig >=4){
            println("meh")
        }else{
            println("cap a casa passarell")
        }
    }
}