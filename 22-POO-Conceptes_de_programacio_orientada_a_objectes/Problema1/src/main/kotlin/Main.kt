/**
 * Fes una classe anomenada Alumne que tingui com a propietats el seu nom i la seva nota.
 * * Defineix els mètodes per inicialitzar les seves propietats per teclat.
 * * Imprimeix les propietats
 * * I imprimeix un missatge si esta regular ( mes gran o igual a 5 )
 *
 * Defineix dos objectes de classe Alumne
 */

class Alumne(){
    var nom: String = ""
    var nota: Int = 0

    fun inicialitza(){
        println("Introdueix el nom: ")
        nom = readln().toString()

        println("Dona'm la nota: ")
        nota = readln().toInt()
    }

    fun imprimeix(){
        println("L'alumne $nom te una nota de: $nota")
    }

    fun mitjanaAlumne(){
        if(nota >= 5)
            println("Regular")
    }
}

fun main(args: Array<String>) {
    var al1 = Alumne()
    al1.inicialitza()
    al1.imprimeix()
    al1.mitjanaAlumne()

    var al2 = Alumne()
    al2.inicialitza()
    al2.imprimeix()
    al2.mitjanaAlumne()
}