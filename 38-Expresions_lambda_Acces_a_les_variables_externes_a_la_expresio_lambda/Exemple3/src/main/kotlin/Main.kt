/**
 * Declararem una classe Persona amb les propietats nom i edat, definirem com a metodes la seva impresio i una altra que retorni true si es major d'edat o false en cas contrari.
 * A la funció main, definirem un vector amb cuatre elements de tipus Persona.
 * Calcularem cuantes persones son majors d'edat cridan al mètode forEach de la classe Array.
 */

class Persona(val nom: String, val edat: Int){
    fun imprimir(){
        println("Nom: $nom Edat: $edat")
    }

    fun esMajor() = if (edat >= 18) true else false
}

fun main(args: Array<String>) {
    val persones: Array<Persona>  = arrayOf(Persona("ana", 22),
        Persona("Joan", 13),
        Persona("carlos", 6),
        Persona("maria", 72))
    println("Llista de persones")
    for(per in persones)
        per.imprimir()

    var cant = 0
    persones.forEach{
        if(it.esMajor())
            cant++
    }
    println("La cantitat de persones majors d'edat: $cant")
}