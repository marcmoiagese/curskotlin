/**
 * Fes una classe Club i una classe Soci
 * La classe soci te que tenir les seguents propietats: nom i l'antiguitat al club en anys
 * El constructor de la classe soci fa que arribi el nom i la seva antiguitat.
 * La classe  club ha de tenir com a propietats 3 objectes de la classe soci.
 * Defineix un mètode de la classe club per imprimir el nomm del soci amb mes antiguitat al club
 * Imprimeix tambe el nom des socis
 */

class Club{
    val soci1 = Soci("David",25)
    val soci2 = Soci("Marià",28)
    val soci3 = Soci("Clara",30)

    fun antic(){
        soci1.imprimir()
        soci2.imprimir()
        soci3.imprimir()
        println("El soci mes gran es: ")
        when {
            soci1.antiguitat > soci2.antiguitat && soci1.antiguitat > soci3.antiguitat -> println(soci1.nom)
            soci1.antiguitat < soci2.antiguitat && soci2.antiguitat > soci3.antiguitat -> println(soci2.nom)
            else -> println(soci3.nom)

        }
    }
}

class Soci(var nom: String, var antiguitat: Int){
    fun imprimir(){
        println("$nom te  una antiguitat de $antiguitat")
    }

}


fun main(args: Array<String>) {
    val club1 = Club()
    club1.antic()
}