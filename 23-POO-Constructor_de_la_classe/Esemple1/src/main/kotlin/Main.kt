/**
 * Desenvoluparem una classe anomenada Persona que tindra com a propietats el seu nom i edat. Plantejarem un constructor al que li arribaran com a parametres el nom i l'edat. A més a més, definirem dos metodes, un que imprimira les propietats i l'altre ens ensenyara si es major d'edat.
 */

class Persona constructor(nom: String, edat: Int){
    var nom: String  = nom
    var edat: Int = edat

    fun imprimir(){
        println("Nom: $nom i te una edat de $edat anys")
    }

    fun esMajorEdat(){
        if(edat>=18)
            println("Es major d'edat")
        else
            println("No es major d'edat")
    }
}

fun main(args: Array<String>) {
    val persona1 = Persona("Pblo", 33)
    persona1.imprimir()
    persona1.esMajorEdat()
}